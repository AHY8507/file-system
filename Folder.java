import java.util.ArrayList;

public class Folder {
    public double size = 0d;
    public String name;
    public ArrayList<Folder> folderList = new ArrayList<>();
    public ArrayList<File> fileList = new ArrayList<>();
    public Folder parentFolder;

    public Folder(String name) {
        this.name = name;
    }

    private void sizeUpdate() {
        this.size = 0;
        for (File file : fileList) {
            this.size += file.size;
        }
        for (Folder folder : folderList) {
            this.size += folder.size;
        }
        if (parentFolder != null) {
            parentFolder.sizeUpdate();
        }
    }

    public void addFile(File file) {
        file.parentFolder = this;
        fileList.add(file);
        sizeUpdate();
    }

    public void addFolder(Folder folder) {
        folder.parentFolder = this;
        folderList.add(folder);
        sizeUpdate();
    }

    public void removeFile(File file) {
        fileList.removeIf(f -> f.name.equals(file.name));
        sizeUpdate();
    }

    public void removeFolder(Folder folder) {
        folderList.removeIf(f -> f.name.equals(folder.name));
        sizeUpdate();
    }

}