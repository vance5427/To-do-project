package com.example.todo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseLoginRegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_loginregistration);

        Button mLogin = findViewById(R.id.login);
        Button mRegister = findViewById(R.id.register);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), LoginActivity.class);
                startActivity(intent);
                return;
            }
        });
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), RegisterActivity.class);
                startActivity(intent);
                return;
            }
        });

    }

}
