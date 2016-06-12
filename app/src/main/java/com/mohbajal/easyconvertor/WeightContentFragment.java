package com.mohbajal.easyconvertor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;

/**
 * Created by 908752 on 6/12/16.
 */
public class WeightContentFragment extends Fragment {

    @BindView(R.id.pounds)   EditText lb;
    @BindView(R.id.kilograms) EditText kg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.item_weight, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnTextChanged(R.id.pounds)
    void convertLbToKg(){
        if(lb.isFocused())
            kg.setText(Conversions.poundsToKg(lb.getText().toString()));
    }

    @OnTextChanged(R.id.kilograms)
    void convertKgToLb(){
        if(kg.isFocused())
            lb.setText(Conversions.kgToPounds(kg.getText().toString()));
    }

}
