package com.collection;

import java.time.LocalDateTime;

public class Mail {
	private int mailid;
	private String from;
	private String subject;
	private String body;
	private LocalDateTime rec_time;

	public Mail() {
		super();
	}

	public Mail(int mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}

	@Override
	public String toString() {
		return "Mail [mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time + "]";
	}

	public int getMailid() {
		return mailid;
	}

	public void setMailid(int mailid) {
		this.mailid = mailid;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getRec_time() {
		return rec_time;
	}

	public void setRec_time(LocalDateTime rec_time) {
		this.rec_time = rec_time;
	}

}
