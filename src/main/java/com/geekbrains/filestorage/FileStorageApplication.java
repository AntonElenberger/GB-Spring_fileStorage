package com.geekbrains.filestorage;

import com.geekbrains.filestorage.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class FileStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileStorageApplication.class, args);
	}

}
