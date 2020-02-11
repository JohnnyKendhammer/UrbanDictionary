package com.example.urbandictonaryapp.repository;

import com.example.urbandictonaryapp.model.UrbanResponse;
import com.example.urbandictonaryapp.repository.remote.ServiceInstance;

import io.reactivex.Observable;

public class Repository {

    private Repository() {
    }

    private static class RepositoryInstanceHolder {
        private static final Repository INSTANCE = new Repository();
    }

    public static Repository getInstance() {
        return RepositoryInstanceHolder.INSTANCE;
    }

    public Observable<UrbanResponse> getDefinitions(String term) {
        return ServiceInstance.getUrbanService().getDefinitions(term);
    }
}
