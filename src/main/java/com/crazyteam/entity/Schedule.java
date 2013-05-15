package com.crazyteam.entity;
import com.crazyteam.util.WeekDay;

/**
 * 
 * 
 * @author jiangsuyong
 *
 */
public class Schedule {
	private Integer id;
	private Course course;//对应的课程
	private WeekDay weekDay;//枚举类型，表示周几，
	private Integer lession;//表示第几节课
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public WeekDay getweekDay(){
		return weekDay;
	}
	public void setweekDay(WeekDay weekDay){
		this.weekDay=weekDay;
	}
	public Integer getLession() {
		return lession;
	}
	public void setLession(Integer lession) {
		this.lession = lession;
	}
	public Classroom getClassroom() {
		return classroom;
	}
	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}
	private Classroom classroom;//对应的教室
	
}
