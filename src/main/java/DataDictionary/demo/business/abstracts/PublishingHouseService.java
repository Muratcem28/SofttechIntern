package DataDictionary.demo.business.abstracts;

import DataDictionary.demo.entities.concretes.PublishingHouse;

import java.util.List;

public interface PublishingHouseService {
    List<PublishingHouse> getAll();

    void add(PublishingHouse publishingHouse);
    void update(PublishingHouse publishingHouse);
    void delete(int id );
    PublishingHouse getById(int publishingHouseId);



}
