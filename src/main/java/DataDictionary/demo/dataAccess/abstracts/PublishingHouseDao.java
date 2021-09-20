package DataDictionary.demo.dataAccess.abstracts;

import DataDictionary.demo.entities.concretes.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingHouseDao extends JpaRepository<PublishingHouse, Integer> {
}
