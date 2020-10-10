package gun14;

public class Task1 {
    // write a java program which calculate sum from [0 to 5];
    // use for-loop
    // 0+1+2+3+4+5 = 15

    public static void main(String[] args) {
        int result = 0;
        for(int i = 0; i <= 5; i++) {
//            if(i==1 || i==3){
//                continue;  //break;
//            }
            System.out.println(i);
            result += i;

        }

        System.out.println( "Result is: " + result );

    }
}
