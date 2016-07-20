package com.ga.android.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by stacyzolnikov on 7/19/16.
 */
public class TextFragment extends Fragment {
    TextView mTextView;

    public static TextFragment newInstance (int tabPosition) {
        TextFragment textFragment = new TextFragment();
        Bundle args = new Bundle();
        args.putInt("tab_position", tabPosition);
        textFragment.setArguments(args);
        return textFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewRoot = inflater.inflate(R.layout.fragment_text, container, false);
        mTextView = (TextView) viewRoot.findViewById(R.id.textview_fragment);
        return viewRoot;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int tabNumber = getArguments().getInt("tab_position",1);
        switch (tabNumber) {
            default:
            case 1 :
                mTextView.setText("Hi, my name is Stacy Zolnikov");
                break;
            case 2:
                mTextView.setText("I like gymnastics");
                break;
        }
        super.onViewCreated(view, savedInstanceState);
    }
}
