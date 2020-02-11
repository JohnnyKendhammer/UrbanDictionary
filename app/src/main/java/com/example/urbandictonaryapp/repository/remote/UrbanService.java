package com.example.urbandictonaryapp.repository.remote;

import com.example.urbandictonaryapp.model.UrbanResponse;

import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UrbanService {

    @GET("/define")
    Observable<UrbanResponse> getDefinitions(
            @Query("term") String term
    );

    @GET("/define")
    Single<UrbanResponse> getDefinitionsSingle(
            @Query("term") String term
    );
}
