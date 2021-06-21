package com.Booking.Booking.Model;

import java.util.List;

import lombok.Data;


public @Data class BookingPutRequest {

	private Long rate;
	private String unitValue;
	private List<String> truckId;
	private Boolean cancel;
	private Boolean completed;
	private String bookingDate;
	private String completedDate;
	
}
