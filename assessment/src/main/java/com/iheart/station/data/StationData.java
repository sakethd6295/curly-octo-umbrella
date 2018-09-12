package com.iheart.station.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
class StationData {

	@Id 
	@GeneratedValue 
	private Long id;
	private String stationId;
	private String name;
	private boolean hdEnabled;
	private String callSign;
	
	StationData(String stationId, String name, boolean hdEnabled, String callSign) {
		this.stationId = stationId;
		this.name = name;
		this.hdEnabled = hdEnabled;
		this.callSign = callSign;	
	}

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHdEnabled() {
		return hdEnabled;
	}

	public void setHdEnabled(boolean hdEnabled) {
		this.hdEnabled = hdEnabled;
	}

	public String getCallSign() {
		return callSign;
	}

	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
