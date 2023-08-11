package ArraysAndStrings;

public class URLify {
    public static void main(String[] args) {
        char[] str = "My name is Jaswanth T R          ".toCharArray();
        int trueLength = 23;
        replaceSpaces(str, trueLength);
        System.out.println(str);
    }

    public static void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        int index = trueLength + spaceCount*2;
        if(trueLength < str.length) str[trueLength] = '\0';
        for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -= 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}

//<-----------str.length----------->
//My name is Jaswanth T R          .
//                      i          j
//<------truelength----->