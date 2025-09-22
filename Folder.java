import java.util.ArrayList;

public class Folder {
    public double size = 0d;
    public String name;
    public ArrayList<Folder> folderList = new ArrayList<>();
    public ArrayList<File> fileList = new ArrayList<>();
    
    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        fileList.add(file);
        this.size += file.size;
    }

    public void addFolder(Folder folder) {
        folderList.add(folder);
        this.size += folder.size;
    }

    public void removeFile(File file) {
        fileList.remove(file);
        this.size -= file.size;
    }

    public void removeFolder(Folder folder) {
        folderList.remove(folder);
        this.size -= folder.size;
    }

}