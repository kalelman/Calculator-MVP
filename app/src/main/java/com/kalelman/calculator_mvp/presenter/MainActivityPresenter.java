package com.kalelman.calculator_mvp.presenter;

public interface MainActivityPresenter {

    void sumar(String number1, String number2); // this method belong to Interactor

    void showError(String error); // this methos belong to View

    void showResult(String result); // this method belong to view

}
