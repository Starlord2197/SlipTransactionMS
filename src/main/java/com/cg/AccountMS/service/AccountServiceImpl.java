package com.cg.AccountMS.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.AccountMS.dao.AccountRepository;
import com.cg.AccountMS.dto.AccountEntity;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	AccountRepository repository;

	@Override
	public AccountEntity getAccountByAccNo(long accNo) {
		Optional<AccountEntity> entity = repository.findById(accNo);
		return entity.get();
	}

	@Override
	public String updateAccount(long accountNo, AccountEntity account) {
		Optional<AccountEntity> entity = repository.findById(accountNo);
		
		if (!entity.isPresent()) {
			return "Account number does not exist";
		} else {
			account.setAccountNo(accountNo);
			repository.save(account);

			return "Account status updated successfully!";
		}
	}
	
	@Override
	public String addAccount(AccountEntity account) {
		repository.save(account);
		return "Account Added Successfully";
	}

	@Override
	public String deleteAccount(long accountno) {
		repository.deleteById(accountno);
		return "Account deleted successfully!";
	}
}
