package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class ReadTextFile {
    private Path filePath;

    public ReadTextFile(Path filePath) throws FileNotFoundException {
        if (Files.notExists(filePath)) throw new FileNotFoundException();
        this.filePath = filePath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) throws FileNotFoundException {
        if (Files.notExists(filePath)) throw new FileNotFoundException();
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ReadTextFile that = (ReadTextFile) o;
        return Objects.equals(filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(filePath);
    }

    public void run() {
        try {
            System.out.println(Files.readAllLines(filePath));
        } catch (IOException e) {
            System.out.println("Error de E/S");
        }
    }

}
