package ma.chaimae.tp2app.service;

import ma.chaimae.tp2app.entities.Role;
import ma.chaimae.tp2app.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authentificate(String userName,String password);
}
