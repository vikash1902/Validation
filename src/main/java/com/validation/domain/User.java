package com.validation.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "userDetails")
@Data
@AllArgsConstructor
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "userid")
	private int userId;

	@Pattern(regexp="^[0-9]",message="number")
	@Size(max = 50, message = "size must be less then 50")
	@NotBlank(message = "email not be null")
	@Column(name = "email")
	private String email;

	@Size(max = 50, message = "size must be less then 50")
	@NotBlank(message = "address not be null")
	@Column(name = "address")
	private String address;
}
