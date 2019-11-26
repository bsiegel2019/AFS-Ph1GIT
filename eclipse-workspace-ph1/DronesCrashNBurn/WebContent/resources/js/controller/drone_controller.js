'use strict';

angular
		.module('myApp')
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
								droneImage : 'future feature'
							};

							self.drones = [];

							self.remove = remove;
							self.reset = reset;

							fetchAllDrones();

							function fetchAllDrones() {
								DroneService.fetchAllDrones()
										.then(function(d) {
													self.drones = d;
												},
												function(errResponse) {
													console.error('Error while fetching Drones');
												});
							}

							function deleteDrone(id) {
								DroneService.deleteDrone(id)
										.then(fetchAllDrones,
												function(errResponse) {
													console.error('Error while deleting Drone');
												});
							}

							function remove(id) {
								if (self.drone.id === id) {
									reset();
								}
								deleteDrone(id);
							}

							function reset() {
								self.drone = {
									droneId : null,
									droneOwnerName : '',
									droneName : '',
									droneType : '',
									droneSpan : '',
									droneStatus : '',
									droneImage : 'future feature'
								};
								$scope.myForm.$setPristine(); // reset Form
							}

						} ]);