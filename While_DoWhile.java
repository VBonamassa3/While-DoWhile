public class While_DoWhile {
    public static void main(String[] args){
        //while loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        //do while loop
        int num=1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);
    }
}
