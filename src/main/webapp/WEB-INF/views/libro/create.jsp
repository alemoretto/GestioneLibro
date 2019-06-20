<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci nuovo elemento</title>
</head>
<body>

<div class="container">

   <%@ include file="../header.jsp" %>
      
    <div class="page-header">
	  <h3>Pagina di Inserimento</h3>
	</div>

		<form:form class="form-horizontal" action="save" method="post" commandName="libroCommand">
      		<div class="form-group">
      			<label class="control-label col-sm-2" for="titoloId">Titolo:</label>
	    		<div class="col-sm-4">
					<form:input class="form-control" path="titolo" id="nomeId" />
					<form:errors path="titolo" cssStyle="color:red;"/>
			 	</div>
  			</div>
  			<div class="form-group">
      			<label class="control-label col-sm-2" for="genereId">Genere:</label>
	    		<div class="col-sm-4">
	    			<form:input class="form-control" path="genere" id="genereId" />
	    			<form:errors path="genere" cssStyle="color:red;"/>
			 	</div>
  			</div>
  			<div class="form-group">
      			<label class="control-label col-sm-2" for="dataPubblicazioneId">Data di pubblicazione:</label>
	    		<div class="col-sm-4">
	    			<form:input type="date" class="form-control" path="dataPubblicazione" id="dataPubblicazioneId" />
	    			<form:errors path="dataPubblicazione" cssStyle="color:red;"/>
			 	</div>
  			</div>
			<div class="form-group">
      			<label class="control-label col-sm-2" for="autoreId">Autore:</label>
	    		<div class="col-sm-4">
					<form:select path="autore.id" id="autoreId">
						<form:options items="${listaAutori}" itemLabel="nickname" itemValue="id" />
					</form:select>
					<%-- 					<form:select class="form-control" path="autore" id="autoreId" /> --%>
					<form:errors path="autore.id" cssStyle="color:red;" />
				</div>
  			</div>
			<!--  <div class="form-group">
      			<label class="control-label col-sm-2" for="autoreId">Autore:</label>
	    		<div class="col-sm-4">
					<form:input class="form-control" path="autore" id="autoreId" />
	    			<form:errors path="autore" cssStyle="color:red;"/>
			 	</div>
  			</div> -->
  			
  			<div class="form-group">        
		      <div class="col-sm-offset-2 col-sm-10">
		        <button type="submit" class="btn btn-primary btn-md">Effettua Inserimento</button>
		      </div>
		    </div>
		</form:form>
		
    </div><!-- /.container -->
    
    
</body>
</html>