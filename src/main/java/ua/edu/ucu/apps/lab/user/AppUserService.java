package ua.edu.ucu.apps.lab.user;

import org.springframework.beans.factory.annotation.Autowired;

public class AppUserService {
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
}
