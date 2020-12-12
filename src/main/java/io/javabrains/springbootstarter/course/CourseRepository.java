package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {
  Optional<Course> findById(String id);

  void deleteById(String id);
}
