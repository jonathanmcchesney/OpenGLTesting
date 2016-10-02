package com.example.jonathan.opengltest;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private MGLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        mGLView = new MGLSurfaceView(this);
        setContentView(mGLView);
    }
}
