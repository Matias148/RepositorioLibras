package ufms.matheus.libras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ufms.matheus.libras.pojo.FileStorageProperties;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorageProperties, Integer> {

    @Query(nativeQuery = true, value = "Select * from TB_PROP where user_id = ?1 and document_type = ?2")
    FileStorageProperties checkDocumentByUserId(Integer userId, String docType);

    @Query(nativeQuery = true, value = "Select * from TB_PROP where user_id = ?1 and document_type = ?2")
    String getUploadDocumnetPath(Integer userId, String docType);
}
