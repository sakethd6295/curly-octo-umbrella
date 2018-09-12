package com.iheart.station.data;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class StationController {
	
	private final StationRepository repository;
	
	StationController(StationRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/search-station")
	List<StationData> all() {
		return repository.findAll();
	}

	@PostMapping("/add-station")
	StationData newStationData(@RequestBody StationData newStationData) {
		return repository.save(newStationData);
	}
	
	@PutMapping("/update-station/{id}")
	StationData replaceStationData(@RequestBody StationData newStationData, @PathVariable Long id) {

		return repository.findById(id)
			.map(stationData -> {
				stationData.setStationId(newStationData.getStationId());
				stationData.setName(newStationData.getName());
				stationData.setHdEnabled(newStationData.isHdEnabled());
				stationData.setCallSign(newStationData.getCallSign());
				return repository.save(stationData);
			})
			.orElseGet(() -> {
				newStationData.setId(id);
				return repository.save(newStationData);
			});
	}

}
