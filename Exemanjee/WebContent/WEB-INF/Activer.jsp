
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
</head>
<body>
<h1 align="center">Activer Compte</h1>
<div class="album py-5 bg-light">
    <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
      <form  method="post" enctype="application/x-www-form-urlencoded" action="Activer">
       <div class="mb-3">
    <label for="NOM" class="form-label">NOM</label>
    <input type="text" class="form-control" id="NOM" name="nom">
  </div>
   <div class="mb-3">
    <label for="PRENOM" class="form-label">PRENOM</label>
    <input type="text" class="form-control" id="PRENOM" name="prenom">
  </div>
  <div>
  <input type="submit" value="Update" name="action" />

  </div>
  </div>
  </form>

      </div>
    </div>
</div>    
</body>
</html>