public class Methods {
    public static void main(String[] args){
        findNumber();
    }

    public static void findNumber(){
        int[] numbers = new int[]{1,2,3,7,8,0};
        int find=6;
        boolean flag = false;

        for(int number:numbers){
            if(number==find){
                flag = true;
                break;
            }
        }

        if(flag){System.out.println("Number is found.");}
        else{System.out.println("Number is not found.");}
    }
}
