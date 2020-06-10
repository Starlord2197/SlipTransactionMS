package com.cg.AccountMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.AccountMS.dto.AccountEntity;
import com.cg.AccountMS.service.AccountService;

@RestController
@CrossOrigin
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	AccountService service;

	// http://localhost:9090/accounts/accountByAccNo/123412341234

	@RequestMapping(value = "/accountno/{accno}", headers = "Accept=application/json", method = RequestMethod.GET)
	public ResponseEntity<AccountEntity> getUserByAccNo(@PathVariable("accno") long accNo) {
		AccountEntity account = service.getAccountByAccNo(accNo);
		return ResponseEntity.ok(account);
	}

	// http://localhost:9090/accounts/addaccount/
	@RequestMapping(value = "/addaccount/", consumes = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addMovie(@RequestBody AccountEntity account) {
		return ResponseEntity.ok(service.addAccount(account));

	}

	//http://localhost:9090/accounts/accByAccNo/123412341234/open
	@RequestMapping(value ="/updateaccount/{accountno}/",
			headers="Accept=application/json",	method = RequestMethod.PUT,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateStatusByAccNo(@PathVariable("accountno") long accountno,
			@RequestBody AccountEntity account) {
		return ResponseEntity.ok(service.updateAccount(accountno, account));

	}
	// http://localhost:9090/accounts/deleteaccount/123412341234/
	@RequestMapping(value = "/deleteaccount/{accountno}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteAccount(@PathVariable("accountno") long accountno) {
		return ResponseEntity.ok(service.deleteAccount(accountno));

	}

}
