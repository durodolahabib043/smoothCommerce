package challenge.technical.habib.smoothcomm.base;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter {

    public CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void onDestroy()
    {
        if(compositeDisposable != null)
        {
            compositeDisposable.dispose();
        }
    }
}
