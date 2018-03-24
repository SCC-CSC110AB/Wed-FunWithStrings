package wed.funwithstrings;

/**
 *
 * @author john
 */
public class WedFunWithStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String stringToProcess = "How many vowels are in this string?";
        int totalVowels = 0;
        
        for (int i = 0; i < stringToProcess.length(); i++) {
            char currentChar = stringToProcess.charAt(i);
            
            switch(currentChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    totalVowels++;
                    break;
                default:
                    break;
            }
        }
        
        System.out.println("There are " + totalVowels + " vowels");
    }
    
}
