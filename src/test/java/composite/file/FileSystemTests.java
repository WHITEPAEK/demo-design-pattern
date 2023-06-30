package composite.file;

import org.junit.jupiter.api.Test;

class FileSystemTests {

    @Test
    void file_system_test() {
        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        Directory dir1 = new Directory("폴더 1");
        Directory dir2 = new Directory("폴더 2");

        dir1.addComponent(file1);
        dir1.addComponent(dir2);
        dir2.addComponent(file2);
        dir2.addComponent(file3);
        dir1.display();

        System.out.println("--------------");
        dir1.removeComponent(dir2);
        dir1.display();

    }

}
