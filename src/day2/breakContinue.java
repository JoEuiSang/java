package day2;

public class breakContinue {
    public static void main(String[] args) {
        for (int i =0; i<10; i++){
            if(i==5){
                break;
            }
            System.out.println("�ȳ�"+i);
        }

        

        for (int i =0; i<10; i++){
            if(i==5){
                continue;
            }
            System.out.println("�ȳ�"+i);
        }
    }
}