public class File {
    public double size;
    public String name;
    public Folder parentFolder;
    public File(double size, String name) {
        this.size = size;
        this.name = name;
        this.parentFolder = null;
    }
}