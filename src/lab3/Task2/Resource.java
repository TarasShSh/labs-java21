package lab3.Task2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Objects;

public class Resource implements Closeable {
    private String filename;

    public Resource(final String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(final String filename) {
        this.filename = filename;
    }

    @Override
    public void close(){
        System.out.println("Resource is closed.");
    }

    public void read() throws IOException{
        throw new IOException();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Resource resource = (Resource) o;
        return Objects.equals(filename, resource.filename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename);
    }

    @Override
    public String toString() {
        return "filename: " + filename;
    }
}