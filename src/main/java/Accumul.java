public class Accumul {

    public static String accum(String s) {
        String lowerCaseString = s.toLowerCase();
        String resultString = "";
        for (int i=0; i<lowerCaseString.length();i++) {
            int times = i+1;
            while (times>0) {
                String character ="";
                if (times == i+1){
                    character = (character + lowerCaseString.toCharArray()[i]).toUpperCase();
                } else {
                    character = character + lowerCaseString.toCharArray()[i];
                }
                resultString = resultString + character;

                times--;
            }
            if (times == 0 && i!=lowerCaseString.length()-1) {
                resultString = resultString + "-";
            }
        }
        System.out.println(resultString);
        return resultString;
    }
}