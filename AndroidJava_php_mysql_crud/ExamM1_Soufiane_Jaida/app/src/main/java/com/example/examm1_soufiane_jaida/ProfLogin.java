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

public class ProfLogin extends AppCompatActivity {
    private Button btn_login , btn_x;
    EditText login , password;
    String correct = "prof";
    String correctt = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proflogin);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

        btn_login = (Button) findViewById(R.id.btn_login);
        btn_x = (Button) findViewById(R.id.btn_x);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(login.getText().toString()) || TextUtils.isEmpty(password.getText().toString()) ){
                    Toast.makeText(ProfLogin.this ,"Empty Input", Toast.LENGTH_LONG).show();
                }else if(login.getText().toString().equals(correct)){
                    if(password.getText().toString().equals(correctt)){
                        openProfList();

                    }
                    else{
                        Toast.makeText(ProfLogin.this,"Invalid Password !",Toast.LENGTH_LONG).show();
                    }

                }
                else{
                    Toast.makeText(ProfLogin.this, "Invalid Login !",Toast.LENGTH_LONG).show();
                }


            }
        });
        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddProf();
            }
        });
    }

    public void openAddProf() {
        Intent intent = new Intent(this, AddProf.class);
        startActivity(intent);
    }
    public void openProfList() {
        Intent intent = new Intent(this, ListProf.class);
        startActivity(intent);
    }
}