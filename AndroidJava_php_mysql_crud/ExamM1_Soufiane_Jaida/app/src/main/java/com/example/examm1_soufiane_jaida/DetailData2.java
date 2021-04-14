package com.example.examm1_soufiane_jaida;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetailData2 extends AppCompatActivity {
    TextView  id,nom, prenom, bureau,poste,statut,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data2);


        id = (TextView)findViewById(R.id.id);
        nom = (TextView)findViewById(R.id.nom);
        prenom = (TextView)findViewById(R.id.prenom);
        bureau = (TextView)findViewById(R.id.bureau);
        poste = (TextView)findViewById(R.id.poste);
        statut = (TextView)findViewById(R.id.statut);
        email = (TextView)findViewById(R.id.email);


        id.setText(getIntent().getStringExtra("id"));
        nom.setText(getIntent().getStringExtra("nom"));
        prenom.setText(getIntent().getStringExtra("prenom"));
        bureau.setText(getIntent().getStringExtra("bureau"));
        poste.setText(getIntent().getStringExtra("poste"));
        statut.setText(getIntent().getStringExtra("statut"));
        email.setText(getIntent().getStringExtra("email"));


    }
}
