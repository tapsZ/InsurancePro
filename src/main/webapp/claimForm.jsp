<!Doctype html>
<html data-ng-app>
<head>
<title>Claim</title>
<link href="include/styles.css" rel="stylesheet">
<!-- Use Bootstrap -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

<script type="text/javascript" src="include/requestApp.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body data-ng-controller="HttpCtrl as app">

	<div class="container">
		<div class="header">
			<h1 class="custom">Claim Form</h1>
		</div>
			
		<div class="MainBody">


			<form id="main">
				<table>
					<tr>
						<td class="display_bold"><label for="name">Policy Number</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="claim.idNo"
							size="20"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Evidence:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="claim.evidence" size="30"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Description:</label></td>
					</tr>
					<tr>
						<td class="display">  <textarea class="form-control" rows="5" data-ng-model="claim.description" id="comment"></textarea></td>
					</tr>
					
					<tr>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td><button data-ng-click="submitClaim(Claim)"
											class="btn btn-success btn-sm"
											data-ng-disabled="isSaveDisabled">
											<span class="glyphicon glyphicon-plus"></span> Submit
										</button></td>

								</tr>
							</table>
						</td>
					</tr>

				</table>
			</form>
		</div>
	</div>
</body>
</html>