package vn.zele.services.impl;

import vn.zele.dao.IAccountDAO;
import vn.zele.dao.impl.AccountDAOImpl;
import vn.zele.entity.Account;
import vn.zele.models.AccountModel;
import vn.zele.services.IAccountServices;

public class AccountServicesImpl implements IAccountServices{

	IAccountDAO accDAO = new AccountDAOImpl();
	@Override
	public Account login(String userid, String password) {
		Account acc = accDAO.findByUserId(userid);
		
		if (acc != null)
			if (password.equals(acc.getPassword()))
				return acc;
		return null;
	}
	
	@Override
	public boolean isExist(String userid) {
		Account acc = accDAO.findByUserId(userid);
		if (acc != null)
			return true;
		else
			return false;
	}

	@Override
	public boolean signup(Account acc) {
		return accDAO.insert(acc);
	}

	@Override
	public boolean update(Account acc) {
		return accDAO.update(acc);
	}

}
