package com.shide56.kitchenstories.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shide56.kitchenstories.BaseFragment;
import com.shide56.kitchenstories.R;

/**
 * 我的主页
 */

public class MyHomeFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_home, container, false);
    }

}
