package com.mypack.assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mypack.assignment.service.ClockService;

@SpringBootTest
class SpeakingClockApplicationTests {

	@Autowired
	private ClockService service;

//	@BeforeAll
//	public void setUp() {
//		service = new ClockService();
//	}

	@Test
	public void A_test() {
		String time = "10:00";

		String result = service.convertToWords(time);

		assertEquals("It's ten", result);
	}

	@Test
	public void B_test() {
		String time = "12:00";

		String result = service.convertToWords(time);

		assertEquals("It's midday", result);
	}

	@Test
	public void C_test() {
		String time = "00:00";

		String result = service.convertToWords(time);

		assertEquals("It's midnight", result);
	}

	@Test
	public void D_test() {
		String time = "11:12";

		String result = service.convertToWords(time);

		assertEquals("It's eleven twelve", result);
	}

	@Test
	public void E_test() {
		String time = "23:34";

		String result = service.convertToWords(time);

		assertEquals("It's twenty three thirty four", result);
	}

	@Test
	public void F_test() {
		String time = "00:34";

		String result = service.convertToWords(time);

		assertEquals("It's midnight thirty four", result);
	}

	@Test
	public void G_test() {
		String time = "19:30";

		String result = service.convertToWords(time);

		assertEquals("It's nineteen thirty", result);
	}

	@Test
	public void H_test() {
		String time = "778:87";

		String result = service.convertToWords(time);

		assertEquals("Given time is not valid!", result);
	}

	@Test
	public void I_testEmpty() {
		String time = "";

		String result = service.convertToWords(time);

		assertEquals("Given time is not valid!", result);
	}

	@Test
	public void L_testNull() {

		String result = service.convertToWords(null);

		assertEquals("Given time is not valid!", result);
	}

}
