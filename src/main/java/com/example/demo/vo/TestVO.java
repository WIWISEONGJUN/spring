package com.example.demo.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class TestVO {
	private String timeRange;
	private String workType;

	public TestVO(String workType, String timeRange) {
		this.workType = workType;
		this.timeRange = timeRange;
	}
}
