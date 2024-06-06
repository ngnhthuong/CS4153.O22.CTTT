package com.example.btandroid_4;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[101];
    int i = 0;
    long last_tick = 0;
    long period = 200;
    Context cText;

    MediaPlayer mPlayer;


    public GraphicsView(Context context) {
        super(context);
        cText = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.img1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.img2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.img3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.img4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.img5);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.img6);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.img7);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.img9);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.img9);
        mPlayer = MediaPlayer.create(cText, R.raw.xoso);
        mPlayer.start();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 9) {
            long time = (System.currentTimeMillis() - last_tick);
            if (time > period) {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 4, 4, new Paint());
                i++;
                postInvalidate();
            }
            else{
                canvas.drawBitmap(frames[i], 4, 4, new Paint());
                postInvalidate();
            }
        } else {
            i = 0;
            postInvalidate();
        }

    }

}