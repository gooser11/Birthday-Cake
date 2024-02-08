package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {
    private CakeView contrView;
    private CakeModel contrModel;


    public CakeController(CakeView aCakeView){
        contrView = aCakeView;
        contrModel = contrView.getMyCake();
    }

    @Override
    public void onClick(View v) {
        Log.d("cake", "click!");

        contrModel.candlesLit = false;
        contrView.invalidate();


    }
}
