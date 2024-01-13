package com.project.server_shmatkov;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "storage")
public class Storage {

    @Id
    @Column(name = "user_id")
    Long id;
    @Column(name = "file_name")
    String fileName;

    @Column(name = "file_path")
    String filePath;
}
