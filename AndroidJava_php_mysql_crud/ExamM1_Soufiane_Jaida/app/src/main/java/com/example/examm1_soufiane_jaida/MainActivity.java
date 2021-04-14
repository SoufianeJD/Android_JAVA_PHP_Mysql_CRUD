package com.example.examm1_soufiane_jaida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class MainActivity extends AppCompatActivity {
    private Button btn_login, btn_x, btn_xx;
    EditText login, password;
    String correct = "admin";
    String correctt = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_x = (Button) findViewById(R.id.btn_x);
        btn_xx = (Button) findViewById(R.id.btn_xx);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(login.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Empty Input", Toast.LENGTH_LONG).show();
                } else if (login.getText().toString().equals(correct)) {
                    if (password.getText().toString().equals(correctt)) {
                        openListAdmin();

                    } else {
                        Toast.makeText(MainActivity.this, "Invalid Password !", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Invalid Login !", Toast.LENGTH_LONG).show();
                }

            }
        });

        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           openAddAdmin();

            }
        });

        btn_xx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfLogin();
            }
        });
    }

    public void openListAdmin() {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void openAddAdmin() {
        Intent intent = new Intent(this, AddAdmin.class);
        startActivity(intent);
    }

    public void openProfLogin() {
        Intent intent = new Intent(this, ProfLogin.class);
        startActivity(intent);
    }

}