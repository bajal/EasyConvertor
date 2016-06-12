package com.mohbajal.easyconvertor;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class TemperatureContentFragment extends Fragment {

    @BindView(R.id.fahrenheit) EditText f;
    @BindView(R.id.celsius) EditText c;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_temperature, null);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnTextChanged(R.id.fahrenheit)
    void convertFtoC(){
        if(f.isFocused())
            c.setText(Conversions.fahrenheitToCelsius(f.getText().toString()));
    }

    @OnTextChanged(R.id.celsius)
    void convertCtoF(){
        if(c.isFocused())
            f.setText(Conversions.celsiusToFahrenheit(c.getText().toString()));
    }

}
