package com.tac.ss18b3.dao;


import com.tac.ss18b3.model.Account;

import java.util.List;

public interface IAccountDao
{
	// 1. lấy về list để hiển thị
	List<Account> findAll();
	
	// 2. Tìm kiếm theo id để update lấy ra đối tượng thông qua id
	Account findById(Long id);
	
	// 3. thêm mới hoặc update
	void save(Account account);
	
	// 4. Xóa
	void deleteById(Long id);
}
