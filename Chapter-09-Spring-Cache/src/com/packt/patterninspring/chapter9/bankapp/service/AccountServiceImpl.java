package com.packt.patterninspring.chapter9.bankapp.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.packt.patterninspring.chapter9.bankapp.model.Account;
import com.packt.patterninspring.chapter9.bankapp.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class AccountServiceImpl implements AccountService{

	AccountRepository accountRepository;

	@Override
	@Cacheable("accountCache")
	public Account findOne(Long id) {
		return accountRepository.findAccountById(id);
	}
	
}
