public class SimpleMult {
    public static int simpleMultiplication(int n) {
        int i=0;
        if(n%2==0){
            i=n*8;
        }else{
            i=n*9;
        }
        return i;
    }
}
