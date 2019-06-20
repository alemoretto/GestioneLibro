<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerca Libro</title>
</head>
<body>

<div class="container">

   <%@ include file="../header.jsp" %>
      
    <div class="page-header">
	  <h3>Cerca un Libro</h3>
	</div>

		<form:form class="form-horizontal" action="list" method="post" commandName="libroCommand">
      		<div class="form-group">
      			<label class="control-label col-sm-2" for="titoloId">Titolo:</label>
	    		<div class="col-sm-4">
					<input class="form-control" type="text" id="titoloId" name="titolo" >
			 	</div>
  			</div>
  			<div class="form-group">
      			<label class="control-label col-sm-2" for="genereId">Genere:</label>
	    		<div class="col-sm-4">
					<input class="form-control" type="text" id="genereId" name="genere" >
			 	</div>
  			</div>
<!--   			<div class="form-group"> -->
<!--       			<label class="control-label col-sm-2" for="autoreId">Autore:</label> -->
<!-- 	    		<div class="col-sm-4"> -->
<!-- 					<input class="form-control" type="text" id="autoreId" name="autore" > -->
<!-- 			 	</div> -->
<!--   			</div> -->
			<div class="form-group">
      			<label class="control-label col-sm-2" for="dataPubblicazioneId">Data di pubblicazione:</label>
	    		<div class="col-sm-4">
					<input class="form-control" type="date" id="dataPubblicazioneId" name="dataPubblicazione" >
			 	</div>
  			</div>
  			
  			<div class="form-group">        
		      <div class="col-sm-offset-2 col-sm-10">
		        <button type="submit" class="btn btn-primary btn-md">Cerca</button>
		        <a href="create" class="btn btn-primary btn-md">Inserisci Nuovo Libro</a>
		      </div>
		    </div>
		</form:form>
		
		<a href="${pageContext.request.contextPath}/ProvaServlet" class="btn btn-primary btn-md">Prova Servlet</a>
    </div><!-- /.container -->

</body>
</html>