package br.com.otavioluism.programing_courses.modules.courses.useCases;

import br.com.otavioluism.programing_courses.modules.courses.entity.CourseEntity;
import br.com.otavioluism.programing_courses.modules.courses.exceptions.CourseNotFoundException;
import br.com.otavioluism.programing_courses.modules.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UpdateActivityCourseUseCase {

    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity execute(UUID id) throws CourseNotFoundException {
        CourseEntity courseSelectedById = this.courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found!"));

        courseSelectedById.setActive(!courseSelectedById.isActive());

        this.courseRepository.save(courseSelectedById);

        return courseSelectedById;
    }

}
