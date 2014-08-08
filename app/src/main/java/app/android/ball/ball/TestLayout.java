package app.android.ball.ball;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ganesh on 08-08-2014.
 */
public class TestLayout extends Activity {
    @Override
    public void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.test_layout);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
