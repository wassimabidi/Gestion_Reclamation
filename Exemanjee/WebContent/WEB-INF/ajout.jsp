<%@ taglib uri="jakarta.tags.core" prefix="c" %>
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



<div>
 <h1 align="center">Ajout réclamation</h1>
<div class="album py-5 bg-light">
    <div class="container">
      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
       
 <form  method="post" enctype="application/x-www-form-urlencoded" action="AjoutReclamation">
  <div class="mb-3">
    <label for="ID du reclamation " class="form-label">ID du reclamation </label>
   &nbsp;&nbsp; <input type="number" class="form-control" id="ID du reclamation "name="id_reclamation">
  </div>
  <div class="mb-3">
    <label for="titre" class="form-label">titre</label>
    <input type="text" class="form-control" id="titre" name="titre">
  </div>
  
   <div class="mb-3">
    <label for="description" class="form-label">description</label>
    <input type="text" class="form-control" id="description" name="description">
  </div>
   <div class="mb-3">
    <label for="id" class="form-label">Etudiant</label>
      &nbsp;&nbsp; &nbsp;<select NAME="choice"  > <br> <br> 
              <c:forEach var="item" items="${listerEtudiant}">
                <option>
                  <c:out value="${item.id}" />
                </option>
              </c:forEach>
            </select>         <br> 
  </div>
  <div class="mb-3">
    <label for="id" class="form-label">id</label>
    <input type="number" class="form-control" id="id" name="id">
    </div>
   <div class="mb-3">
    <label for="id_type" class="form-label">id_type</label>
    <input type="number" class="form-control" id="id_type" name="id_type">
    &nbsp;&nbsp; &nbsp;<select NAME="choice"  > <br> <br> 
              <c:forEach var="item" items="${listerTypeReclamation}">
                <option>
                  <c:out value="${item.type}" />
                </option>
              </c:forEach>
            </select>         <br> 
  </div>
  <div>
  <input type="submit" value="ajouter" name="action" />
 <input type="reset" value="Reset" name="reset" />
  </div>
  <div>
 
  </div>
</form>

      </div>
    </div>
</div>  
</div>  


<div>
<h1>Liste des reclamations</h1>
<table border="1" cellpadding="0" cellspacing="0"
      style="border-collapse: collapse" bordercolor="#111111"
      width="62%" id="AutoNumber1">
    <tr bgcolor="#0000FF">
        <td >Label</td>
        <td >Nom Etudiant</td>
        <td >Prenom Etudiant</td>
        <td >description</td>
        <td >type de reclamation</td>
    </tr>
    <c:forEach var="c" items="${listReclamation}" >
  <tr>
      <td ><c:out value="${c.id_reclamation}"/></td>
      <td ><c:out value="${c.etudiant.nom}"/></td>
       <td ><c:out value="${c.etudiant.prenom}"/></td>
        <td ><c:out value="${c.description}"/></td>
      <td >
      <c:out value="${c.typereclamation.type}"/></td>
  </tr>
</c:forEach> 
</table>
</div>
</div>
</body>
</html>