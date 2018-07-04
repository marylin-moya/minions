class Kata {
    public static String getMiddle(String word) {
        String resultString = "";
        if (word.length() % 2 == 0) {
            int index = word.length() / 2;
            resultString = resultString + word.toCharArray()[index - 1];
            resultString = resultString + word.toCharArray()[index];
        } else {
            int index = (word.length() - 1) / 2;
            resultString = resultString + word.toCharArray()[index];
        }
        return resultString;
    }
}
