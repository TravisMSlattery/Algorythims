
public class Encrypter {
        public static String encrypt (String plaintext,int numColumns){
            //Remove spaces
            String textNoSpaces = "";

            for (int i = 0; i < plaintext.length(); i++) {
                if (plaintext.charAt(i) != ' ') {
                    textNoSpaces += plaintext.charAt(i);
                }
            }
            int numRows;
            if (textNoSpaces.length() % numColumns == 0) {
                numRows = textNoSpaces.length() / numColumns;
            } else {
                numRows = textNoSpaces.length() / numColumns + 1;
            }
            int nXs = numRows * numColumns - textNoSpaces.length();
            for (int i = 1; i <= nXs; i++) {
                textNoSpaces += 'x';
            }

            String cipherText = "";
            for (int col = 0; col <= numColumns - 1; col++) {

                int index = col;

                for (int row = 0; row <= numRows - 1; row++) {

                    cipherText = cipherText += textNoSpaces.charAt(index);
                    index += numColumns;
                }

            }
            return cipherText;
        }
    public static String decrypt(String plaintext, int numColumns){

        int numRows;
        String cipherText = "";
        numRows = plaintext.length()/numColumns;

        for(int i = 0 ; i < numRows; i ++){
            for(int j =i; j < plaintext.length(); j += numRows){
                cipherText += plaintext.charAt(j);
            }
        }
        return cipherText;
    }
}


