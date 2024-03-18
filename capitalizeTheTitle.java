
// 2129. Capitalize the Title
// You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
// If the length of the word is 1 or 2 letters, change all letters to lowercase.
// Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
// Return the capitalized title.

// Example 1:
// Input: title = "capiTalIze tHe titLe"
// Output: "Capitalize The Title"

public class capitalizeTheTitle {
    public String capitalizeTitle(String title) {
    
        String[] words = title.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.length() <= 2) {
                result.append(word.toLowerCase());
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
            result.append(" ");
        }
        
    
        return result.toString().trim();
    
    }}
 {
    
}
