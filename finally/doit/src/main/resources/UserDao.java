
package jbr.springmvc.dao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserDao {
	void register(User user);
	  User validateUser(Login login);

}
