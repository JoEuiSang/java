package day2;

public class breakContinue {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println("¾È³ç"+i);
        }

        

        for (int i =0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println("¾È³ç"+i);
        }
    }
}