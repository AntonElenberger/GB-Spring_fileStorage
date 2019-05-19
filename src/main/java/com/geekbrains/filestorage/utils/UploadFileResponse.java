package com.geekbrains.filestorage.utils;

import lombok.Data;

@Data
public class UploadFileResponse {
    private String fileName;
    private String fileDownloadUir;
    private String fileType;
    private long fileSize;

    public UploadFileResponse(String fileName, String fileDownloadUir, String fileType, long fileSize) {
        this.fileName = fileName;
        this.fileDownloadUir = fileDownloadUir;
        this.fileType = fileType;
        this.fileSize = fileSize;
    }
}
