package com.TruckApi.TruckApi.Model;

import java.util.UUID;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.TruckApi.TruckApi.entities.TruckData.TruckType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckUpdateRequest {
	
	private String imei;
	private Boolean truckApproved;
	private  long passingWeight;
	private String driverId;	
	private Integer tyres;

	@Enumerated(EnumType.STRING)
	private TruckType truckType;
	
	public enum TruckType {
		OPEN_HALF_BODY, OPEN_FULL_BODY, FLATBED, HALF_BODY_TRAILER, FULL_BODY_TRAILER, STANDARD_CONTAINER, HIGH_CUBE_CONTAINER;
	  }

}
