package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.TestDAO;

@Component
public class ErrorState extends State{
	private final TestDAO testDAO;

	public ErrorState(TestDAO testDAO) {
		this.testDAO = testDAO;
	}

	@Override
	public String getDailyFunc() {
		return testDAO.getDailyError();
	}

	@Override
	public String getWeeklyFunc() {
		return testDAO.getWeeklyError();
	}

	@Override
	public String getMonthlyFunc() {
		return testDAO.getMonthlyError();
	}
}
