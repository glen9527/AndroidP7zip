package com.hzy.p7zip.app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hzy.p7zip.app.R;

import butterknife.ButterKnife;

/**
 * Created by huzongyao on 17-7-10.
 */

public class StorageFragment extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_storage, null);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
