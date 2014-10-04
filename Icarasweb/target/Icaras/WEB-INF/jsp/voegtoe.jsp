<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Voeg een persoon toe aan de database</title>
</head>
<body>
<h1>Geef de naam voor een toe te voegen persoon op</h1>
    <form:form action="voegtoe" method="post" commandName="persoon">
    	<p>Id: wordt automatisch door Hibernate gegenereerd</p>
        <p>Voornaam: <form:input path="voornaam" /></p>
        <p>Postcode: <form:input path="adres.postcode" /></p>
        <p>Huisnummer: <form:input path="adres.huisnummer" /></p>
        <p>Straat: <form:input path="adres.straat"/></p>
        <p>Plaatsnaam: <form:input path="adres.plaatsnaam"/>
        <p><input type="submit" value="Voeg persoon toe" /> <input type="reset" value="Wis invoer" /></p>
    </form:form>
</body>
</html>