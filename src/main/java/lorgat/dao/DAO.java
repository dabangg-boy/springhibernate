package lorgat.dao;

import java.util.List;

import lorgat.model.User;

public interface DAO {

	void persist(User user);
			  
	User findById(int id);
			  
	void update(User user);
			  
	void delete(int id);
	
	List<User> list();
			  
}
