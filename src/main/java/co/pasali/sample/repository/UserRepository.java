package co.pasali.sample.repository;

import co.pasali.sample.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * @author pasali
 */
public interface UserRepository extends Repository<User, Integer> {

   @Query(value = "SELECT * FROM user", nativeQuery = true)
   List<User> getUsers();

}
