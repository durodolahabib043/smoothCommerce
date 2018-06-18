package challenge.technical.habib.smoothcomm.network;


import android.support.annotation.NonNull;

import java.io.IOException;

import challenge.technical.habib.smoothcomm.activity.MainApplication;
import challenge.technical.habib.smoothcomm.model.Node;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;

public class ApiCalls {

    private static ApiCalls instance;
    private ApiClient apiClient;
    private final int SUCCESS = 200;

    private ApiCalls() {
        instance = this;
        apiClient = MainApplication.getInstance().getApiClientInstance();
    }

    public static synchronized ApiCalls getInstance() {
        if (instance == null) {
            instance = new ApiCalls();
        }
        return instance;
    }

    public Disposable getBrands(@NonNull final ResponseListener<Node> callback) {
        return apiClient.getPublicApiCall().getBrands()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new ApiResponseCallbackWrapper<Response<Node>>() {
                    @Override
                    protected void onSuccess(Response<Node> user) {
                        if (user.code() == SUCCESS) {
                            callback.onSuccess(user.body());

                        } else {
                            callback.onResponseError(new Throwable());
                        }
                    }

                    @Override
                    public void onError(Throwable error) {
                        if (error instanceof IOException) {
                            callback.onNoConnection(error);
                        } else {
                            callback.onResponseError(error);
                        }
                    }
                });
    }


}
