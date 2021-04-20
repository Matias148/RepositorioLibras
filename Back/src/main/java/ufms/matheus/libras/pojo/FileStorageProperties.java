package ufms.matheus.libras.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "TB_PROP")
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "document_id")
    private Integer documentId;

    @Column(name = "user_id")
    private Integer UserId;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "document_format")
    private String documentFormat;

    @Column(name = "upload_dir")
    private String uploadDir;
}