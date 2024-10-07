package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDAO;
import com.example.demo.domain.ErrorState;
import com.example.demo.domain.PerfState;
import com.example.demo.domain.State;
import com.example.demo.vo.TestVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestService {
	private final TestDAO testDAO;
	public String test(TestVO testVO) {
		State state;
		if(testVO.getWorkType().equals("Error")){
			state = new ErrorState(testDAO);
		}else{
			state = new PerfState(testDAO);
		}

		if(testVO.getTimeRange().equals("Daily")){
			return state.getDailyFunc();
		}else if(testVO.getTimeRange().equals("Weekly")){
			return state.getWeeklyFunc();
		}else if(testVO.getTimeRange().equals("Monthly")){
			return state.getMonthlyFunc();
		}
		return "";
	}
}
