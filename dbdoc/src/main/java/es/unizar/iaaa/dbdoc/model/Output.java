package es.unizar.iaaa.dbdoc.model;

import lombok.Data;

import java.util.List;

@Data
public class Output {
    private String folder;
    private String language;
    private String title;
    private List<String> includePre;
    private List<String> includePost;
    private List<String> copyFiles;
}
