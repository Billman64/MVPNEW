package laughingleviathon.mvpdagger.injection.view.mainactivity;

import laughingleviathon.mvpdagger.injection.view.mainactivity.MainActivityContract;

/**
 * Created by User on 5/3/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter{
    MainActivityContract.View view;

    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }


    @Override
    public void doCalculation(String log) {
        view.updateView(log);
    }

}
