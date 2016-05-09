package co.pasali.sample.service.impl;

import co.pasali.sample.entity.User;
import co.pasali.sample.entity.specifications.UserSpecifications;
import co.pasali.sample.repository.UserRepository;
import co.pasali.sample.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
   public List<User> getByFirstNameUsingSpecifications(String firstName) {
      return userRepository.findAll(UserSpecifications.isEqualToName(firstName));
   }

   @Override
   public Iterable<User> getByFirstNameUsingQueryByExample(String firstName) {
      User user = new User();
      user.setFirstName(firstName);

      ExampleMatcher matcher = ExampleMatcher.matching()
                                             .withMatcher("firstName", ExampleMatcher.GenericPropertyMatcher::exact);
      Example<User> userExample = Example.of(user, matcher);
      return userRepository.findAll(userExample);
   }

}
