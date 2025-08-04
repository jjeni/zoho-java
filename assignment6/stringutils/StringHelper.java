package assignment6.stringutils;

public class StringHelper {

    public String concatenate(String a, String b){
        return (a+b);
    }

    public String reverse(String s){
        char[] ch = new char[s.length()];
        int index = s.length() - 1;
        for(int i=0; i<s.length(); i++){
            ch[index] = s.charAt(i);
            index--;
        }
        return new String(ch);
    }

    public int length(String s){
        int l = 0;
        char[] ch = s.toCharArray();
        for(char c:ch){
            l++;
        }
        return l;
    }

}

