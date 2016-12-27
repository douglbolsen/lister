package douglbolsen.lister.backend.repository;

import douglbolsen.lister.backend.domain.ListItemCategory;
import douglbolsen.lister.backend.domain.ListerList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListItemCategoryRepository extends CrudRepository<ListItemCategory, String> {
}
