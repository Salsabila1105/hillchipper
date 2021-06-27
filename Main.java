import Hillchipper.Decrypt;
import Hillchipper.Encrypt;
import IO.Reader;
import IO.Writter;

public class Main {

    public static void main(String[] args) {
        
        String readedFile = Reader.readFile("data/source.txt");
        System.out.println("Source File : " + readedFile);
        
        String encryptedText = Encrypt.encrypt(readedFile);
        System.out.println("Encrypted File : " + encryptedText);
       
        Writter.writeFile("data/encrypted.txt", encryptedText);
        
        String encryptedFile = Reader.readFile("data/encrypted.txt");
        
        String decryptedFile = Decrypt.decrypt(encryptedFile);
        System.out.println("Decrypted File : " + decryptedFile);
        
        Writter.writeFile("data/decrypted.txt", decryptedFile);
    }
}