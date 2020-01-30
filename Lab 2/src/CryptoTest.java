public class CryptoTest {
        public static void main(String[] args) {

            String str = Encrypter.encrypt("hello world", 3);
            System.out.print(str + "\n\n");

            String str2 = Encrypter.decrypt(str, 3);
            System.out.print(str2);
        }
    }

