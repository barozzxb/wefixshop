package vn.zele.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import vn.zele.configs.DBConnection;
import vn.zele.configs.JPAConfig;
import vn.zele.dao.IAccountDAO;
import vn.zele.entity.Account;

public class AccountDAOImpl extends DBConnection implements IAccountDAO{

	@Override
	public List<Account> selectAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		TypedQuery<Account> accs = enma.createNamedQuery("Account.findAll", Account.class);
		return accs.getResultList();
	}

	@Override
	public Account findByUserId(String userid) {
		EntityManager enma = JPAConfig.getEntityManager();
		Account acc = enma.find(Account.class, userid);
		return acc;
	}

	@Override
	public boolean insert(Account acc) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.persist(acc); //insert
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}

	@Override
	public boolean update(Account acc) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			enma.merge(acc); //insert
			trans.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
	}


	
//	Connection conn = null;
//	PreparedStatement ps = null;
//	ResultSet rs = null;
//	
//	@Override
//	public List<AccountModel> selectAll() {
//		String sql = "select * from account";
//		
//		List<AccountModel> users = null;
//		try {
//			conn = DBConnection.getDatabaseConnection();
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//			
//			while (rs.next()) {
//				users.add(new AccountModel(rs.getString("userid"),
//											rs.getString("password"),
//											rs.getString("name"),
//											rs.getDate("dob"),
//											rs.getString("gender"),
//											rs.getString("email"),
//											rs.getString("phonenum"),
//											rs.getString("address"),
//											rs.getBoolean("isDeactivated"),
//											rs.getInt("roleid")
//											));
//			}
//			return users;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public AccountModel findByUsername(String userid) {
//		String sql = "select * from account where userid=?";
//		
//		AccountModel user = null;
//		try {
//			conn = DBConnection.getDatabaseConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, userid);
//			rs = ps.executeQuery();
//			
//			while (rs.next()) {
//				user.setUserid(rs.getString("userid"));
//				user.setPassword(rs.getString("password"));
//				user.setRole(rs.getInt("role"));
//				user.setName(rs.getString("name"));
//				user.setDob(rs.getDate("dob"));
//				user.setGender(rs.getString("gender"));
//				user.setEmail(rs.getString("email"));
//				user.setPhonenum(rs.getString("phonenum"));
//				user.setAddress(rs.getString("address"));
//				user.setImage(rs.getString("image"));
//			}
//			return user;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public boolean insert(String userid, String password, String email, String phonenum) {
//		String sql = "insert into account(userid, password, email, phonenum, isDeactivated) values (?,?,?,?,?)";
//		try {
//			conn = super.getDatabaseConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, userid);
//			ps.setString(2, password);
//			ps.setString(3, email);
//			ps.setString(4, phonenum);
//			ps.setBoolean(5, false);
//			ps.executeUpdate();
//			return true;
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	@Override
//	public boolean update(AccountModel user) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean login(String userid, String password) {
//		return true;
//	}
	
	
}
