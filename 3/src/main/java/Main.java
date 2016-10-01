public class Main {

    public static void main(String[] args) {

        RW rw = new RW();

        String path1 = "C:\\Users\\AlNat\\Source\\Studi\\inp.txt"; //args[0];
        String path2 = "C:\\Users\\AlNat\\Source\\Studi\\out.txt"; //args[1];
        String path3 = "C:\\Users\\AlNat\\Source\\Studi\\out1.txt"; //args[2];

        rw.Crypt (path1, path2);

        rw.Encrypt(path2, path3);

    }

}