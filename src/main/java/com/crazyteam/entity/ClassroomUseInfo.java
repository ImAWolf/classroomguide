package com.crazyteam.entity;

import java.util.Date;

import com.crazyteam.util.WeekDay;

/**
 * 教室使用情况实体类
 * 存储用户向系统提交的教教室使用情况
 * @author jiangsuyong
 *
 */
public class ClassroomUseInfo {
	private Integer id;
	private Classroom classroom;//教室
	private User user;
	/*表示教室状态，
	*0表示很空，1表示人少，
	*2一半坐了，3人多，4爆满*/
	private Integer state;
	private float weight;//用户的信用度权重
	/*
	 * 根据用户提交的时间生成对应的时间
	 * 比如在 7：00~7：30提交数据，把他归类到7：30提交的数据
	 * 把一天分成47段，用来表示一天的时间，
	 * 比如 0表示0：00 ， 1表示0：30 ，2表示 1：00
	 * 这样一次46表示23：30 ，由于24:00和0：00一样的所以
	 * 合在一起
	 *    */
	private Integer time;
	private WeekDay weekDay;
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public WeekDay getWeekDay() {
		return weekDay;
	}
	public void setWeekDay(WeekDay weekDay) {
		this.weekDay = weekDay;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
