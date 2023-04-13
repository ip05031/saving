package com.dev.docs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.docs.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
