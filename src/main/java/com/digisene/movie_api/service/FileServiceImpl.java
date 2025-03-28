package com.digisene.movie_api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public String upload(String path, MultipartFile file) throws IOException {
        return "";
    }

    @Override
    public InputStream getResourceFile(String path) throws FileNotFoundException {
        return null;
    }
}
