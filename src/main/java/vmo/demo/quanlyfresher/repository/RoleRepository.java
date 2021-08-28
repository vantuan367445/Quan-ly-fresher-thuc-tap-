package vmo.demo.quanlyfresher.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vmo.demo.quanlyfresher.entity.security.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}

