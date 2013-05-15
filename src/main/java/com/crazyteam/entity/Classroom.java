package com.crazyteam.entity;
/**
 * 
 * 
 * @author jiangsuyong
 *
 */
public class Classroom {
	private Integer id;
	private Integer buildNumber;//教学楼编号 1表示1教
	private Integer number;//教师编号，比如101 一楼第一个教室
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBuildNumber() {
		return buildNumber;
	}
	public void setBuildNumber(Integer buildNumber) {
		this.buildNumber = buildNumber;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
}
