<!DOCTYPE html>
<html ng-app = "myApp">
<head>
<meta charset="ISO-8859-1">
<title>CompanyClient</title>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

</head>
<body ng-controller = "companyController">

<table cellpading="2" cellspacing="2" border="1">
<tr>
     <th>CompanyId</th>
     <th>Name</th>
     <th>Address</th>
     <th>City</th>
     <th>Country</th>    
</tr>  
<tr ng-repeat= "company in result">

    <td>{{company.compId}}</td>
    <td>{{company.compName}}</td>
    <td>{{company.ddress}}</td>
    <td>{{company.city}}</td>
    <td>{{company.country}}</td>
    
</tr>

</table>
<script type = "text/javascript">
angular.module('myApp', []).controller('companyController',function($scope,$http){
	
	$http.get("http://localhost:8080/SpringRest/dbcompanies")
	.then( function(response){
		$scope.result = response.companies;
	});
});
</script>
</body>
</html>