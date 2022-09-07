package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="topics")
@Getter
@Setter
@ToString
public class Topic extends BaseEntity{
@Column(name="name")
private String topicName;
}
