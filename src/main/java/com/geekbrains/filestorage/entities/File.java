package com.geekbrains.filestorage.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "stored_files")
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "path")
    private String path;
}
