package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

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

        Button blow = findViewById(R.id.blowout); // ref to blowout
        blow.setOnClickListener(control); // register

        //get ref to candles switch
        Switch candles = findViewById(R.id.candles);
        candles.setOnCheckedChangeListener(control);

        SeekBar bar = findViewById(R.id.candleSeek);
        bar.setOnSeekBarChangeListener(control);
    }
    public void goodbye(View button) {
        Log.v("button", "Goodbye");
    }
}
