<?php
include 'connection.php';


$nom = $_POST['nom'];
$prenom = $_POST['prenom'];
$bureau = $_POST['bureau'];
$poste = $_POST['poste'];
$statut = $_POST['statut'];
$email = $_POST['email'];


$response = array();
$query = mysqli_query($con, "INSERT INTO tableprof (nom, prenom,bureau,poste,statut,email) VALUES ('$nom','$prenom','$bureau','$poste','$statut','$email')");

if($query){
  $response['success'] = 'true';
  $response['message'] = 'Data Inserted Successfully';
}else{
  $response['success'] = 'false';
  $response['message'] = 'Data Insertion Failed';
}

echo json_encode($response);
?>
