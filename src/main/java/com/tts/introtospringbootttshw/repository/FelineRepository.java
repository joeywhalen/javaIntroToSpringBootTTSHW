package com.tts.introtospringbootttshw.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.introtospringbootttshw.model.Feline;

@Repository
public interface FelineRepository extends CrudRepository<Feline, Long> {
	List<Feline> findByCatName(String catName);
}
