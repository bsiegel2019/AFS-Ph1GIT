package com.drones.model;

public class Drone {

	private Long droneId;
	private String droneOwnerName;
	private String droneName;
	private String droneType; // pulldown Glider/Sport/Rotor
	private String droneSpan;
	private String droneStatus;
	private String droneImage; // figure out type later

	public Drone() {
		this.droneImage = "future feature BTW";
	}

	public Drone(Long droneId, String droneOwnerName, String droneName, String droneType, String droneSpan,
			String droneStatus, String droneImage) {
		this.droneId = droneId;
		this.droneOwnerName = droneOwnerName;
		this.droneName = droneName;
		this.droneType = droneType;
		this.droneSpan = droneSpan;
		this.droneStatus = droneStatus;
		this.droneImage = droneImage;
	}

	public Long getDroneId() {
		return droneId;
	}

	public void setDroneId(Long droneId) {
		this.droneId = droneId;
	}

	public String getDroneOwnerName() {
		return droneOwnerName;
	}

	public void setDroneOwnerName(String droneOwnerName) {
		this.droneOwnerName = droneOwnerName;
	}

	public String getDroneName() {
		return droneName;
	}

	public void setDroneName(String droneName) {
		this.droneName = droneName;
	}

	public String getDroneType() {
		return droneType;
	}

	public void setDroneType(String droneType) {
		this.droneType = droneType;
	}

	public String getDroneSpan() {
		return droneSpan;
	}

	public void setDroneSpan(String droneSpan) {
		this.droneSpan = droneSpan;
	}

	public String getDroneStatus() {
		return droneStatus;
	}

	public void setDroneStatus(String droneStatus) {
		this.droneStatus = droneStatus;
	}

	public String getDroneImage() {
		return droneImage;
	}

	public void setDroneImage(String droneImage) {
		this.droneImage = droneImage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (droneId ^ (droneId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Drone))
			return false;
		Drone other = (Drone) obj;
		if (droneId != other.droneId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Drone [droneId=" + droneId + ", droneOwnerName=" + droneOwnerName + ", droneName=" + droneName
				+ ", droneType=" + droneType + ", droneSpan=" + droneSpan + ", droneStatus=" + droneStatus
				+ ", droneImage=" + droneImage + "]";
	}

}
