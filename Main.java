class Main {
    public static void main(String[] args) {
        System.out.println("Testing Program...");
        File file1 = new File(1.5, "file1.txt");
        File file2 = new File(2.0, "file2.txt");
        Folder folder1 = new Folder("folder1");
        folder1.addFile(file1);
        folder1.addFile(file2);
        System.out.println("Total size of " + folder1.name + ": " + folder1.size);
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");
        folder2.addFolder(folder3);
        File file3 = new File(3.0, "file3.txt");
        folder3.addFile(file3);
        System.out.println("Total size of " + folder2.name + ": " + folder2.size);
        System.out.println("Total size of " + folder3.name + ": " + folder3.size);
    }
}