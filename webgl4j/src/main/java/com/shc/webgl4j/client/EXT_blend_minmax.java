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

/**
 * @author Sri Harsha Chilakapati
 */
public final class EXT_blend_minmax
{
    public static final int GL_MIN_EXT = 0x8007;
    public static final int GL_MAX_EXT = 0x8008;

    /* Prevent instantiation */
    private EXT_blend_minmax()
    {
    }

    public static boolean isSupported()
    {
        if (!WebGL10.isSupported())
            return false;

        if (!WebGL10.isContextCompatible())
            throw new IllegalStateException("You must have a WebGL context >= 1.0 to check if extension is supported.");

        for (String supportedExtension : WebGL10.glGetSupportedExtensions())
        {
            switch (supportedExtension)
            {
                case "EXT_blend_minmax":
                case "O_EXT_blend_minmax":
                case "IE_EXT_blend_minmax":
                case "MOZ_EXT_blend_minmax":
                case "WEBKIT_EXT_blend_minmax":
                    return true;
            }
        }

        return false;
    }

    public static void enableExtension()
    {
        if (!WebGL10.isContextCompatible())
            throw new IllegalStateException("You must have a WebGL context >= 1.0 to enable this extension.");

        if (!isSupported())
            throw new RuntimeException("This browser does not support the EXT_blend_minmax extension.");

        if (!isExtensionEnabled())
            nEnableExtension();
    }

    public static native boolean isExtensionEnabled() /*-{
        return typeof ($wnd.gl.ebb_ext) !== 'undefined';
    }-*/;

    private static native void nEnableExtension() /*-{
        $wnd.gl.ebb_ext = $wnd.gl.getExtension('EXT_blend_minmax') ||
            $wnd.gl.getExtension('O_EXT_blend_minmax') ||
            $wnd.gl.getExtension('IE_EXT_blend_minmax') ||
            $wnd.gl.getExtension('MOZ_EXT_blend_minmax') ||
            $wnd.gl.getExtension('WEBKIT_EXT_blend_minmax');
    }-*/;
}
