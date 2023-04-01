<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
    <h1>Ajout de Etudiant</h1>
    <form method="POST" action="AjoutEtudiant">
         ID   : &nbsp;&nbsp;  <input type="number" name="id" required="required"/>  <br>  <br>        
         EMAIL:   <input type="text" name="email" size="20" />   <br>  <br>  
         PASSWORD :   <input type="text" name="password" size="20" />  <br>   <br>      
         NOM :   <input type="text" name="nom" size="20" /> <br><br>
         PRENOM:   <input type="text" name="prenom" size="20" /> <br><br>
              <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
    </form>

</body>
</html>