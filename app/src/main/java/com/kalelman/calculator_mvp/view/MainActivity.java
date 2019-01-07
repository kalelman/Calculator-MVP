package com.kalelman.calculator_mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.kalelman.calculator_mvp.R;
import com.kalelman.calculator_mvp.presenter.MainActivityPresenter;
import com.kalelman.calculator_mvp.presenter.MainActivityPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    @BindView(R.id.edtNumber1)
    EditText edtNumber1;
    @BindView(R.id.edtNumber2)
    EditText edtNumber2;
    @BindView(R.id.txvResult)
    TextView txvResult;

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainActivityPresenterImpl(this);

    }

    public void onClickSuma(View view) {

        String number1 = edtNumber1.getText().toString();
        String number2 = edtNumber2.getText().toString();
        presenter.sumar(number1, number2);

    }

    @Override
    public void showResult(String result) {
        txvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        txvResult.setText(error);
    }
}
