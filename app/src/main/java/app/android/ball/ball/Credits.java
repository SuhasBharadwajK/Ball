package app.android.ball.ball;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by ganesh on 08-08-2014.
 */
public class Credits extends Activity {
    @Override
    public void onCreate(Bundle instance) {
        super.onCreate(instance);
        setContentView(R.layout.credits);
        Button button;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity((new Intent(Credits.this,MenuScreen.class)).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK));
            }
        });
    }
}
