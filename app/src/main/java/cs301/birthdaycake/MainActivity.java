package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //mine


        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView yum = findViewById(R.id.cakeview);
        CakeController control = new CakeController(yum);

        //get ref to blowout button
        Button blow = findViewById(R.id.blowout);
        blow.setOnClickListener(control);
    }
    public void goodbye(View button) {
        Log.v("button", "Goodbye");
    }
}
