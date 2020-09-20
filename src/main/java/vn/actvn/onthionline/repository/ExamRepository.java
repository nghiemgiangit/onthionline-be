package vn.actvn.onthionline.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.actvn.onthionline.domain.Exam;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>  {

    @Query(value = "from Exam e where e.subject like %:subject% and e.grade like %:grade% and e.isActive = true")
    Optional<List<Exam>> findAllExamActiveBySubjectAndGrade(@Param("subject") String subject, @Param("grade") String grade);

    @Query(value = "from Exam e where e.id = :id and e.isActive = true")
    Optional<Exam> findExamActiveById(@Param("id") Integer id);

    @Query(value = "from Exam e where e.id = :id")
    Optional<Exam> findById(@Param("id") Integer id);

    @Query(value = "from Exam e where (:name is null or e.name like %:name%) \n" +
            "and (:subject is null or e.subject like %:subject%) \n" +
            "and (:grade is null or e.grade like %:grade%) \n" +
            "and (:isActive is null or e.isActive = :isActive)")
    Page<Exam> findAllExam(Pageable pageable, @Param("name") String name, @Param("subject") String subject,
                           @Param("grade") String grade, @Param("isActive") Boolean isActive);
}
