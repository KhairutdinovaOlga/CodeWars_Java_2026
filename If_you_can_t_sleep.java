public class If_you_can_t_sleep {
    public static String countingSheep(int num) {
        String result= "";
        if (num==0){
            return "";
        }
        for(int i=1;i<=num; i++){
            result= result + i+ " sheep...";

        }
        return result;
    }
}
