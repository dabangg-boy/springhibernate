package lorgat.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lorgat.model.User;

@Repository
public class UserDAO implements DAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAO.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	
	public void persist(User user) {
        sessionFactory.getCurrentSession().persist(user);
		
	}

	public User findById(int id) {
        return (User) sessionFactory.getCurrentSession().get(User.class, id);

	}

	public void update(User user) {
        sessionFactory.getCurrentSession().update(user);

		
	}

	public void delete(int id) {
        
        User u = (User) sessionFactory.getCurrentSession().load(User.class,id);

        if(null != u){
        	sessionFactory.getCurrentSession().delete(u);
		}
	
	}
	
	@SuppressWarnings("unchecked")
	public List<User> list() {
		List<User> userList = sessionFactory.getCurrentSession().createQuery("from User").list();
		for(User p : userList){
			logger.info("User List::"+p);
		}
		return userList;
	}

}
