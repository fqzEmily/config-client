package com.fqz.springbootdemo1.interf;

import com.fqz.springbootdemo1.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book,Integer> {
    public List<Book> findByReader(String reader);
}
