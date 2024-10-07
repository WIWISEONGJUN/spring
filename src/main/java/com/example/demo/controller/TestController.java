package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TestService;
import com.example.demo.vo.TestVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {
	private final TestService testService;

	@RequestMapping(value = {"test"}, method = {RequestMethod.POST})
	public void test(TestVO testVO){
		testService.test(testVO);
	}
}
