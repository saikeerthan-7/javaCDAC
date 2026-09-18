package assignment8;

import java.io.*;

class WriteBookObject {

    public static void main(String[] args) throws IOException {

        Book b = new Book(101, "Ramayana", "Valmiki", 999);

        FileOutputStream fos = new FileOutputStream("book.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(b);

        oos.close();
        fos.close();

        System.out.println("Object is written");
    }
}

