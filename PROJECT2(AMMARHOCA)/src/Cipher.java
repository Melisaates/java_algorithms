

/**
 * Project 2 -- Cipher
 *
 * This is an implementation of encryption and decryption algorithms of a
 * substitution cipher
 *
 * @author Melisa Ates-20120205045
 *
 * atesmel12@gmail.com
 *
 * @class BIL 122
 *
 * @date date of completion
 *
 */

public class Cipher {

    final String plaintextAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; // Plaintext
    // Alphabet
    private String keyword; // The Secret Keyword
    private String ciphertextAlphabet; // Ciphertext Alphabet

    /**
     * Class constructor initializes the keyword and creates the Ciphertext Alphabet
     *
     * @param key the secret keyword used to create the ciphertext alphabet
     */
    public Cipher(String key) {
        this.keyword=key;
        ciphertextAlphabet=initCiphertextAlphabet();

    }

    /**
     * removes all duplicate occurrences of characters from a String
     *
     * @param s String with duplicate occurrences of characters
     * @return String with no duplicate characters in it
     */
    public static String removeDups(String s) {
        String result=String.valueOf(s.charAt(0));
        for(int i=1;i<s.length();i++){
            for(int j=0;j<result.length();j++){
                if(result.charAt(j)!=s.charAt(i)){
                    if(!(result.contains(String.valueOf(s.charAt(i)))))
                        result=result.concat(String.valueOf(s.charAt(i)));
                }
            }
        }
        return result;

    }

    /**
     * generates the ciphertext alphabet from the keyword
     *
     * @return String of ciphertext alphabet generated from the keyword
     */
    public String initCiphertextAlphabet() {

        String m=removeDups(keyword.toUpperCase());


        for(int i=0;i<plaintextAlphabet.length();i++){
            for(int j=0;j<removeDups(keyword.toUpperCase()).length();j++){
                if(m.charAt(j)!=plaintextAlphabet.charAt(i)){
                    m=m.concat(String.valueOf(plaintextAlphabet.charAt(i)));
                }
            }

        }


        //String cipher=removeDups(keyword.concat(plaintextAlphabet));
        return m;

    }

    /**
     * Encrypts a message in plaintext
     *
     * @param message the message to be encrypted in ciphertext alphabet
     * @return the encrypted message in ciphertext alphabet
     */
    public String encrypt(String message) {
        String newMessage;
        message=message.toUpperCase();

        char[] n=new char[message.length()];

        for(int i=0;i<message.length();i++){
            for(int j=0;j<plaintextAlphabet.length();j++){

                if(message.charAt(i)==plaintextAlphabet.charAt(j)){
                    //newMessage=newMessage.concat(String.valueOf(ciphertextAlphabet.charAt(j)));
                    n[i]=ciphertextAlphabet.charAt(j);
                }else{
                    //newMessage=newMessage.concat(String.valueOf(message.charAt(i)));
                    n[i]=message.charAt(i);

                }
            }

        }
        newMessage=String.valueOf(n[0]);

        for(int k=1;k<n.length;k++){
            newMessage=newMessage.concat(String.valueOf(n[k]));
        }
        return newMessage;

    }

    /**
     * Encrypts a message in plaintext
     *
     * @param ciphertext ciphertext in ciphertext alphabet
     * @return the decrypted message in plaintext alphabet
     */
    public String decrypt(String ciphertext) {

        char[] m=new char[ciphertext.length()];
        String newMessage2;
        for(int i=0;i<ciphertext.length();i++){

            for(int j=0;j<ciphertextAlphabet.length();j++){

                if(ciphertext.charAt(i)==ciphertextAlphabet.charAt(j)){
                    //newMessage2=newMessage2.concat(String.valueOf(plaintextAlphabet.charAt(j)));
                    m[i]=plaintextAlphabet.charAt(j);
                }
            }

        }
        newMessage2=String.valueOf(m[0]);
        for(int k=1;k<m.length;k++){
            newMessage2=newMessage2.concat(String.valueOf(m[k]));
        }
        return newMessage2;
    }

    public static void main(String[] args) {
        Cipher c=new Cipher("medeniyet2021");
        //System.out.println(c.encrypt("THIS IS A SECRET"));
        System.out.println(c.decrypt("MKIL KIU0VVV"));
    }
}
