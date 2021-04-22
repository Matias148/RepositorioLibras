package ufms.matheus.libras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ufms.matheus.libras.pojo.FileStorageProperties;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorageProperties, Integer> {

    @Query(nativeQuery = true, value = "Select * from TB_PROP where user_id like userId and document_type like docType")
    FileStorageProperties checkDocumentByUserId(Integer userId, String docType);

    @Query(nativeQuery = true, value = "Select * from TB_PROP where user_id like userId and document_type like docType")
    String getUploadDocumnetPath(Integer userId, String docType);
}
