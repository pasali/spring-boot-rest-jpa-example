package co.pasali.sample.repository;

import co.pasali.sample.entity.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * @author pasali
 */
public interface UserRepository extends Repository<User, Integer>,
                                        JpaSpecificationExecutor<User>,
                                        QueryByExampleExecutor<User> {

   @Query(value = "SELECT * FROM user", nativeQuery = true)
   List<User> getUsers();

}
