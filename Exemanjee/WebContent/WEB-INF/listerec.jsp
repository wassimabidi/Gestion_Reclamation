<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>liste de reclamation</title>
</head>
<body>

<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiDTLceqTCXUOTMuZDY_42C4fvKLiwRKgtPQ&usqp=CAU" width=80%>
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
      <td><a href="Activer"><input type="button" value="activer"></td></a>
      <td><a href="Desactiver"><input type="button" value="desactiver"></td></a>
  </tr>
</c:forEach> 
</table>
</body>
</html>