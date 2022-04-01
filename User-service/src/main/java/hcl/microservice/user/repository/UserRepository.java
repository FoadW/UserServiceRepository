package hcl.microservice.user.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import hcl.microservice.user.model.UserEntity;

@Repository
public interface UserRepository extends ReactiveCrudRepository <UserEntity, Long> {

	

}
