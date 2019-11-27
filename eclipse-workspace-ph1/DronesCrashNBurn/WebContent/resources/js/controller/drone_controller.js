'use strict';

angular.module('myApp')
		.controller('DroneController',
				['$scope','DroneService',

						function($scope, DroneService) {
							var self = this;
							self.drone = {
								droneId : null,
								droneOwnerName : '',
								droneName : '',
								droneType : '',
								droneSpan : '',
								droneStatus : '',
								droneImage : 'planned future feature'
							};

							self.drones = [];

							self.remove = remove;
							self.reset = reset;

							fetchAllDrones();

							function fetchAllDrones() {
								DroneService.fetchAllDrones()
										.then(function(d) {
													self.drones = d;
												})
										.catch(function(errResponse) {
												console.error('Error while fetching Drones');
												});
							}

							function deleteDrones(id) {
								console.log("X1");
								console.log(DroneService.fetchAllDrones());
								console.log(id);
								DroneService.deleteDrones(id)
										.then(fetchAllDrones, function(errResponse) {
													console.error('Error while deleting Drone');
												});
							}

							function remove(id) {
								if (self.drone.id === id) {
									reset();
								}
								deleteDrones(id);
							}

							function reset() {
								self.drone = {
									droneId : null,
									droneOwnerName : '',
									droneName : '',
									droneType : '',
									droneSpan : '',
									droneStatus : '',
									droneImage : 'TBD'
								};
								$scope.myForm.$setPristine(); // reset Form
							}

						} ]);