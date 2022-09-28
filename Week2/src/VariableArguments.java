public class VariableArguments {
    public static void main(String[] args){
        System.out.println(sum(7,5,2,3,1));
    }
    public static int sum(int ... numbers){
        int sum=0;
        for(int number:numbers){
            sum+=number;
        }
        return sum;
    }
}
