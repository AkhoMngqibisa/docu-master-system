package com.akhona.documaster.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.Objects;

@Component
public class FileStorageUtil {
    private final Path root = Paths.get("uploads");

    private String save(MultipartFile file) throws IOException {
        if (!Files.exists(root))
            Files.createDirectories(root);

        Path path = root.resolve(Objects.requireNonNull(file.getOriginalFilename()));
        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        return path.toString();
    }
}
