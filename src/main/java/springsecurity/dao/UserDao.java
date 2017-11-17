package springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
