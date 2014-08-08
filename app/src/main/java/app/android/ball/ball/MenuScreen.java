package app.android.ball.ball;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;

/**
 * Created by ganesh on 07-08-2014.
 */
public class MenuScreen extends Activity {
        /*AlertDialog.Builder build = new AlertDialog.Builder(this);*/
    @Override
    public void onCreate(Bundle newInstance) {
        super.onCreate(newInstance);
        setContentView(R.layout.menu_screen);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuScreen.this, Credits.class));
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                AlertDialog alert = new AlertDialog(AlertDialogActivity.this).create();*/
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuScreen.this, AuxScreen.class));
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuScreen.this, Help.class));
            }
        });
        /*button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                build.setTitle("Do you really want to exit this wonderful game?");
                build.setMessage("Oh come on! Isn't this game interesting?! :(");
                build.setNegativeButton("No, sorry.", null);
                build.setPositiveButton("Hell yes!", new OnClickListener() {
                    public void onClick(DialogInterface arg0 , int arg1) {
                        MenuScreen.super.onBackPressed();
                    }
                }).create().show();
            }
        });*/
        }
    @Override
    public  void onBackPressed() {
        AlertDialog.Builder build = new AlertDialog.Builder(this);
        build.setTitle("Do you really want to exit this wonderful game?");
        build.setMessage("Oh come on! Isn't this game interesting?! :(");
        build.setNegativeButton("No, sorry.", null);
        build.setPositiveButton("Hell yes!", new OnClickListener() {
            public void onClick(DialogInterface arg0 , int arg1) {
                MenuScreen.super.onBackPressed();
            }
        }).create().show();
        //Source: http://stackoverflow.com/questions/6413700/android-proper-way-to-use-onbackpressed
    }
}
