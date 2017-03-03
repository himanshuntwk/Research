(function(angular) {
  'use strict';
angular.module('phonebook', [])
  .controller('PhonebookController', ['$scope','$http',function PhonebookController($scope,$http) {
    $scope.currentList = [{name:'user1',number:'12344541'},
                        {name:'user2',number:'12344542'},
                        {name:'user3',number:'12344543'},
                        {name:'user4',number:'12344544'},
                        {name:'user5',number:'12344545'}];
  
    $scope.addServerUser = function(){
    	 //var newUser = {name:$scope.newName,number:$scope.newNumber};
    	 var serverUser;
    	 $http.get('http://localhost:8080/testingService').
         then(function(response) {
        	 serverUser = response.data;
        //	 newUser.name = serverUser.name;
        //	 newUser.number = serverUser.number;
        	 
        	 $scope.currentList.push(serverUser);
        	 
         });
    	
    };
    
    $scope.addUser = function(){
   	 	var newUser = {name:$scope.newName,number:$scope.newNumber};
    	$scope.currentList.push(newUser);
   };
    
    $scope.deleteRecord = function(nameVar,numberVar){
    	var temp = $scope.currentList.shift();
    	var newList = [];
    	while(temp != undefined){
    		if(temp.name!=nameVar || temp.number != numberVar){
	    		newList.push(temp);
	    	}
    		temp = $scope.currentList.shift();
    	}
    	$scope.currentList = newList;
    };
  
  
  }]);
})(window.angular);