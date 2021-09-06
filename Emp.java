package com.io;

import java.io.Serializable;

public class Emp implements Serializable
{
	
	public Emp(int eid, String name, int sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	private int eid;
	private String name;
	transient private int sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
