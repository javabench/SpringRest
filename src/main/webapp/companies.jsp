<!doctype html>
<html ng-app>
	<head>
		<title>Hello AngularJS</title>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.8/angular.min.js"></script>
    	<script type='text/javascript'>
function Hello($scope, $http) {
    $http.get('http://localhost:8080/SpringRest/dbcompanies').
        success(function(data) {
            $scope.greeting = data;
        });
}</script>
	</head>

	<body>
		<div ng-controller="Hello">
			<p>The ID is {{greeting.compId}}</p>
			<p>The content is {{greeting.compName}}</p>
		</div>
	</body>
</html>