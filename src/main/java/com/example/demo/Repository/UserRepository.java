package com.example.demo.Repository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	public Optional<User> findByUsername(String username);
}
