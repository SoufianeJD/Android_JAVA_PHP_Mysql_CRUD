package com.example.examm1_soufiane_jaida;

public class ClassAdmin{
    String  id,nom,prenom, bureau, poste,description,email;

public ClassAdmin (String id,String nom,String prenom,String bureau,String poste,String description,String email ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
        this.poste = poste;
        this.description = description;
        this.email = email;
        }
public String getId(){ return id; }
public String getNom(){ return nom; }
public String getPrenom(){ return prenom; }
public String getBureau(){ return bureau; }
public String getPoste(){ return poste; }
public String getDescription(){ return description; }
public String getEmail(){ return email; }

        }
