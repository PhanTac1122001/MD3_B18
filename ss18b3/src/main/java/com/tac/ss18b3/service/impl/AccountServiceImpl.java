package com.tac.ss18b3.service.impl;

import com.tac.ss18b3.dao.IAccountDao;
import com.tac.ss18b3.model.Account;
import com.tac.ss18b3.service.IAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService
{
	private final IAccountDao accountDao;
	
	@Override
	public List<Account> findAll()
	{
		return accountDao.findAll();
	}
	
	@Override
	public Account findById(Long id)
	{
		return null;
	}
	
	@Override
	public void save(Account account)
	{
		accountDao.save(account);
	}
	
	@Override
	public void deleteById(Long id)
	{
		accountDao.deleteById(id);
	}
}
