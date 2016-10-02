package com.example.jonathan.opengltest;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Jonathan on 02/10/2016.
 */
class MGLSurfaceView extends GLSurfaceView {

    private final MGLRenderer mRenderer;

    public MGLSurfaceView(Context context){
        super(context);

        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        mRenderer = new MGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
    }
}

