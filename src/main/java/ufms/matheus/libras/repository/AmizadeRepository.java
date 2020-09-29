package ufms.matheus.libras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufms.matheus.libras.entity.Amizade;
import ufms.matheus.libras.entity.Verbete;

import java.util.List;

public interface AmizadeRepository extends JpaRepository<Amizade, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM TB_AMI WHERE AMI_ID LIKE :name")
    List<Amizade> consultaTest(@Param("name") Long name);//String name?
}
