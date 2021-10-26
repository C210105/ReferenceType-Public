public class Main {

    public static void main(String[] args) {
        String obj1 = "A";
        String obj2 = "B";
        String obj3 = "C";

        String answer = new String("B");

        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        System.out.println("obj3: " + obj3);

        System.out.println("----------");
        // System.out.println("answer: " + answer);
        if(answer.equals(obj2)) {
            // System.out.println("obj2とanswerは同じ参照値です。");
            System.out.println("answer: " + answer);
        }
    }

}