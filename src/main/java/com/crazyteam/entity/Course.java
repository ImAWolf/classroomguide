package com.crazyteam.entity;
/**
 * 
 * 
 * @author jiangsuyong
 *
 */
public class Course {
	private Integer id;
	private String name;//课程名
	private Integer startWeek;
	private Integer endWeek;
	/*老师的名字，由于想把系统设置简单，
	 * 就直接在课程上写老师名字。可以在实际
	 * 可能存在两个老师有相同的名字*/
	private String teacher;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStartWeek() {
		return startWeek;
	}
	public void setStartWeek(Integer startWeek) {
		this.startWeek = startWeek;
	}
	public Integer getEndWeek() {
		return endWeek;
	}
	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
}
