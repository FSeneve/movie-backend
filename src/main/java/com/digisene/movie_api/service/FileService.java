package com.digisene.movie_api.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface FileService {
    String upload(String path, MultipartFile file) throws IOException;

    InputStream getResourceFile(String path) throws FileNotFoundException;
}
