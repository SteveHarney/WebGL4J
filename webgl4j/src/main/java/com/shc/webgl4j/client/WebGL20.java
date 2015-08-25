/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Sri Harsha Chilakapati
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.shc.webgl4j.client;

import com.google.gwt.canvas.client.Canvas;
import com.google.gwt.dom.client.CanvasElement;

/**
 * @author Sri Harsha Chilakapati
 */
public final class WebGL20
{
    public static final int GL_ACTIVE_UNIFORM_BLOCKS                         = 0x8A36;
    public static final int GL_ALREADY_SIGNALED                              = 0x911A;
    public static final int GL_ANY_SAMPLES_PASSED                            = 0x8C2F;
    public static final int GL_ANY_SAMPLES_PASSED_CONSERVATIVE               = 0x8D6A;
    public static final int GL_COLOR                                         = 0x1800;
    public static final int GL_COLOR_ATTACHMENT1                             = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT10                            = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11                            = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12                            = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13                            = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14                            = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15                            = 0x8CEF;
    public static final int GL_COLOR_ATTACHMENT2                             = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3                             = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4                             = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5                             = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6                             = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7                             = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8                             = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9                             = 0x8CE9;
    public static final int GL_COMPARE_REF_TO_TEXTURE                        = 0x884E;
    public static final int GL_COMPRESSED_R11_EAC                            = 0x9270;
    public static final int GL_COMPRESSED_RG11_EAC                           = 0x9272;
    public static final int GL_COMPRESSED_RGB8_ETC2                          = 0x9274;
    public static final int GL_COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2      = 0x9276;
    public static final int GL_COMPRESSED_RGBA8_ETC2_EAC                     = 0x9278;
    public static final int GL_COMPRESSED_SIGNED_R11_EAC                     = 0x9271;
    public static final int GL_COMPRESSED_SIGNED_RG11_EAC                    = 0x9273;
    public static final int GL_COMPRESSED_SRGB8_ALPHA8_ETC2_EAC              = 0x9279;
    public static final int GL_COMPRESSED_SRGB8_ETC2                         = 0x9275;
    public static final int GL_COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2     = 0x9277;
    public static final int GL_CONDITION_SATISFIED                           = 0x911C;
    public static final int GL_COPY_READ_BUFFER                              = 0x8F36;
    public static final int GL_COPY_READ_BUFFER_BINDING                      = 0x8F36;
    public static final int GL_COPY_WRITE_BUFFER                             = 0x8F37;
    public static final int GL_COPY_WRITE_BUFFER_BINDING                     = 0x8F37;
    public static final int GL_CURRENT_QUERY                                 = 0x8865;
    public static final int GL_DEPTH                                         = 0x1801;
    public static final int GL_DEPTH24_STENCIL8                              = 0x88F0;
    public static final int GL_DEPTH32F_STENCIL8                             = 0x8CAD;
    public static final int GL_DEPTH_COMPONENT24                             = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32F                            = 0x8CAC;
    public static final int GL_DEPTH_STENCIL                                 = 0x84F9;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT                      = 0x821A;
    public static final int GL_DRAW_BUFFER0                                  = 0x8825;
    public static final int GL_DRAW_BUFFER1                                  = 0x8826;
    public static final int GL_DRAW_BUFFER10                                 = 0x882F;
    public static final int GL_DRAW_BUFFER11                                 = 0x8830;
    public static final int GL_DRAW_BUFFER12                                 = 0x8831;
    public static final int GL_DRAW_BUFFER13                                 = 0x8832;
    public static final int GL_DRAW_BUFFER14                                 = 0x8833;
    public static final int GL_DRAW_BUFFER15                                 = 0x8834;
    public static final int GL_DRAW_BUFFER2                                  = 0x8827;
    public static final int GL_DRAW_BUFFER3                                  = 0x8828;
    public static final int GL_DRAW_BUFFER4                                  = 0x8829;
    public static final int GL_DRAW_BUFFER5                                  = 0x882A;
    public static final int GL_DRAW_BUFFER6                                  = 0x882B;
    public static final int GL_DRAW_BUFFER7                                  = 0x882C;
    public static final int GL_DRAW_BUFFER8                                  = 0x882D;
    public static final int GL_DRAW_BUFFER9                                  = 0x882E;
    public static final int GL_DRAW_FRAMEBUFFER                              = 0x8CA9;
    public static final int GL_DRAW_FRAMEBUFFER_BINDING                      = 0x8CA6;
    public static final int GL_DYNAMIC_COPY                                  = 0x88EA;
    public static final int GL_DYNAMIC_READ                                  = 0x88E9;
    public static final int GL_FLOAT_32_UNSIGNED_INT_24_8_REV                = 0x8DAD;
    public static final int GL_FLOAT_MAT2x3                                  = 0x8B65;
    public static final int GL_FLOAT_MAT2x4                                  = 0x8B66;
    public static final int GL_FLOAT_MAT3x2                                  = 0x8B67;
    public static final int GL_FLOAT_MAT3x4                                  = 0x8B68;
    public static final int GL_FLOAT_MAT4x2                                  = 0x8B69;
    public static final int GL_FLOAT_MAT4x3                                  = 0x8B6A;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT               = 0x8B8B;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE             = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE              = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING         = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE         = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE             = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE             = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE               = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE           = 0x8217;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER          = 0x8CD4;
    public static final int GL_FRAMEBUFFER_DEFAULT                           = 0x8218;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE            = 0x8D56;
    public static final int GL_HALF_FLOAT                                    = 0x140B;
    public static final int GL_INTERLEAVED_ATTRIBS                           = 0x8C8C;
    public static final int GL_INT_2_10_10_10_REV                            = 0x8D9F;
    public static final int GL_INT_SAMPLER_2D                                = 0x8DCA;
    public static final int GL_INT_SAMPLER_2D_ARRAY                          = 0x8DCF;
    public static final int GL_INT_SAMPLER_3D                                = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE                              = 0x8DCC;
    public static final int GL_INVALID_INDEX                                 = 0xFFFFFFFF;
    public static final int GL_MAX                                           = 0x8008;
    public static final int GL_MAX_3D_TEXTURE_SIZE                           = 0x8073;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS                      = 0x88FF;
    public static final int GL_MAX_CLIENT_WAIT_TIMEOUT_WEBGL                 = 0x9247;
    public static final int GL_MAX_COLOR_ATTACHMENTS                         = 0x8CDF;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS      = 0x8A33;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS                   = 0x8A2E;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS        = 0x8A31;
    public static final int GL_MAX_DRAW_BUFFERS                              = 0x8824;
    public static final int GL_MAX_ELEMENTS_INDICES                          = 0x80E9;
    public static final int GL_MAX_ELEMENTS_VERTICES                         = 0x80E8;
    public static final int GL_MAX_ELEMENT_INDEX                             = 0x8D6B;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS                 = 0x9125;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS                   = 0x8A2D;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS               = 0x8B49;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET                      = 0x8905;
    public static final int GL_MAX_SAMPLES                                   = 0x8D57;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT                       = 0x9111;
    public static final int GL_MAX_TEXTURE_LOD_BIAS                          = 0x84FD;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS       = 0x8C8B;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS    = 0x8C80;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE                        = 0x8A30;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS                   = 0x8A2F;
    public static final int GL_MAX_VARYING_COMPONENTS                        = 0x8B4B;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS                  = 0x9122;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS                     = 0x8A2B;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS                 = 0x8B4A;
    public static final int GL_MIN                                           = 0x8007;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET                      = 0x8904;
    public static final int GL_OBJECT_TYPE                                   = 0x9112;
    public static final int GL_PACK_ROW_LENGTH                               = 0x0D02;
    public static final int GL_PACK_SKIP_PIXELS                              = 0x0D04;
    public static final int GL_PACK_SKIP_ROWS                                = 0x0D03;
    public static final int GL_PIXEL_PACK_BUFFER                             = 0x88EB;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING                     = 0x88ED;
    public static final int GL_PIXEL_UNPACK_BUFFER                           = 0x88EC;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING                   = 0x88EF;
    public static final int GL_QUERY_RESULT                                  = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE                        = 0x8867;
    public static final int GL_R11F_G11F_B10F                                = 0x8C3A;
    public static final int GL_R16F                                          = 0x822D;
    public static final int GL_R16I                                          = 0x8233;
    public static final int GL_R16UI                                         = 0x8234;
    public static final int GL_R32F                                          = 0x822E;
    public static final int GL_R32I                                          = 0x8235;
    public static final int GL_R32UI                                         = 0x8236;
    public static final int GL_R8                                            = 0x8229;
    public static final int GL_R8I                                           = 0x8231;
    public static final int GL_R8UI                                          = 0x8232;
    public static final int GL_R8_SNORM                                      = 0x8F94;
    public static final int GL_RASTERIZER_DISCARD                            = 0x8C89;
    public static final int GL_READ_BUFFER                                   = 0x0C02;
    public static final int GL_READ_FRAMEBUFFER                              = 0x8CA8;
    public static final int GL_READ_FRAMEBUFFER_BINDING                      = 0x8CAA;
    public static final int GL_RED                                           = 0x1903;
    public static final int GL_RED_INTEGER                                   = 0x8D94;
    public static final int GL_RENDERBUFFER_SAMPLES                          = 0x8CAB;
    public static final int GL_RG                                            = 0x8227;
    public static final int GL_RG16F                                         = 0x822F;
    public static final int GL_RG16I                                         = 0x8239;
    public static final int GL_RG16UI                                        = 0x823A;
    public static final int GL_RG32F                                         = 0x8230;
    public static final int GL_RG32I                                         = 0x823B;
    public static final int GL_RG32UI                                        = 0x823C;
    public static final int GL_RG8                                           = 0x822B;
    public static final int GL_RG8I                                          = 0x8237;
    public static final int GL_RG8UI                                         = 0x8238;
    public static final int GL_RG8_SNORM                                     = 0x8F95;
    public static final int GL_RGB10_A2                                      = 0x8059;
    public static final int GL_RGB10_A2UI                                    = 0x906F;
    public static final int GL_RGB16F                                        = 0x881B;
    public static final int GL_RGB16I                                        = 0x8D89;
    public static final int GL_RGB16UI                                       = 0x8D77;
    public static final int GL_RGB32F                                        = 0x8815;
    public static final int GL_RGB32I                                        = 0x8D83;
    public static final int GL_RGB32UI                                       = 0x8D71;
    public static final int GL_RGB8                                          = 0x8051;
    public static final int GL_RGB8I                                         = 0x8D8F;
    public static final int GL_RGB8UI                                        = 0x8D7D;
    public static final int GL_RGB8_SNORM                                    = 0x8F96;
    public static final int GL_RGB9_E5                                       = 0x8C3D;
    public static final int GL_RGBA16F                                       = 0x881A;
    public static final int GL_RGBA16I                                       = 0x8D88;
    public static final int GL_RGBA16UI                                      = 0x8D76;
    public static final int GL_RGBA32F                                       = 0x8814;
    public static final int GL_RGBA32I                                       = 0x8D82;
    public static final int GL_RGBA32UI                                      = 0x8D70;
    public static final int GL_RGBA8                                         = 0x8058;
    public static final int GL_RGBA8I                                        = 0x8D8E;
    public static final int GL_RGBA8UI                                       = 0x8D7C;
    public static final int GL_RGBA8_SNORM                                   = 0x8F97;
    public static final int GL_RGBA_INTEGER                                  = 0x8D99;
    public static final int GL_RGB_INTEGER                                   = 0x8D98;
    public static final int GL_RG_INTEGER                                    = 0x8228;
    public static final int GL_SAMPLER_2D_ARRAY                              = 0x8DC1;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW                       = 0x8DC4;
    public static final int GL_SAMPLER_2D_SHADOW                             = 0x8B62;
    public static final int GL_SAMPLER_3D                                    = 0x8B5F;
    public static final int GL_SAMPLER_BINDING                               = 0x8919;
    public static final int GL_SAMPLER_CUBE_SHADOW                           = 0x8DC5;
    public static final int GL_SEPARATE_ATTRIBS                              = 0x8C8D;
    public static final int GL_SIGNALED                                      = 0x9119;
    public static final int GL_SIGNED_NORMALIZED                             = 0x8F9C;
    public static final int GL_SRGB                                          = 0x8C40;
    public static final int GL_SRGB8                                         = 0x8C41;
    public static final int GL_SRGB8_ALPHA8                                  = 0x8C43;
    public static final int GL_STATIC_COPY                                   = 0x88E6;
    public static final int GL_STATIC_READ                                   = 0x88E5;
    public static final int GL_STENCIL                                       = 0x1802;
    public static final int GL_STREAM_COPY                                   = 0x88E2;
    public static final int GL_STREAM_READ                                   = 0x88E1;
    public static final int GL_SYNC_CONDITION                                = 0x9113;
    public static final int GL_SYNC_FENCE                                    = 0x9116;
    public static final int GL_SYNC_FLAGS                                    = 0x9115;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT                       = 0x0001;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE                    = 0x9117;
    public static final int GL_SYNC_STATUS                                   = 0x9114;
    public static final int GL_TEXTURE_2D_ARRAY                              = 0x8C1A;
    public static final int GL_TEXTURE_3D                                    = 0x806F;
    public static final int GL_TEXTURE_BASE_LEVEL                            = 0x813C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY                      = 0x8C1D;
    public static final int GL_TEXTURE_BINDING_3D                            = 0x806A;
    public static final int GL_TEXTURE_COMPARE_FUNC                          = 0x884D;
    public static final int GL_TEXTURE_COMPARE_MODE                          = 0x884C;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT                      = 0x912F;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS                      = 0x82DF;
    public static final int GL_TEXTURE_MAX_LEVEL                             = 0x813D;
    public static final int GL_TEXTURE_MAX_LOD                               = 0x813B;
    public static final int GL_TEXTURE_MIN_LOD                               = 0x813A;
    public static final int GL_TEXTURE_WRAP_R                                = 0x8072;
    public static final int GL_TIMEOUT_EXPIRED                               = 0x911B;
    public static final int GL_TIMEOUT_IGNORED                               = -1;
    public static final int GL_TRANSFORM_FEEDBACK                            = 0x8E22;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE                     = 0x8E24;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING                    = 0x8E25;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER                     = 0x8C8E;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING             = 0x8C8F;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE                = 0x8C7F;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE                = 0x8C85;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START               = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED                     = 0x8E23;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN         = 0x8C88;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS                   = 0x8C83;
    public static final int GL_UNIFORM_ARRAY_STRIDE                          = 0x8A3C;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS                 = 0x8A42;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES          = 0x8A43;
    public static final int GL_UNIFORM_BLOCK_BINDING                         = 0x8A3F;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE                       = 0x8A40;
    public static final int GL_UNIFORM_BLOCK_INDEX                           = 0x8A3A;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER   = 0x8A46;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER     = 0x8A44;
    public static final int GL_UNIFORM_BUFFER                                = 0x8A11;
    public static final int GL_UNIFORM_BUFFER_BINDING                        = 0x8A28;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT               = 0x8A34;
    public static final int GL_UNIFORM_BUFFER_SIZE                           = 0x8A2A;
    public static final int GL_UNIFORM_BUFFER_START                          = 0x8A29;
    public static final int GL_UNIFORM_IS_ROW_MAJOR                          = 0x8A3E;
    public static final int GL_UNIFORM_MATRIX_STRIDE                         = 0x8A3D;
    public static final int GL_UNIFORM_OFFSET                                = 0x8A3B;
    public static final int GL_UNIFORM_SIZE                                  = 0x8A38;
    public static final int GL_UNIFORM_TYPE                                  = 0x8A37;
    public static final int GL_UNPACK_IMAGE_HEIGHT                           = 0x806E;
    public static final int GL_UNPACK_ROW_LENGTH                             = 0x0CF2;
    public static final int GL_UNPACK_SKIP_IMAGES                            = 0x806D;
    public static final int GL_UNPACK_SKIP_PIXELS                            = 0x0CF4;
    public static final int GL_UNPACK_SKIP_ROWS                              = 0x0CF3;
    public static final int GL_UNSIGNALED                                    = 0x9118;
    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV                  = 0x8C3B;
    public static final int GL_UNSIGNED_INT_24_8                             = 0x84FA;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV                   = 0x8368;
    public static final int GL_UNSIGNED_INT_5_9_9_9_REV                      = 0x8C3E;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D                       = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY                 = 0x8DD7;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D                       = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE                     = 0x8DD4;
    public static final int GL_UNSIGNED_INT_VEC2                             = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3                             = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4                             = 0x8DC8;
    public static final int GL_UNSIGNED_NORMALIZED                           = 0x8C17;
    public static final int GL_VERTEX_ARRAY_BINDING                          = 0x85B5;
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR                   = 0x88FE;
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER                   = 0x88FD;
    public static final int GL_WAIT_FAILED                                   = 0x911D;

    /* Prevent instantiation */
    private WebGL20()
    {
    }

    public static WebGLContext createContext(Canvas canvas)
    {
        return createContext(canvas.getCanvasElement());
    }

    public static WebGLContext createContext(Canvas canvas, WebGLContext.Attributes attributes)
    {
        return createContext(canvas.getCanvasElement(), attributes);
    }

    public static WebGLContext createContext(CanvasElement canvas)
    {
        return createContext(canvas, null);
    }

    public static native WebGLContext createContext(CanvasElement element, WebGLContext.Attributes attribs) /*-{
        try
        {
            if (attributes)
                $wnd.gl = canvas.getContext("webgl2", attributes) || canvas.getContext("experimental-webgl2", attributes);
            else
                $wnd.gl = canvas.getContext("webgl2") || canvas.getContext("experimental-webgl2");

            $wnd.attribs = $wnd.gl.getContextAttributes();
            $wnd.glv = 2.0;
        }
        catch (e)
        {
            alert(e);

            $wnd.alert("Your browser doesn't appear to support WebGL 2. Try upgrading your browser.");
            $wnd.location.href = 'http://get.webgl.org/';
        }

        return $wnd.context = {
            gl: $wnd.gl,
            attribs: $wnd.attribs,
            glv: $wnd.glv
        };
    }-*/;

    public static native boolean isSupported() /*-{
        try
        {
            var canvas = $doc.createElement('canvas');
            return !! ( $wnd.WebGLRenderingContext && (canvas.getContext('webgl2') ||
            canvas.getContext('experimental-webgl2')));
        }
        catch (e)
        {
            $wnd.console.log(e);
            return false;
        }
    }-*/;

    public static boolean isContextCompatible()
    {
        return WebGLContext.getCurrent() != null && WebGLContext.getCurrent().getVersion() >= 2.0;
    }

    private static void checkContextCompatibility()
    {
        if (!isContextCompatible())
            throw new IllegalStateException("The context should be created before invoking the GL functions");
    }

    // TODO: Implement WebGL2 functions
}
