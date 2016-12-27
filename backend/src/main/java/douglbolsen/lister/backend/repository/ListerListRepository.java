package douglbolsen.lister.backend.repository;

import douglbolsen.lister.backend.domain.ListerList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListerListRepository extends CrudRepository<ListerList, String> {
}
