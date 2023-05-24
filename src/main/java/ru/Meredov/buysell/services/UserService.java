package ru.Meredov.buysell.services;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.Meredov.buysell.models.Role;
import ru.Meredov.buysell.models.User;
import ru.Meredov.buysell.repositories.UserRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean createUser (User user){
        String email = user.getEmail();
        if (userRepository.findByEmail(email) != null) return false;
        user.setActive(true);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.getRoles().add(Role.ROLE_User);
        log.info("Saving new User with email: {}", email);
        userRepository.save(user);
        return true;
    }
}
