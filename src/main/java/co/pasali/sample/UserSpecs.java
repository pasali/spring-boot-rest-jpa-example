package co.pasali.sample;

import co.pasali.sample.entity.User;
import org.springframework.data.jpa.domain.Specification;

/**
 * @author pasali
 */
public class UserSpecs {

   public static Specification<User> isEqualToName(final User user) {
      return (root, query, builder) -> builder.equal(root.<User> get("firstName"), user.getEmail());
   }
}
