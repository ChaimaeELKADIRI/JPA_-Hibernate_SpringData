package ma.chaimae.tp2app.repository;

import ma.chaimae.tp2app.entities.Patient;
import ma.chaimae.tp2app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);
}
