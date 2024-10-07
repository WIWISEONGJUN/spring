package com.example.demo.dao;

import org.springframework.stereotype.Repository;

import com.example.demo.vo.TestVO;

@Repository
public class TestDAO {
	public String getDailyError() {
		return "DailyError";
	}
	public String getDailyPerf() {
		return "DailyPerf";
	}
	public String getWeeklyError() {
		return "WeeklyError";
	}
	public String getWeeklyPerf() {
		return "WeeklyPerf";
	}
	public String getMonthlyError() {
		return "MonthlyError";
	}
	public String getMonthlyPerf() {
		return "MonthlyPerf";
	}
}
