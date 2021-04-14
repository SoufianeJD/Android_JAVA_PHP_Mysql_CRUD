package com.example.examm1_soufiane_jaida;

public class ClassProf {
    String  id,nom,prenom, bureau, poste,statut,email;

    public ClassProf (String id,String nom,String prenom,String bureau,String poste,String statut,String email ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        this.poste = poste;
        this.statut = statut;
        this.email = email;
    }
    public String getId(){ return id; }
    public String getNom(){ return nom; }
    public String getPrenom(){ return prenom; }
    public String getBureau(){ return bureau; }
    public String getPoste(){ return poste; }
    public String getStatut(){ return statut; }
    public String getEmail(){ return email; }

}