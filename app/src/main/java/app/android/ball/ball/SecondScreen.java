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
        int x, y,st, flag, flag2=1, factX = 10, factY = 10, a, b;
        /*DisplayMetrics metrics = getResources().getDisplayMetrics();
        int x = metrics.heightPixels;
        int y = metrics.widthPixels;*/
        SecondScreen(Context context) {
            super(context);
        }
        public void onDraw(Canvas can){
            if(st==0) {
                x = a = can.getWidth() / 2;
                y = b = can.getHeight() / 2;
                st = 1;
                myPaint.setColor(Color.parseColor("#0099cc"));
            }
            if(a == x && b == y) {
                factX = 10;
                factY = 10;
            }

            can.drawCircle(x,y,40,myPaint);
            if(flag == 1 && flag2%2 == 0) {
                if (x < can.getWidth() && dirx == 1) {
                    x += factX;

                    if (x > can.getWidth() - 1) {
                        dirx = 2;
                        myPaint.setColor(Color.parseColor("#000000"));
                        //Toast.makeText(getContext(),"x:"+ x, Toast.LENGTH_LONG).show();
                    }
                }
                if (x > 0 && dirx == 2) {
                    x -= factX;

                    if (x < 3) {
                        dirx = 1;
                        myPaint.setColor(Color.parseColor("#00ffcc"));
                        //Toast.makeText(getContext(), "x:" + x, Toast.LENGTH_LONG).show();
                    }
                }
                if (y < can.getHeight() && diry == 1) {
                    y += factY;

                    if (y > can.getHeight() - 1) {
                        diry = 2;
                        myPaint.setColor(Color.parseColor("#0000ff"));
                        /*Toast.makeText(getContext(),"y:"+ y, Toast.LENGTH_LONG).show();*/

                    }
                }
                if (y > 0 && diry == 2) {
                    y -= factY;

                    if (y < 3) {
                        diry = 1;
                        myPaint.setColor(Color.parseColor("#ff0000"));
                        //Toast.makeText(getContext(),"y:"+ y, Toast.LENGTH_LONG).show();
                    }
                }
            }
            invalidate();
        }
        public boolean onTouchEvent( MotionEvent e ) {
            int action = e.getAction();
            if(action == MotionEvent.ACTION_DOWN){
                a = (int) e.getX();
                b = (int) e.getY();
                flag = 1;
                flag2++;
                if(flag2 == 15)
                    flag2 = 1;
                /*if(x < a && y > b) {
                    dirx = 1;
                    diry = 2;
                    factX = a - x - (a-x/50);
                    factY = y - b - (y-b/50);
                }
                if(x > a && y > b) {
                    dirx = 2;
                    diry = 2;
                    factX = x - a - (x-a/50);
                    factY = y - b - (y-b/50);
                }
                if(x > a && y < b) {
                    dirx = 2;
                    diry = 1;
                    factX = x - a - (x-a/50);
                    factY = b - y- (b-y/50);
                }
                if(x < a && y < b) {
                    dirx = 1;
                    diry = 1;
                    factX = a - x - (a-x/50);
                    factY = b - y - (b-y/50);
                }*/
            }
            return true;
        }
    }
