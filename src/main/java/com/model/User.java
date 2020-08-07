package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**Project: springUserApi
 * File: User.java
 * @author jaime
 * Em 06-08-2020 **/

@Document
public class User {
	
	@Id
	private String id;
	private String nome;
	private String email;
	private String password;
	private String phone;
	/*
	 * Construct
	 */
	public User() {}
	/*
	 * Construct
	 */
	public User(String id, String nome, String email, String password, String phone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	/* Getter */
	public String getId() {
		return id;
	}
	/* Setter */
	public void setId(String id) {
		this.id = id;
	}
	/* Getter */
	public String getNome() {
		return nome;
	}
	/* Setter */
	public void setNome(String nome) {
		this.nome = nome;
	}/* Getter */
	public String getEmail() {
		return email;
	}
	/* Setter */
	public void setEmail(String email) {
		this.email = email;
	}
	/* Getter */
	public String getPassword() {
		return password;
	}
	/* Setter */
	public void setPassword(String password) {
		this.password = password;
	}
	/* Getter */
	public String getPhone() {
		return phone;
	}
	/* Setter */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
