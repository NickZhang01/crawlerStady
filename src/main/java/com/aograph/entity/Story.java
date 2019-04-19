package com.aograph.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "t_story")
public class Story implements Serializable {

	private static final long serialVersionUID = 1854996605034612378L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	@Column(name = "is_send")
	private String isSend;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsSend() {
		return isSend;
	}
	public void setIsSend(String isSend) {
		this.isSend = isSend;
	}
	
	
}
