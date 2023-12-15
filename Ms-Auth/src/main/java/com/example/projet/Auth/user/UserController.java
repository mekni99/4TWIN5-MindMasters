package com.example.projet.Auth.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sampson Alfred
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

     @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PatchMapping("/updateUserData/{userId}")
    public void patchUpdateUser(@PathVariable Long userId, @RequestBody User updatedUser) {
        userService.patchUpdateUser(userId, updatedUser);
    }

    @PatchMapping("/users/role/{userId}")
    public void patchUpdateUserRole(@PathVariable Long userId, @RequestBody String newRole) {
        userService.patchUpdateUserRole(userId, newRole);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable Long userId) {
        try {
            userService.deleteUser(userId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            // Handle exceptions and return an appropriate response
            return ResponseEntity.status(500).body("Error deleting user. Please try again.");
        }
    }
}
