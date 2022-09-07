package com.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Tutorials;

public interface ITutorials extends JpaRepository<Tutorials, Long> {
	@Query("select t.tutName from Tutorials t where t.topic.id=:id order by t.visits desc")
	List<String> getTutorialsNameByTopic(@Param("id") long topicId);

	Optional<Tutorials> findByTutName(String tName);
}
