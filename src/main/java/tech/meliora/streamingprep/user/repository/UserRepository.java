package tech.meliora.streamingprep.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.meliora.streamingprep.user.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
