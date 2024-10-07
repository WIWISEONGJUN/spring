package com.example.demo.service;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.vo.TestVO;

@SpringBootTest
class TestServiceTest {
	@Autowired
	private TestService testService;

	@Test
	void stateTest1() {
		TestVO testVO = new TestVO("Error","Daily");
		String testString = testService.test(testVO);
		assertThat(testString).isEqualTo("DailyError") ;
	}

	@Test
	void stateTest2() {
		TestVO testVO = new TestVO("Error","Weekly");
		String testString = testService.test(testVO);
		assertThat(testString).isEqualTo("WeeklyError") ;
	}

	@Test
	void stateTest3() {
		TestVO testVO = new TestVO("Perf","Monthly");
		String testString = testService.test(testVO);
		assertThat(testString).isEqualTo("MonthlyPerf") ;
	}
}