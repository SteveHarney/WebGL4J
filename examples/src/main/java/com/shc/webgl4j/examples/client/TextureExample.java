package com.shc.webgl4j.examples.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import org.joml.Matrix4f;

import static com.shc.webgl4j.client.WebGL10.*;

/**
 * @author Sri Harsha Chilakapati
 */
public class TextureExample extends Example
{
    private int programID;
    private Matrix4f projView;

    public TextureExample(Canvas canvas)
    {
        super(canvas);
    }

    @Override
    public void init()
    {
        context.makeCurrent();
        glClearColor(0, 0, 0, 1);

        // The vertex shader source
        String vsSource = "precision mediump float;                             \n" +
                          "                                                     \n" +
                          "uniform mat4 proj;                                   \n" +
                          "                                                     \n" +
                          "attribute vec2 position;                             \n" +
                          "attribute vec2 texCoords;                            \n" +
                          "                                                     \n" +
                          "varying vec2 vTexCoords;                             \n" +
                          "                                                     \n" +
                          "void main()                                          \n" +
                          "{                                                    \n" +
                          "    vTexCoords = texCoords;                          \n" +
                          "    gl_Position = proj * vec4(position, 0.0, 1.0);   \n" +
                          "}";

        // The fragment shader source
        String fsSource = "precision mediump float;                         \n" +
                          "                                                 \n" +
                          "uniform sampler2D tex;                           \n" +
                          "                                                 \n" +
                          "varying vec2 vTexCoords;                         \n" +
                          "                                                 \n" +
                          "void main()                                      \n" +
                          "{                                                \n" +
                          "    gl_FragColor = texture2D(tex, vTexCoords);   \n" +
                          "}";

        // Create the vertex shader
        int vsShaderID = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(vsShaderID, vsSource);
        glCompileShader(vsShaderID);

        // Create the fragment shader
        int fsShaderID = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(fsShaderID, fsSource);
        glCompileShader(fsShaderID);

        // Create the program
        programID = glCreateProgram();
        glAttachShader(programID, vsShaderID);
        glAttachShader(programID, fsShaderID);
        glLinkProgram(programID);
        glUseProgram(programID);

        glBindAttribLocation(programID, 0, "position");
        glBindAttribLocation(programID, 1, "texCoords");

        // Create the positions VBO
        float[] vertices =
                {
                        -0.8f, +0.8f,
                        +0.8f, +0.8f,
                        -0.8f, -0.8f,
                        +0.8f, +0.8f,
                        +0.8f, -0.8f,
                        -0.8f, -0.8f
                };

        int vboPosID = glCreateBuffer();
        glBindBuffer(GL_ARRAY_BUFFER, vboPosID);
        glBufferData(GL_ARRAY_BUFFER, vertices, GL_STATIC_DRAW);

        glEnableVertexAttribArray(0);
        glVertexAttribPointer(0, 2, GL_FLOAT, false, 0, 0);

        // Create the texcoords VBO
        float[] texCoords =
                {
                        0, 0,
                        1, 0,
                        0, 1,
                        1, 0,
                        1, 1,
                        0, 1
                };

        int vboTexID = glCreateBuffer();
        glBindBuffer(GL_ARRAY_BUFFER, vboTexID);
        glBufferData(GL_ARRAY_BUFFER, texCoords, GL_STATIC_DRAW);

        glEnableVertexAttribArray(1);
        glVertexAttribPointer(1, 2, GL_FLOAT, false, 0, 0);

        final Image image = new Image("texture.png");
        image.addLoadHandler(new LoadHandler()
        {
            @Override
            public void onLoad(LoadEvent event)
            {
                int texID = glCreateTexture();
                glBindTexture(GL_TEXTURE_2D, texID);

                glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, GL_RGBA, GL_UNSIGNED_BYTE, image);

                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
                glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR);

                glUniform1i(glGetUniformLocation(programID, "tex"), 0);
            }
        });
        image.setVisible(false);
        RootPanel.get().add(image);

        projView = new Matrix4f();
    }

    private float angle = 0;

    @Override
    public void render()
    {
        context.makeCurrent();

        angle++;

        projView.setPerspective((float) Math.toRadians(70), 640f / 480f, 0.1f, 100)
                .translate(0, 0, -2)
                .rotateY((float) Math.toRadians(angle))
                .rotateZ((float) Math.toRadians(angle));

        glUniformMatrix4fv(glGetUniformLocation(programID, "proj"), false, projView.get(new float[16]));

        glClear(GL_COLOR_BUFFER_BIT);
        glDrawArrays(GL_TRIANGLES, 0, 6);
    }
}
