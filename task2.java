public class task2{

 
    public static void main (String[] args){

    int nums[] = {10,20,30,40,50,5,7,9};
    int max ,min;

    max = nums[0];
    min = nums[0];

    for (int i : nums) {
        if(max<i){
            max = i;
        }
        if(min>i){
            min = i;
        }
    }
    System.out.println("max ="+max);
    System.out.println("min ="+min);
    }
}
