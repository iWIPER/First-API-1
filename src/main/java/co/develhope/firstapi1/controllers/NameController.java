package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getName(){
        return "Wilk Pereira";
    }
    @PostMapping("/{name}")
    public StringBuilder setReverseName(@PathVariable String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return stringBuilder.reverse();

    }
}
