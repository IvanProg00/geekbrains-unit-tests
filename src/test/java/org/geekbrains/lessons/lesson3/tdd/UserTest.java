package org.geekbrains.lessons.lesson3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    UserRepository userRepository;
    User user;

    @BeforeEach
    void setup() {
        user = new User("user", "pass123");
        userRepository = new UserRepository();
    }

    @Test
    void loginPasses() {
        assertTrue(user.login("user", "pass123"));
        assertTrue(user.isAuthenticate);
    }

    @ParameterizedTest
    @CsvSource({
            "root, 1234",
            "root, pass123",
            "user, pass124",
    })
    void loginFails(String name, String password) {
        assertFalse(user.login(name, password));
        assertFalse(user.isAuthenticate);
    }

    @Test
    void userRepositoryFindByNamePasses() {
        user.login(user.name, user.password);
        userRepository.addUser(user);
        assertTrue(userRepository.findByName("user"));
    }

    @Test
    void userRepositoryFindByNameFails() {
        User newUser = new User("user1", "1234");
        userRepository.addUser(newUser);
        assertFalse(userRepository.findByName("undefined"));
    }

    @Test
    void userRepositoryAddUserPasses() {
        User newUser = new User("user1", "1234");
        newUser.login("user1", "1234");
        userRepository.addUser(newUser);
        assertTrue(userRepository.findByName("user1"));
    }

    @Test
    void userRepositoryAddUserFails() {
        User newUser = new User("user1", "1234");
        userRepository.addUser(newUser);
        assertFalse(userRepository.findByName("user1"));
    }
}