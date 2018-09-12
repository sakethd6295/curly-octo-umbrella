package com.iheart.station.data;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class StationDataNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(StationDataNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String stationDataNotFoundHandler(StationDataNotFoundException ex) {
		return ex.getMessage();
	}
}

