package br.com.otavioluism.programing_courses.modules.courses.controllers;


import br.com.otavioluism.programing_courses.modules.courses.entity.CourseEntity;
import br.com.otavioluism.programing_courses.modules.courses.useCases.CreateCourseUseCase;
import br.com.otavioluism.programing_courses.modules.courses.useCases.ListCourseUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CourseController {

    @Autowired
    private CreateCourseUseCase createCourseUseCase;

    @Autowired
    private ListCourseUseCase listCourseUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@RequestBody CourseEntity courseEntity) {
        try {
            var responseCourseEntity = createCourseUseCase.execute(courseEntity);
            return ResponseEntity.ok().body(responseCourseEntity);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("/")
    public ResponseEntity<Object> list() {
        try {
            var responseListCourseEntity = listCourseUseCase.execute();
            return ResponseEntity.ok().body(responseListCourseEntity);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}

