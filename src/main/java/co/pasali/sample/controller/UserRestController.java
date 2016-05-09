package co.pasali.sample.controller;

import co.pasali.sample.entity.User;
import co.pasali.sample.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pasali
 */
@Controller
public class UserRestController {

   @Autowired
   UserService userService;

   @RequestMapping("/users")
   public ResponseEntity<List<User>> getAllUser() {
      return ResponseEntity.ok(userService.getUsers());
   }

   @RequestMapping("/users/{firstName}")
   public ResponseEntity<Iterable<User>> getByFirstName(@PathVariable("firstName") String firstName) {
      return ResponseEntity.ok(userService.getByFirstNameUsingQueryByExample(firstName));
   }

}
