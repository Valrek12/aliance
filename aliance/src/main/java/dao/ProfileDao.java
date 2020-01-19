package dao;

import org.springframework.context.annotation.Profile;
import java.util.Optional;

public interface ProfileDao {

    Optional<Users> getProfileById(int id);
}
