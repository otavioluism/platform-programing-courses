package br.com.otavioluism.programing_courses.modules.courses.useCases;

import br.com.otavioluism.programing_courses.modules.courses.entity.CourseEntity;
import br.com.otavioluism.programing_courses.modules.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListCourseUseCase {

    @Autowired
    private CourseRepository courseRepository;

    public List<CourseEntity> execute() {
        // Ordenando por nome (ordem crescente)
        Sort sort = Sort.by(Sort.Order.asc("name"));
        return this.courseRepository.findAll(sort);
    }

}
