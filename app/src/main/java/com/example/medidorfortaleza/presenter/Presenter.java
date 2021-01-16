package com.example.medidorfortaleza.presenter;

import com.example.medidorfortaleza.model.Verificador;

public class Presenter {
    private IViewPresenter viewPresenter;
    private Verificador model;

    public Presenter(IViewPresenter viewPresenter) {
        this.viewPresenter = viewPresenter;
        this.model = new Verificador();
    }

    public void checkPassword(String pass) {
        if (model.checkColor(pass).equals("red")) {
            viewPresenter.showPasswordStrength("red", "Weak");

        } else if (model.checkColor(pass).equals("yellow")) {
            viewPresenter.showPasswordStrength("yellow", "Medium");
        } else {
            viewPresenter.showPasswordStrength("green", "Strong");
        }
    }
}
