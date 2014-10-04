<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Icaras - personenlijst</title>
<link href="includes/icaras.css" rel="stylesheet" type="text/css">
</head>

<body>
<table width="85%" border="1" align="center" cellpadding="0"
	cellspacing="0">
	<tr> <td>
	<table width="100%" border="0" align="center" cellpadding="4"
		cellspacing="0" bordercolor="#CCCCCC">
        <tr bgcolor="#c00000">
			<td width="90%" height="60" valign="middle">
			<h1 align="center">Personenlijst</h1>
			</td>
	        
		</tr>
		<tr>
			<td align="center">
			
		Hieronder staan alle personen die op dit moment in de database staan.</td>
		</tr>
		</table>
		
		<table border="1" align="center" cellpadding="8" cellspacing="0">
			
				<th>PersoonId</th>
				<th>Voornaam</th>
				<th>Straat</th>
				<th>Huisnummer</th>
				<th>Postcode</th>
				<th>Plaatsnaam</th>
			
			<tr>
			<c:if test="${not empty personen}">
			<c:forEach items="${personen}" var="persoon">
				<tr>
					<td align="center"><c:out 
					value="${persoon.persoonID}" />
					</td>
					<td align="center">
					<c:out value="${persoon.voornaam}" />
					</td>
					<td align="center"><c:out 
					value="${persoon.adres.straat}" />
					</td>
					<td align="center">
					<c:out value="${persoon.adres.huisnummer}" />
					</td>
					<td align="center"><c:out 
					value="${persoon.adres.postcode}" />
					</td>
					<td align="center"><c:out 
					value="${persoon.adres.plaatsnaam}" />
					</td>
					</tr>
				</c:forEach>
				</c:if>
				<tr>
	<td colspan="6" align="center"><a href="voegtoe">Voeg een persoon toe.</a></td>
				</tr>
	</table>
	</td></tr>
</table>
</body>
</html>
