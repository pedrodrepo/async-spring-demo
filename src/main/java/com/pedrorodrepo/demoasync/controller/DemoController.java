package com.pedrorodrepo.demoasync.controller;

import com.pedrorodrepo.demoasync.model.UserModel;
import com.pedrorodrepo.demoasync.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;

	/**
	 * Method responsible for save {@link UserModel} on database
	 *
	 * @param usermodel {@link UserModel}
	 */
	@PostMapping
	public void createUser(@RequestBody UserModel usermodel) {
		// save user
		demoService.saveUser(usermodel);
	}
}
