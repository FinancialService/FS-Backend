/**
 * 
 */
/**
 * @author Raju
 *
 */
package com.financialservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class Hello {

	@RequestMapping(method = RequestMethod.GET)
	public List getShops() {
		return null;
	}
}