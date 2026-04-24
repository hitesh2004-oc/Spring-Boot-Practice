package com.app.first;

// Bean - Private Dependency
public class Learn {
	private int sid;
	private String sname;
	
	// alt + SHift + s;
	public Learn() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Learn [sid=" + sid + ", sname=" + sname + "]";
	}
	
    
	
	
	

}
