package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.User;
import ch.zli.m223.punchclock.domain.UserRole;
import ch.zli.m223.punchclock.service.EntryService;
import ch.zli.m223.punchclock.service.UserRoleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userRoles")
public class UserRoleController {

    private UserRoleService userRoleService;

    public UserRoleController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserRole> getAllEntries() {
        return userRoleService.findAll();
    }
}