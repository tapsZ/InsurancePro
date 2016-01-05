<!Doctype html>
<html data-ng-app>
<head>
<title>Request</title>
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
			<h1 class="custom">Request Form</h1>
		</div>
			
		<div class="MainBody">


			<form id="main">
				<table>
					<tr>
						<td class="display_bold"><label for="actor.name">Which
								policy would you like a qoute on?</label></td>
					</tr>
					<tr>
					<td class="display"><label class="radio-inline"><input
							type="radio" name="optradio">House</label> <label
						class="radio-inline"><input type="radio" name="optradio">Life</label> <label class="radio-inline"><input type="radio"
							name="optradio">Motor</label></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">ID Number:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="request.idNo"
							size="20"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">First Name:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="request.firstName" size="30"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Surname:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text"
							data-ng-model="request.surname" size="30"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Email:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="request.email"
							size="30"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Image:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text" data-ng-model="request.image"
							size="30"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Mobile
								Number:</label></td>
					</tr>
					<tr>
						<td class="display"><input type="text"
							data-ng-model="request.mobileNo" size="10"></td>
					</tr>
					<tr>
						<td class="display_bold"><label for="name">Comment:</label></td>
					</tr>
					<tr>

						<td class="display">  <textarea class="form-control" rows="5" data-ng-model="request.comment" id="comment"></textarea></td>
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