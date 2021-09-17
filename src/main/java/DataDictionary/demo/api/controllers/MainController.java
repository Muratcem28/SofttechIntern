package DataDictionary.demo.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping

public class MainController {
    @GetMapping
    public boolean isLive(){
        return true;
    }
}