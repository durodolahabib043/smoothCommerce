package challenge.technical.habib.smoothcomm.activity;


import android.support.multidex.MultiDexApplication;

import challenge.technical.habib.smoothcomm.network.ApiClient;


public class MainApplication extends MultiDexApplication {
    private static MainApplication instance;
    private ApiClient apiClient;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

    }

    public static synchronized MainApplication getInstance() {
        return instance;
    }



    public ApiClient getApiClientInstance() {
        if (apiClient == null) {
            apiClient = new ApiClient(getApplicationContext());
        }
        return apiClient;
    }


}
