package com.terpusat.mypermatawisata.api;

import com.terpusat.mypermatawisata.model.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prakasa on 08/12/16.
 */

public class CallbackData {
    private List<Data> data = new ArrayList<Data>();

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data= data;
    }
}
