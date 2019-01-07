package com.kalelman.calculator_mvp.interactor;

import com.kalelman.calculator_mvp.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        Double result = Double.valueOf(number1) + Double.valueOf(number2);
        presenter.showResult(String.valueOf(result));
        //presenter.showError();
    }

}
