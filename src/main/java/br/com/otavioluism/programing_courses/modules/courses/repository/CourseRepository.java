package br.com.otavioluism.programing_courses.modules.courses.repository;

import br.com.otavioluism.programing_courses.modules.courses.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseEntity, UUID> {
}
