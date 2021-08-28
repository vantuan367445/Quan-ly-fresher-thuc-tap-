package vmo.demo.quanlyfresher.repository;


import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.repository.CrudRepository;
import vmo.demo.quanlyfresher.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {

    @EntityGraph(value = "UserComplete", type=EntityGraphType.FETCH)
    User findByUsername(String username);

    User findByEmail(String email);

}
