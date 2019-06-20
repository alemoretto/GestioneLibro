<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pagina dei risultati</title>
</head>
<body>
	<div class="container">

		<%@ include file="../header.jsp"%>

		<div class="page-header">
			<h3>Pagina dei Risultati</h3>
		</div>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Id</th>
					<th>Titolo</th>
					<th>Genere</th>
					<th>Autore</th>
					<th>Data di pubblicazione</th>
					<th>Pagine</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listLibri }" var="libroItem">
					<tr>
						<td>${libroItem.id }</td>
						<td>${libroItem.titolo }</td>
						<td>${libroItem.genere }</td>
<%-- 						<td>${libroItem.autore }</td> --%>
						<td>${libroItem.dataPubblicazione }</td>
						<td>${libroItem.numeroPagine }</td>
						<td><a
							href="show?idLibro=${libroItem.id }"
							class="btn btn-info">Dettaglio</a> <a
							href="edit?idLibro=${libroItem.id }"
							class="btn btn-info">Modifica</a>
							<a href="delete?idLibro=${libroItem.id }"
							class="btn btn-info">Elimina</a></td>
					</tr>
				</c:forEach>


			</tbody>

		</table>
		<div class="form-group">        
	      <div class="col-sm-offset-2 col-sm-10">
	        <a href="create" class="btn btn-primary btn-md">Inserisci Nuovo Libro</a>
	      </div>
	    </div>

	</div>


</body>
</html>