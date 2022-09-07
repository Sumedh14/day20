package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class User extends BaseEntity {
private String name;
private String email;
private String password;
@Column(name = "reg_amt")
private double regAmount;
@Column(name="reg_date")
private LocalDate regDate;
@Enumerated(EnumType.STRING)
private Role role;
}
