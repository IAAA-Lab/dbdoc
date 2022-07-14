package es.unizar.iaaa.dbdoc.model;

import lombok.Data;

@Data
public class Configuration {
    private Output output;
    private Database database;
    private Schema schema;
}

