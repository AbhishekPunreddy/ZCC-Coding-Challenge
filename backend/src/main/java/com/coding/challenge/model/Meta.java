package com.coding.challenge.model;

public class Meta {
	private boolean has_more;
	private String after_cursor;
	private String before_cursor;

	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}

	public String getAfter_cursor() {
		return after_cursor;
	}

	public void setAfter_cursor(String after_cursor) {
		this.after_cursor = after_cursor;
	}

	public String getBefore_cursor() {
		return before_cursor;
	}

	public void setBefore_cursor(String before_cursor) {
		this.before_cursor = before_cursor;
	}

}
