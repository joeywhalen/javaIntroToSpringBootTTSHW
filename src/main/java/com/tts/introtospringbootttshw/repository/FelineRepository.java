package com.tts.introtospringbootttshw.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.introtospringbootttshw.model.Feline;

public interface FelineRepository extends CrudRepository<Feline, Long> {
	
  List<Feline> findByCatName(String catName);
}
