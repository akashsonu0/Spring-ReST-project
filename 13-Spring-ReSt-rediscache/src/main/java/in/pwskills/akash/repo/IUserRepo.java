package in.pwskills.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.akash.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {

}
