(function() {
  var app = angular.module("requestApp", []);
       
  
    $scope.getRequest= function() {
      var response = $http.get('/insurancepro/webapi/requests/');
       
      response.success(function(data) {
        $scope.request = data;
        $scope.operation="update";
        $scope.isSaveDisabled = false;
        $scope.isDeleteDisabled = false;
        })
       
      response.error(function(data, status, headers, config) {
        alert("AJAX failed to get data, status=" + status);
      })
    };
     
    
    $scope.clearForm = function() {
      $scope.request = {
          id:'',
          firstName:'',
          surname:'',
           email:'',
          image:'',
          mobileNo:'',
          comment:''
      };
    }
     
    $scope.addNew = function(element) {
      $scope.operation="create";
      $scope.clearForm();
      main.idNo.focus();
      $scope.isSaveDisabled = false;
      $scope.isDeleteDisabled = true;
    }
     
    $scope.saveRequest = function() {
      $scope.jsonObj = angular.toJson($scope.request, false);
      console.log("[update] data: " + $scope.jsonObj);
 
      if ($scope.operation == "update") {
        var response = $http.put('/insurancepro/webapi/requests/', $scope.jsonObj);
        response.success(function(data, status, headers, config) {
          $scope.resetSearch();
          });
         
        response.error(function(data, status, headers, config) {
          alert("AJAX failed to get data, status=" + status);
        })
      } else if ($scope.operation == "create") {
        var response = $http.post('/insurancepro/webapi/requests/add', $scope.jsonObj);
        response.success(function(data, status, headers, config) {
          $scope.resetSearch();
          });
         
        response.error(function(data, status, headers, config) {
          alert("AJAX failed to get data, status=" + status);
        })  
      }
    };
     
})();