package n7t5n2025;

public class EquilibriumPoint {
    public static int findEquilibrium(int arr[]) {
        // code here
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        int left = 0;
        for(int i = 0; i < arr.length; i++){
            int right = sum - left - arr[i];

            if(left == right){
                return i;
            }

            left = left + arr[i];
        }

        return -1;
    }
}
