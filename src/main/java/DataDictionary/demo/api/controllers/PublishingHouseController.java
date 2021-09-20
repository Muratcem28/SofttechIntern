package DataDictionary.demo.api.controllers;

import DataDictionary.demo.business.abstracts.AuthorService;
import DataDictionary.demo.business.abstracts.PublishingHouseService;
import DataDictionary.demo.entities.concretes.Author;
import DataDictionary.demo.entities.concretes.PublishingHouse;
import DataDictionary.demo.entities.dtos.PublishingHouseSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PublishingHouse/")
public class PublishingHouseController {

    private final PublishingHouseService publishingHouseService;
    private final AuthorService authorService;



    @Autowired
    public PublishingHouseController(PublishingHouseService publishingHouseService, AuthorService authorService) {
        this.publishingHouseService = publishingHouseService;
        this.authorService = authorService;
    }

    @GetMapping("/getAll")
    public List<PublishingHouse> getAll() {
        return this.publishingHouseService.getAll();
    }


    @PostMapping("save")
    public void save(PublishingHouseSaveDto publishingHouseSaveDto) {
        PublishingHouse publishingHouse = new PublishingHouse();
        Author authors = this.authorService.getById(publishingHouseSaveDto.getAuthorId());
        publishingHouse.setName(publishingHouseSaveDto.getName());


        publishingHouse.setAuthors((List<Author>) authors);
        publishingHouse.setAddress(publishingHouseSaveDto.getAddress());
        publishingHouse.setMail(publishingHouseSaveDto.getMail());
        this.publishingHouseService.add(publishingHouse);
    }


    @PutMapping("/update/")
    public void update(PublishingHouse publishingHouse){
        this.publishingHouseService.update(publishingHouse);
    }

    @DeleteMapping("/delete/")
    public void delete(int id){
        this.publishingHouseService.delete(id);
    }

}