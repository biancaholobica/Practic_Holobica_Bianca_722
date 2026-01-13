package org.example.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public abstract class AbstractRepository<T> {
    protected List<T> data = new ArrayList<>();

    public void loadFromJson(String path, Class<T[]> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        T[] array = mapper.readValue(new File(path), clazz);
        data = new ArrayList<>(Arrays.asList(array));
    }

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }

    public void delete(Object id) {

    }
}