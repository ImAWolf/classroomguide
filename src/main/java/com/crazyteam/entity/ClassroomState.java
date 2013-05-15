package com.crazyteam.entity;

import java.util.Date;

/**
 * 
 * @author jiangsuyong
 *
 */
public class ClassroomState {
	private Integer id;
	private Integer state;//表示教室状态，0表示很空，1表示人少，2一半坐了，3人多，4爆满
	private Classroom classroom;//教室
	/*为了在每隔半个钟生成一个教室状态
	 * 所以要记录时间，由于状态不是时时刻刻都生成，
	 * 所以把一天分成47段，用来表示一天的时间，
	 * 比如 0表示0：00 ， 1表示0：30 ，2表示 1：00
	 * 这样一次46表示23：30 ，由于24:00和0：00一样的所以
	 * 合在一起 */
	private Integer time;
	private Date day;//日期
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
}
