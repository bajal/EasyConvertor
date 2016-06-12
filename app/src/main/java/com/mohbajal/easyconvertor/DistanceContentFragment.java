package com.mohbajal.easyconvertor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

/**
 * Created by 908752 on 6/12/16.
 */
public class DistanceContentFragment extends Fragment {

    @BindView(R.id.kmph) EditText kmph;
    @BindView(R.id.mph) EditText mph;

    @BindView(R.id.miles) EditText miles;
    @BindView(R.id.kilometers) EditText kms;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.item_distance, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnTextChanged(R.id.mph)
    void convertKmphToMph(){
        if(mph.isFocused())
            kmph.setText(Conversions.mphToKmph(mph.getText().toString()));
    }

    @OnTextChanged(R.id.kmph)
    void convertMphToKmph(){
        if(kmph.isFocused())
            mph.setText(Conversions.kmphToMph(kmph.getText().toString()));
    }

    @OnTextChanged(R.id.kilometers)
    void convertKmToMiles(){
        if(kms.isFocused())
            miles.setText(Conversions.kmtoMiles(kms.getText().toString()));
    }

    @OnTextChanged(R.id.miles)
    void convertMilesToKmp(){
        if(miles.isFocused())
            kms.setText(Conversions.milesToKm(miles.getText().toString()));
    }

}
