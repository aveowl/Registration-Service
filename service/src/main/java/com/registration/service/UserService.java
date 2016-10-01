package com.registration.service;

import com.registration.model.User;
import com.registration.service.impl.UserServiceImpl;

import java.util.Optional;

/**
 * <p>
 *     The UserService interface defines all public business behaviours
 *     for operations with {@link User} entities.
 * </p>
 * <p>
 *     This interface should be injected into MailService clients, not the
 *     {@link UserServiceImpl} class.
 * </p>
 */
public interface UserService {

    /**
     * Persists a User entity in the database.
     * @param user a User object to be persisted.
     */
    void create(User user);

    /**
     * Searches for user with given email.
     * @param email email to find user.
     * @return {@link User} object with given email or <code>Optional.empty()</code>
     * if no {@link User} is associated with given email.
     */
     Optional<User> findByEmail(String email);

    /**
     * Updates a User entity in the database.
     * @param user a User object to be updated.
     */
    void update(User user);

    /**
     * Confirms user registration.
     * @param email email of user to confirm.
     */
    void confirm(String email);
}
