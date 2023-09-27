package org.rtk.domain;

import java.nio.file.Path;

public class Mem {
    private Path path;
    private String filename;
    private String extension;
    private String memText;

    public Mem() {
    }

    public Mem(Path path, String filename, String extension, String memText) {
        this.path = path;
        this.filename = filename;
        this.extension = extension;
        this.memText = memText;

    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMemText() {
        return memText;
    }


    public void setMemText(String memText) {
        this.memText = memText;
    }
}
