package it.academy.finaltest.controller;

import it.academy.finaltest.entity.Log;
import it.academy.finaltest.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
public class LogController {
    @Autowired
    LogService logService;

    @PostMapping("/counter")
    String setLog(){
        logService.setPost();
        return "Success";
    }


//    @PostMapping("/counter")
//    String setLog(@RequestBody Object o){
//        logService.setPost();
//        return "Success";
//    }

    @GetMapping("/counter")
    Long getCount(){
        return logService.getCount();
    }

    @GetMapping("/report")
    List<Log> getAll(){
        return logService.getLogs();
    }
}
