/*
    --> To Lower Case <--

    Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

 

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
 

Constraints:

1 <= s.length <= 100
s consists of printable ASCII characters.

 */

public class ToLowerCase {
    public String toLowerCase(String s) {
        String newstr = "";
        for (int i = 0; i < s.length(); i++) {
            int assci_code = (int) s.charAt(i);
            if (assci_code >= 65 && assci_code <= 90) {
                newstr = newstr + (char) (assci_code + 32);
            } else {
                newstr = newstr + s.charAt(i);
            }
        }
        return newstr;
    }

}