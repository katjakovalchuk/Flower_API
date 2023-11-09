package ua.edu.ucu.apps.lab.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findUserByEmail(String email);
}
