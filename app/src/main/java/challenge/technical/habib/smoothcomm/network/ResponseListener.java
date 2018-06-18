package challenge.technical.habib.smoothcomm.network;

public interface ResponseListener<T> {
    void onSuccess(T response);
    void onNoConnection(Throwable t);
    void onResponseError(Throwable t);
}
