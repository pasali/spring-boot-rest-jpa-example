package co.pasali.sample.service.impl;

import co.pasali.sample.UserSpecs;
import co.pasali.sample.entity.User;
import co.pasali.sample.repository.UserRepository;
import co.pasali.sample.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pasali
 */
@Service
public class UserServiceImpl implements UserService {

   @Autowired
   UserRepository userRepository;

   @Override
   public List<User> getUsers() {
      return userRepository.getUsers();
   }

   @Override
   public List<User> getByFirstName(String firstName) {
      User user = new User();
      user.setEmail(firstName);
      return userRepository.findAll(UserSpecs.isEqualToName(user));
   }

}
