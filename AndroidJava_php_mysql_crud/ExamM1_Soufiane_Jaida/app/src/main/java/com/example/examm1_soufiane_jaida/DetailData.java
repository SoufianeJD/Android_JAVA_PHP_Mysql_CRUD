package com.example.examm1_soufiane_jaida;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetailData extends AppCompatActivity {
    TextView  id,nom, prenom, bureau,poste,description,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);


        id = (TextView)findViewById(R.id.id);
        nom = (TextView)findViewById(R.id.nom);
        prenom = (TextView)findViewById(R.id.prenom);
        bureau = (TextView)findViewById(R.id.bureau);
        poste = (TextView)findViewById(R.id.poste);
        description = (TextView)findViewById(R.id.description);
        email = (TextView)findViewById(R.id.email);


        id.setText(getIntent().getStringExtra("id"));
        nom.setText(getIntent().getStringExtra("nom"));
        prenom.setText(getIntent().getStringExtra("prenom"));
        bureau.setText(getIntent().getStringExtra("bureau"));
        poste.setText(getIntent().getStringExtra("poste"));
        description.setText(getIntent().getStringExtra("description"));
        email.setText(getIntent().getStringExtra("email"));


    }
}