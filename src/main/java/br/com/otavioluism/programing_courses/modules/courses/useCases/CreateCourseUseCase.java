package br.com.otavioluism.programing_courses.modules.courses.useCases;

import br.com.otavioluism.programing_courses.modules.courses.entity.CourseEntity;
import br.com.otavioluism.programing_courses.modules.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseUseCase {

    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity execute(CourseEntity courseEntity) {
        return this.courseRepository.save(courseEntity);
    }
}
