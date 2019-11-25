'use strict';

angular.module('myApp').factory('DroneService', ['$http', '$q', function($http, $q){

     var BASE_REST_URI='/DronesCrashNBurn/drones';

    var factory = {
        fetchAllDrones: fetchAllDrones,
        deleteDrone:deleteDrone
   };

    return factory;

    function fetchAllDrones() {
    	// Do NOT add a forward slash on the literal after the base uri
    	return $http.get(BASE_REST_URI).then(function(resp){
            return resp.data;
        }).catch(function(error){
            console.error('Error while fetchAllDrones');
            console.error(error);
        });
    }
   
    function deleteDrone(id) {
		console.log("inside deleteDrone JS serivce");
		console.log(id);
        return $http.delete(BASE_REST_URI + "/" + id)
            .then(
            function (response) {
        		console.log("inside deleteDrone JS serivce inner delete function");
    			console.log(response.data);
                return response.data;
            },
            function(errResponse){
                console.error('Error while deleting Drone');
                console.error(error);
            }
        );
    }
     
}]);
