package it.academy.finaltest.service;

import it.academy.finaltest.entity.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
    void setPost();

    Long getCount();

    List<Log> getLogs();
}
