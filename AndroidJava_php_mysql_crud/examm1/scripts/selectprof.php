<?php
include 'connection.php';
$query = mysqli_query($con, "SELECT * FROM tableadmin");
$data = array();
$qry_array = array();
$i = 0;
$total = mysqli_num_rows($query);
while ($row = mysqli_fetch_array($query)) {

  $data['id'] = $row['id'];
  $data['nom'] = $row['nom'];
  $data['prenom'] = $row['prenom'];
  $data['bureau'] = $row['bureau'];
  $data['poste'] = $row['poste'];
  $data['statut'] = $row['statut'];
  $data['email'] = $row['email'];


  $qry_array[$i] = $data;
  $i++;
}

if($query){
  $response['success'] = 'true';
  $response['message'] = 'Data Loaded Successfully !';
  $response['total'] = $total;
  $response['data'] = $qry_array;
}else{
  $response['success'] = 'false';
  $response['message'] = 'Data Loading Failed...';
}

echo json_encode($response);
?>

