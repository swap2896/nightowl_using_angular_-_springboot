package com.example.nightowl.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Books,String> {

    @Query(value = "select * from books order by rating desc limit 10",nativeQuery = true)
    public List<Books> rating();

    @Query(value= "select rating,count(*) from books group by rating order by rating desc",nativeQuery = true)
    public Collection<List> groupbyrating();

    @Query(value="select type,count(*) from books group by type",nativeQuery = true)
    public Collection<List> groupbytype();
}
