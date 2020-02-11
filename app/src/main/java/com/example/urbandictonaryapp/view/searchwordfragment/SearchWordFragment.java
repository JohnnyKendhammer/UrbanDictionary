package com.example.urbandictonaryapp.view.searchwordfragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.urbandictonaryapp.R;
import com.example.urbandictonaryapp.view.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchWordFragment extends BaseFragment {


    public SearchWordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_word, container, false);
    }

}
