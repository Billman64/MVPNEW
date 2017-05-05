package laughingleviathon.mvpdagger.injection.view.mainactivity;

/**
 * Created by User on 5/3/2017.
 */

public interface MainActivityContract {
    interface View{
        void updateView(String log);
    }

    interface Presenter<V extends View>{
        void addView(V view);
        void doCalculation(String log);
    }

}
