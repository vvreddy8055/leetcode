class Solution {
    public void nextPermutation(int[] arr) {
        if(arr.length ==1){
            return;
        }

        int breakPoint = -1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                breakPoint = i;
                break;
            }
        }

        if(breakPoint == -1){
            reverse(arr, 0, arr.length-1);
            return;
        }

        for(int i=arr.length-1; i>breakPoint; i--){
            if(arr[i] > arr[breakPoint]){
                swap(arr, i, breakPoint);
                break;
            }
        }

        reverse(arr, breakPoint+1, arr.length-1);
    }

    static void reverse(int arr[], int start, int end){
        while(start <end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}