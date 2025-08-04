package Assignment4;

class MyString{

    private char[] data;

    MyString(char[] chars){
        this.data = new char[chars.length];
        for(int i=0; i<chars.length; i++){
            this.data[i] = chars[i];
        }
    }

    MyString(String str){
        this.data= str.toCharArray();
    }


    int length(){
        int stringLength =0 ;
        for(char c: this.data){
            stringLength++;
        }
        return stringLength;
    }

    char charAt(int index) {
    if (index >= 0 && index < data.length) {
        return data[index];
    }
    return ' ';
    }

    boolean equals(MyString other){
        if (this.length() != other.length()){
            return false;
        }
        for(int i=0; i<this.length(); i++){
            if (this.data[i] != other.data[i]) {
            return false;
        }
        }
        return true;
    }

    MyString toUpperCase(){
        char[] upperChars = new char[this.length()];

        for(int i=0; i<this.length(); i++){
            char ch = this.data[i];

            if(ch >= 'a' && ch <= 'z'){
                upperChars[i] = (char) (ch -32);
            }
            else {
                upperChars[i] = ch;
            }
        }
        return new MyString(upperChars);
    }
    
    MyString toLowerCase(){
        char[] lowerChars = new char[this.length()];

        for(int i=0; i<this.length(); i++){
            char ch = this.data[i];
            if(ch >='A' && ch<='Z'){
                lowerChars[i] = (char) (ch + 32);
            }
            else {
                lowerChars[i] = ch;
            }
        }

        return new MyString(lowerChars);
    }

    MyString substring(int start, int end){
        char[] subString = new char[end-start];

        for(int i=0; i<subString.length; i++){
            subString[i] = this.data[start+i];
        }

        return new MyString(subString);
    }

    MyString concat(MyString other){
        int l = this.length() + other.length();
        char[] concatStr = new char[l];
        int count = 0;
        for(int i=0; i<l; i++){
            if (i<this.length()){
                concatStr[i] = this.data[i];
            }
            else {
                concatStr[i] = other.data[count];
                count++;
            }
        }
        return new MyString(concatStr);
    }

    boolean contains(MyString sub) {
    if (sub.length() > this.length()) {
        return false;
    }

    for (int i = 0; i <= this.length() - sub.length(); i++) {
        int j = 0;

        while (j < sub.length() && this.data[i + j] == sub.data[j]) {
            j++;
        }

        if (j == sub.length()) {
            return true; 
        }
    }

    return false; 
    }

    int indexOf(char ch){
        for(int i=0; i<this.length(); i++){
            if(this.data[i] == ch){
                return i;
            }
        }
        return -1;
    }

    MyString replace(char oldChar, char newChar){
        char[] replaced = new char[this.length()];

        for(int i=0; i<this.length(); i++){
            if (this.data[i] == oldChar){
                replaced[i] = newChar;
            }
            else {
                replaced[i] = this.data[i];
            }
        }

        return new MyString(replaced);
    }

    public String toString(){
        return new String(data);
    }
        
    }




public class CustomClass {
    public static void main(String[] args) {
        MyString name = new MyString("Jeni");
        System.out.println("Length : "+name.length());
        System.out.println("ChatAt : "+name.charAt(0));
        System.out.println("toUpperCase : "+name.toUpperCase());
        System.out.println("toLowerCase : "+name.toLowerCase());      
        System.out.println("indexOf :  "+name.indexOf('e'));       
        System.out.println("substring : "+name.substring(1, 3));    
        System.out.println("replace : "+name.replace('i', 'y'));  
        System.out.println("contains ; "+name.contains(new MyString("en")));
        System.out.println("concat : "+name.concat(new MyString(", Working on Java Program.")));
    }
}
