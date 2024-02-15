package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {


    private CakeView contrView;
    private CakeModel contrModel;


    public CakeController(CakeView aCakeView) {
        contrView = aCakeView;
        contrModel = contrView.getMyCake();
    }

    @Override
    public void onClick(View v) {
        Log.d("cake", "click!");
        contrModel.candlesLit = false;
        contrView.invalidate();

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.d("cake", "switch!");

        contrModel.hasCandles = isChecked;

        contrView.invalidate();
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Log.d("cake", "scroll!");
        contrModel.numCandles = progress;

        contrView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
