package com.fors.simplemovieapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.fors.simplemovieapi.model.Person;

@Mapper
public interface PersonMapper {
	
	@Select("SELECT * FROM person")
	List<Person> findAll();
	
	@Insert("INSERT into person(name) VALUES(#{name})")
	void add(Person person);
	
	@Delete("DELETE FROM person WHERE id=#{personId}")
	void delete(int personId);

}
