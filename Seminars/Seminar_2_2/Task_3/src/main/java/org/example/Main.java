package org.example;

public class Main {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        String result = countJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public static String countJewelsInStones(String jewels, String stones){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < jewels.length(); i++){
            char jewls = jewels.charAt(i);
            int count = 0;

            for(int j = 0; j < stones.length(); j++){
                if(stones.charAt(j) == jewls){
                    count++;
                }
            }

            result.append(jewls);
            result.append(count);
        }
        return result.toString();
    }
}
//
//    public static String countJewelsInStones(String stones){
//    int a = stones.length()-stones.replace("a","").length();
//    int b = stones.length() - stones.replace("B","").length();
//    String result = ("a"+ a + "B" + b);         return result;
//    }
//}