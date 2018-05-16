import homework.db.DBHelper;
import homework.models.Folder;

import java.util.List;

public class Runner {

    models.File file;
    Folder folder;


    public static void main(String[] args) {

        Folder folder1 = new Folder("testFolder");
        models.File file1 = new models.File("testFile", ".pdf", 120, folder1);
        DBHelper.save(file1);
        DBHelper.save(folder1);
        List<models.File> files = DBHelper.getAll(models.File, file1);
        List<Folder> folders = DBHelper.getAll(Folder, folder1);
        folder1.setTitle("testTile2");
        file1.setName("testFolder2");
        DBHelper.save(folder1);
        DBHelper.save(file1);

        Folder foundFolder = DBHelper.find(Folder.class, folder1.getId() );
        File foundFile = DBHelper.find(models.File.class, file1.getId());








    }
}
