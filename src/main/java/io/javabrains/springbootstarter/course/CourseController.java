package io.javabrains.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

  @Autowired private CourseService courseService;

  @RequestMapping("/topics/{id}/courses")
  public List<Course> getAllCourses() {
    return courseService.getAllCourses();
  }

  @RequestMapping("/topics/{id}/courses/{id}")
  public Optional<Course> getCourse(@PathVariable("id") String id) {
    return courseService.getCourse(id);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/topics/{id}/courses")
  public void addCourse(@RequestBody Course course) {
    courseService.addCourse(course);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}/courses/{id}")
  public void updateCourse(@PathVariable("id") String id, @RequestBody Course course) {
    courseService.updateCourse(id, course);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}/courses/{id}")
  public void deleteCourse(@PathVariable String id) {
    courseService.deleteCourse(id);
  }
}
