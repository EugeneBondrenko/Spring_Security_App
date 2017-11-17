package springsecurity.service;

import springsecurity.model.User;

/**
 *
 * @author Eugene Bondarenko
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
