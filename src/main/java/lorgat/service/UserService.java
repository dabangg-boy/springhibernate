package lorgat.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lorgat.dao.UserDAO;
import lorgat.model.User;

@Service
public class UserService implements Services {
	
	@Autowired
	private UserDAO userdao;

    @Transactional
	public void persist(User user) {
        userdao.persist(user);
	}

    @Transactional
	public User findById(int id) {
        return userdao.findById(id);
	}

    @Transactional
	public void update(User user) {
        userdao.update(user);
	}

    @Transactional
	public void delete(int id) {
        userdao.delete(id);
	}

    @Transactional
	public List<User> list() {
		return userdao.list();
	}
	
}
