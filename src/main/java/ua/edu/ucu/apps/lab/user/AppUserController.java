package ua.edu.ucu.apps.lab.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RequestMapping("/api/users/")
public class AppUserController {
    private final AppUserService userService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.userService = userService;
    }

}
