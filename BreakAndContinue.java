public class BreakAndContinue {
    public static void main(String[] args) {
        for(int i = 1; i < 1000; i++){
            if (i == 40){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");


        for(int i = 1; i < 10; i++){
            if (i == 4){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
    }
}
