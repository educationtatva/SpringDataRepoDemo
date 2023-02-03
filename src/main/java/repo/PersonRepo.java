package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.model.Person;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepo extends JpaRepository<Person, Integer>{

}
