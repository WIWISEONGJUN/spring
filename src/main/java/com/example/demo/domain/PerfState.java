package com.example.demo.domain;

import org.springframework.stereotype.Component;

import com.example.demo.dao.TestDAO;

@Component
public class PerfState extends State {
	private final TestDAO testDAO;

	public PerfState(TestDAO testDAO) {
		this.testDAO = testDAO;
	}

	@Override
	public String getDailyFunc() {
		return testDAO.getDailyPerf();
	}

	@Override
	public String getWeeklyFunc() {
		return testDAO.getWeeklyPerf();
	}

	@Override
	public String getMonthlyFunc() {
		return testDAO.getMonthlyPerf();
	}
}
