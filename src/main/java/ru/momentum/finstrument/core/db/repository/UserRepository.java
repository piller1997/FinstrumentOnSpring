package ru.momentum.finstrument.core.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.momentum.finstrument.core.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByActivationCode(String code);

    User findByEmail(String email);
}
