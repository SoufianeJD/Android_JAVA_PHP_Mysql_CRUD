package com.example.examm1_soufiane_jaida;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private List<ClassAdmin> listItems;

    private Context context;
    private ProgressDialog dialog;


    public MyAdapter(List<ClassAdmin> listItems, Context context ) {
        this.listItems = listItems;
        this.context = context;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView id, nom, prenom, bureau, poste, description,email;
        public CardView card_view;
        public ViewHolder(View itemView ) {
            super(itemView);
             id = (TextView) itemView.findViewById(R.id.id);
            nom = (TextView) itemView.findViewById(R.id.nom);
            prenom = (TextView) itemView.findViewById(R.id.prenom);
            bureau = (TextView) itemView.findViewById(R.id.bureau);
            poste = (TextView) itemView.findViewById(R.id.poste);
            description = (TextView) itemView.findViewById(R.id.description);
            email = (TextView) itemView.findViewById(R.id.email);

            card_view = (CardView) itemView.findViewById(R.id.card_view);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final ClassAdmin listItem = listItems.get(position);

        holder.id.setText(listItem.getId());
        holder.nom.setText(listItem.getNom());
        holder.prenom.setText(listItem.getPrenom());
        holder.bureau.setText(listItem.getBureau());
        holder.poste.setText(listItem.getPoste());
        holder.description.setText(listItem.getDescription());
        holder.email.setText(listItem.getEmail());


        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                Intent intent;
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                final ProgressDialog dialog = new ProgressDialog(view.getContext());
                dialog.setMessage("Loading Data...");
                final CharSequence[] dialogitem = {"Les Details"};
                builder.setTitle(listItem.getNom());
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i){
                            case 0 :
                                Intent intent = new Intent(view.getContext(), DetailData.class);

                                intent.putExtra("id",listItem.getId());
                                intent.putExtra("nom",listItem.getNom());
                                intent.putExtra("prenom",listItem.getPrenom());
                                intent.putExtra("bureau", listItem.getBureau());
                                intent.putExtra("poste", listItem.getPoste());
                                intent.putExtra("description", listItem.getDescription());
                                intent.putExtra("email", listItem.getEmail());


                                view.getContext().startActivity(intent);
                                break;


                        }
                    }
                });

                builder.create().show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
}