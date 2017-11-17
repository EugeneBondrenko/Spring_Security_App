package springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import springsecurity.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
