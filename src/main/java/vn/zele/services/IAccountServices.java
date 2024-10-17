package vn.zele.services;

import vn.zele.entity.Account;

public interface IAccountServices {
	public Account login(String userid, String password);
	
	public boolean isExist(String userid);
	
	public boolean signup(Account acc);
	
	public boolean update(Account acc);
	
}
