'use strict';

angular.module('myApp').factory('DroneService', ['$http', function($http){

		console.log("ERK!");
		
     var BASE_REST_URI='/DronesCrashNBurn/drones';

    var factory = {
        fetchAllDrones: fetchAllDrones,
        deleteDrones:deleteDrones
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
   
    function deleteDrones(id) {
    	console.log("X2");
        return $http.delete(BASE_REST_URI + "/" + id)
            .then(function (response) {
                return response.data;
            }).catch( function(errResponse){
                console.error('Error while deleting Drone');
                console.error(error);
            });
    }
     
}]);
