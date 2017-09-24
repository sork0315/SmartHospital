package com.dongyang.hospitalapp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.dongyang.hospitalapp.R;
import com.dongyang.hospitalapp.domain.Account;
import com.dongyang.hospitalapp.domain.Response;
import com.dongyang.hospitalapp.repository.AccountRepository;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginPageActivity extends AppCompatActivity {

    @BindView(R.id.inputId)
    EditText inputId;

    @BindView(R.id.inputPassword)
    EditText inputPassword;

    @BindView(R.id.btnLogin)
    Button btnLogin;

    @BindView(R.id.btnSignUp)
    Button btnSignUp;

    private AccountRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        ButterKnife.bind(this);

        repository = new AccountRepository();
    }

    @OnClick(R.id.btnLogin)
    private void login(View view) {
        Account account = new Account();
        account.setId(inputId.getText().toString());
        account.setPassword(inputPassword.getText().toString());

        Response response = repository.login(account);

        if(response.getMessage().equals("ok")) {

        }
    }

    @OnClick(R.id.btnSignUp)
    private void signUp(View view) {

    }
}
