package app.android.ball.ball;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ganesh on 07-08-2014.
 */
public class AuxScreen extends Activity {
    @Override
    public void onCreate(Bundle newInstance) {
        super.onCreate(newInstance);
        setContentView(new SecondScreen(this));
    }
}
