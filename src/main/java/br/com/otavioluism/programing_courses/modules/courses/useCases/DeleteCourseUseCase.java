package br.com.otavioluism.programing_courses.modules.courses.useCases;

import br.com.otavioluism.programing_courses.modules.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class DeleteCourseUseCase {

    @Autowired
    private CourseRepository courseRepository;

    public boolean execute(UUID id) {
        var courseSelectedById = this.courseRepository.existsById(id);

        if (courseSelectedById) {
            this.courseRepository.deleteById(id);
            return true;
        }

        return false;
    }

}
