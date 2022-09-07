package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tutorials")
@Getter
@Setter
@ToString
public class Tutorials extends BaseEntity {
	@Column(name="name")
	private String tutName="some name";
	private String author;
	@Column(name="publish_date")
	@DateTimeFormat(pattern ="yyyy-MM-dd")
	private LocalDate publishDate;
	private int visits;
	private String contents;
	@ManyToOne
	@JoinColumn(name="topic_id")
	private Topic topic;
}
