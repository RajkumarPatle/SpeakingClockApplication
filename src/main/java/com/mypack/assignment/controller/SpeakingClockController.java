package com.mypack.assignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mypack.assignment.service.ClockService;

@RestController
public class SpeakingClockController {

	@Autowired
	private ClockService service;

	@GetMapping(value = "/getTimeinWord/{time}")
	public String getTime(@PathVariable(value = "time") String time) {
		String convertToWords = service.convertToWords(time);

		return convertToWords;

	}

}
