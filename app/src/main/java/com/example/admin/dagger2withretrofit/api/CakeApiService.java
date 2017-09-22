package com.example.admin.dagger2withretrofit.api;

import com.example.admin.dagger2withretrofit.mvp.model.CakeResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by ADMIN on 22-09-2017.
 */

public interface CakeApiService {
    @GET("/filippella/a728a34822a3bc7add98e477a4057b69/raw/310d712e87941f569074a63fedb675d2b611342a/cakes")
    Observable<CakeResponse> getCakes();
}
