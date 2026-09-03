public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12,3,4,5,6,7,8,9,98,56};

        int highest = Integer.MIN_VALUE;
        int secondHighest =  Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > highest){
                secondHighest = highest;
                highest = arr[i];
            }else if(arr[i] > secondHighest  && arr[i] != highest){
                secondHighest = arr[i];
            }

        }
        System.out.println(secondHighest);

    }
    
}
