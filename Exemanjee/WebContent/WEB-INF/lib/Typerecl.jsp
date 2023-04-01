<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Ajout de Typereclamation</h1>
   <form method="POST" action="AjoutTypereclamation">
   ID_type   : &nbsp;&nbsp;  <input type="number" name="id_type" required="required"/>  <br>  <br>        
         type:   <input type="text" name="type" size="20" />   <br>  <br> 
          <input type="submit" value="ajouter" name="action" />
              <input type="reset" value="Reset" name="reset" />
   </form>
</body>
</html>