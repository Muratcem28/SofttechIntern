package DataDictionary.demo.business.concretes;

import DataDictionary.demo.business.abstracts.PublishingHouseService;
import DataDictionary.demo.dataAccess.abstracts.PublishingHouseDao;
import DataDictionary.demo.entities.concretes.Author;
import DataDictionary.demo.entities.concretes.PublishingHouse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingHouseManager implements PublishingHouseService {

    private final PublishingHouseDao publishingHouseDao;

    public PublishingHouseManager(PublishingHouseDao publishingHouseDao){
        this.publishingHouseDao = publishingHouseDao;
    }

    @Override
    public List<PublishingHouse> getAll() {
        return this.publishingHouseDao.findAll();
    }

    @Override
    public void add(PublishingHouse publishingHouse) {
        this.publishingHouseDao.save(publishingHouse);
    }

    @Override
    public void update(PublishingHouse publishingHouse) {
        this.publishingHouseDao.save(publishingHouse);
    }

    @Override
    public void delete(int id) {
        PublishingHouse publishingHouse = new PublishingHouse();
        publishingHouse.setId(id);
        this.publishingHouseDao.delete(publishingHouse);

    }

    @Override
    public PublishingHouse getById(int publishingHouseId) {
        return this.publishingHouseDao.getById(publishingHouseId);
    }

}
