package challenge.technical.habib.smoothcomm.network;

import challenge.technical.habib.smoothcomm.model.Node;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;

public interface PublicCallInterface {
//https://api.myjson.com/bins/og746

    @GET("/bins/o3m6m")
    Observable<Response<Node>> getBrands();

}
