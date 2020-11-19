package ufms.matheus.libras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ufms.matheus.libras.entity.Verbete;

import java.util.List;

@Repository
public interface VerbeteRepository extends JpaRepository<Verbete, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM TB_VER WHERE VER_TITULO LIKE :name")
    List<Verbete> consultaTest(@Param("name") String name);
}
