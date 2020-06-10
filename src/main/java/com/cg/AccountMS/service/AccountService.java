package com.cg.AccountMS.service;

import com.cg.AccountMS.dto.AccountEntity;

public interface AccountService {

	public AccountEntity getAccountByAccNo(long accountno);	
	public String updateAccount(long accountno, AccountEntity account);
	public String addAccount(AccountEntity account);
	public String deleteAccount(long accountno);

}
