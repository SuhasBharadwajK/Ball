package app.android.ball.ball;

import android.content.Context;
import android.graphics.Canvas;
import android.hardware.SensorEventListener;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Paint;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.widget.Toast;
import android.os.Bundle;
//import android.view.WindowManager;
//import android.content.Context;
import android.app.Activity;
//import android.view.Window;
//import android.view.Display;

/**
 * Created by ganesh on 07-08-2014.
 */
    public class SecondScreen extends View {
        Paint myPaint = new Paint();
        int dirx = 1, diry = 1;
        int x, y,st, flag, flag2;
        /*DisplayMetrics metrics = getResources().getDisplayMetrics();
        int x = metrics.heightPixels;
        int y = metrics.widthPixels;*/
        SecondScreen(Context context) {
            super(context);
        }
        public void onDraw(Canvas can){
            if(st==0) {
                x = can.getWidth() / 2;
                y = can.getHeight() / 2;
                st = 1;
            }
            myPaint.setColor(Color.parseColor("#0099cc"));
            can.drawCircle(x,y,40,myPaint);
            if(flag == 1 && flag2%2 == 0) {
                if (x < can.getWidth() && dirx == 1) {
                    x += 10;
                    if (x > can.getWidth() - 5)
                        dirx = 2;
                }
                if (x > 0 && dirx == 2) {
                    x -= 10;
                    if (x < 3)
                        dirx = 1;
                }
                if (y < can.getHeight() && diry == 1) {
                    y += 10;
                    if (y > can.getHeight() - 20) {
                        diry = 2;
                        //Toast.makeText(getContext(),"y:"+ y, Toast.LENGTH_LONG).show();

                    }
                }
                if (y > 0 && diry == 2) {
                    y -= 10;
                    if (y < 3)
                        diry = 1;
                }
            }
            invalidate();
        }
        public boolean onTouchEvent( MotionEvent e ) {
            int action = e.getAction();
            if(action == MotionEvent.ACTION_DOWN){
                flag = 1;
                flag2++;
                if(flag2 == 15)
                    flag2 = 1;
            }
            return true;
        }
    }
