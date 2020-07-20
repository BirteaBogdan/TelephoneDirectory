package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.model.Directory;

public interface DirectoryRepository extends JpaRepository<Directory, Integer>{
/*
	@Modifying
	@Query("delete from Directory where id=:id")
	public int deleteById(@Param("id")int id);
	
	@Query("select e from Directory e WHERE e.firstName=:firstName AND e.lastName=:lastName")
	public Directory getByFirstnameAndLastName(String firstName, String lastName);
	*/
}
