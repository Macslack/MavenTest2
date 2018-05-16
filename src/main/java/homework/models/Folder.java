package homework.models;

import models.File;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class Folder {

    private String title;
    private Set<File> files;
    private int id;

    public Folder(String title) {
        this.title = title;
        this.files = files;
    }

    public Folder(){

    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "files")
    public Set<File> getFiles() {
        return files;
    }


    public void setFiles(Set<File> files) {
        this.files = files;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }


    @OneToMany(mappedBy = "folder", fetch = FetchType.LAZY)
    public void setId(int id) {
        this.id = id;
    }
}
