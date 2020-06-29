package it.academy.finaltest.service;

import it.academy.finaltest.entity.Log;
import it.academy.finaltest.repo.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class LogServiceImpl implements LogService{
    @Autowired
    LogRepo logRepo;

    @Override
    public void setPost() {
        Log log = Log.builder()
                .timestamp(new Timestamp(System.currentTimeMillis()))
                .build();
        logRepo.save(log);
    }

    @Override
    public Long getCount() {
        return logRepo.count();
    }

    @Override
    public List<Log> getLogs() {
        return logRepo.findAll();
    }
}
