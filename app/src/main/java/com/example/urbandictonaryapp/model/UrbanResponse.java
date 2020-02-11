package com.example.urbandictonaryapp.model;

import java.util.List;

public class UrbanResponse {

    private List<Definition> list;

    public void setList(List<Definition> list) {
        this.list = list;
    }

    public List<Definition> getList() {
        return list;
    }

    @Override
    public String toString() {
        return
                "UrbanResponse{" +
                        "list = '" + list + '\'' +
                        "}";
    }
}