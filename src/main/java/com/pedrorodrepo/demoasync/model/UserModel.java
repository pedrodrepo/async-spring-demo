package com.pedrorodrepo.demoasync.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserModel {

	/**
	 * Id's name to user on database
	 */
	private Long id;

	/**
	 * User's name
	 */
	private String name;

	/**
	 * Email's name
	 */
	private String email;

}
