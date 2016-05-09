package co.pasali.sample.service;

import co.pasali.sample.entity.User;
import java.util.List;

/**
 * @author pasali
 */
public interface UserService {

   List<User> getUsers();

   List<User> getByFirstNameUsingSpecifications(String firstName);

   Iterable<User> getByFirstNameUsingQueryByExample(String firstName);

}
