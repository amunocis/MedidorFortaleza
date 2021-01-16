package com.example.medidorfortaleza;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.medidorfortaleza.databinding.ActivityMainBinding;
import com.example.medidorfortaleza.presenter.IViewPresenter;
import com.example.medidorfortaleza.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IViewPresenter {
    private Presenter presenter;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        presenter = new Presenter(this);
        mBinding.etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presenter.checkPassword(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void showPasswordStrength(String color, String strength) {
        mBinding.etPassword.setBackgroundColor(Color.parseColor(color));
        mBinding.tvMsg.setText(strength);
    }
}