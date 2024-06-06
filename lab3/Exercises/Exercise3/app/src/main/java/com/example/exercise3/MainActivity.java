package com.example.exercise3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(new GraphicsView(this));
    }

    private class GraphicsView extends View {
        Bitmap[] frames = new Bitmap[9];
        int i = 0;

        public GraphicsView(Context context) {
            super(context);

            frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
            frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
            frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.img3);
            frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.img4);
            frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.img5);
            frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.img6);
            frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.img7);
            frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.img8);
            frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.img9);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            if (i < 9) {
                canvas.drawBitmap(frames[i], -120, 100, new Paint());
            } else {
                i = 0;
            }
            invalidate();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            i++;
            if (i >= 15) {
                i = 0;
            }
            return true;
        }

    }
}
