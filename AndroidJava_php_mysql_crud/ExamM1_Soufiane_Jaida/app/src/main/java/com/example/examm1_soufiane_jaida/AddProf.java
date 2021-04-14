package com.example.examm1_soufiane_jaida;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AddProf extends AppCompatActivity {

    Button btn1;
    EditText  nom, prenom, bureau, poste, statut,email;
    String   Nom, Prenom, Bureau, Poste, Statut,Email;
    ProgressDialog progressDialog;
    Boolean valid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addprof);

        nom = (EditText) findViewById(R.id.nom);
        prenom = (EditText) findViewById(R.id.prenom);
        bureau = (EditText) findViewById(R.id.bureau);
        poste = (EditText) findViewById(R.id.poste);
        statut = (EditText) findViewById(R.id.statut);
        email = (EditText) findViewById(R.id.email);

        progressDialog = new ProgressDialog(this);

        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Nom = nom.getText().toString();
                Prenom = prenom.getText().toString();
                Poste = poste.getText().toString();
                Bureau = bureau.getText().toString();
                Statut = statut.getText().toString();
                Email = email.getText().toString();

// des conditions pour valider et obliger le user a bien rentrer les valeur


                if (TextUtils.isEmpty(Nom)) {
                    nom.setError("NOM Cannot be Empty");
                    valid = false;
                } else {
                    valid = true;
                }
                if (TextUtils.isEmpty(Prenom)) {
                    prenom.setError("PRENOM Cannot be Empty");
                    valid = false;
                } else {
                    valid = true;
                }

                if (TextUtils.isEmpty(Bureau)) {
                    bureau.setError("BUREAU Cannot be Empty");
                    valid = false;
                } else {
                    valid = true;
                }

                if (TextUtils.isEmpty(Poste)) {
                    poste.setError("POSTE Cannot be Empty");
                    valid = false;
                } else {
                    valid = true;
                }
                if (TextUtils.isEmpty(Statut)) {
                    statut.setError("STATUT Cannot be Empty");
                    valid = false;
                } else {
                    valid = true;
                }


//si la previous condition et valid , on envoie un string request pr recupérer le lien contenant le script php
                if (valid) {
                    progressDialog.setMessage("Loading...");
                    progressDialog.show();

                    StringRequest stringRequest = new StringRequest(Request.Method.POST, ConnectionToScripts.URL_addprof, new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            progressDialog.dismiss();
                            try {
                                //A JSONObject is an unordered collection of key and value pairs, resembling Java's native Map implementations. Keys are unique Strings that cannot be null. Values can be anything from a Boolean, Number, String, JSONArray or even a JSONObject.NULL object.
                                JSONObject jsonObject = new JSONObject(response);
                                Toast.makeText(AddProf.this, jsonObject.getString("message"), Toast.LENGTH_SHORT).show();
                                if (jsonObject.getString("message").equals("Successfully registered ! Welcome to the squad")) {
                                    ListActivity.ma.refresh_list();
                                    finish();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            progressDialog.hide();
                            Toast.makeText(AddProf.this, "Failed ! you're not welcome yet...", Toast.LENGTH_SHORT).show();
                        }
                    }) {
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String, String> params = new HashMap<>();
                            params.put("nom", Nom);
                            params.put("prenom", Prenom);
                            params.put("bureau", Bureau);
                            params.put("poste", Poste);
                            params.put("statut", Statut);
                            params.put("email", Email);

                            return params;
                        }
                    };
                    //Represents a request for handling an SSL error. A Handler allows you to send and process Message and Runnable objects associated with a thread's MessageQueue . Each Handler instance is associated with a single thread and that thread's message queue. When you create a new Handler it is bound to a Looper
                    RequestHandler.getInstance(AddProf.this).addToRequestQueue(stringRequest);

                }
            }
        });

    }
}