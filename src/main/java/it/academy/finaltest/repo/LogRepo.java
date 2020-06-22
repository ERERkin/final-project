package it.academy.finaltest.repo;

import it.academy.finaltest.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepo extends JpaRepository<Log, Long> {
    @Query("select count(l) from Log l")
    Long countLog();
}
