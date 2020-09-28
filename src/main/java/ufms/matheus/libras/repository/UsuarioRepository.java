package ufms.matheus.libras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ufms.matheus.libras.entity.Usuario;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //@Query("SELECT c FROM Usuario c where c.name= :name")
    @Query(nativeQuery = true, value = "SELECT * FROM TB_USUARIO WHERE USU_NAME LIKE :name")
    List<Usuario> consultaTest(@Param("name") String name);


}
