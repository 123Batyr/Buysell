package ru.Meredov.buysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Meredov.buysell.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
