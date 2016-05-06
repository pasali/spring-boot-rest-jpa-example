package co.pasali.sample;

import co.pasali.sample.entity.User;
import org.springframework.data.jpa.domain.Specification;

/**
 * @author pasali
 */
public class UserSpecifications {

   public static Specification<User> isEqualToName(final User user) {
      return (root, query, builder) -> {
         query.orderBy(builder.desc(root.get("userId")));
         return builder.equal(root.<User> get("firstName"), user.getEmail());
      };
   }

}
