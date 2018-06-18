package challenge.technical.habib.smoothcomm.fragment.main;

import challenge.technical.habib.smoothcomm.base.BasePresenter;
import challenge.technical.habib.smoothcomm.model.Node;
import challenge.technical.habib.smoothcomm.network.ApiCalls;
import challenge.technical.habib.smoothcomm.network.ResponseListener;

public class MainPresenterImpl extends BasePresenter implements mainPresenter {
    MainView view;

    public MainPresenterImpl(MainView view ) {
        this.view = view;
    }

    @Override
    public void getBrands() {
        compositeDisposable.add(ApiCalls.getInstance().getBrands(new ResponseListener<Node>() {
            @Override
            public void onSuccess(Node response) {
                view.displayBrands(response);

            }

            @Override
            public void onNoConnection(Throwable t) {
                view.toast();
            }

            @Override
            public void onResponseError(Throwable t) {
                view.toast();
            }
        }));


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
