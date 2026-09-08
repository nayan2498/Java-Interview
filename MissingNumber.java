public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        int sum = 0;
        int total = (10*11)/2;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        int rem = total - sum;
        System.out.println(rem);

    }
}
