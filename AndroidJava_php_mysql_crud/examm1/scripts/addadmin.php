<?php
include 'connection.php';

$nom = $_POST['nom'];
$prenom = $_POST['prenom'];
$bureau = $_POST['bureau'];
$poste = $_POST['poste'];
$description = $_POST['description'];
$email = $_POST['email'];


$response = array();
$query = mysqli_query($con, "INSERT INTO tableadmin (nom, prenom,bureau,poste,description,email) VALUES ('$nom','$prenom','$bureau','$poste','$description','$email')");

if($query){
  $response['success'] = 'true';
  $response['message'] = 'Data Inserted Successfully !';
}else{
  $response['success'] = 'false';
  $response['message'] = 'Data Insertion Failed...';
}

echo json_encode($response);
?>

