public class DuplicateZeros {
    
  

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length ; i++) { 
            if (arr[i] == 0) { 
                shiftingRight(arr, i);
                i ++;
            }
        }
        for (int num : arr) { 
            System.out.println(num);
        }

    }

    public void shiftingRight(int[] arr, int num) {
        // a shifting right algorithm 
        int next = 0;
        for (int i = num; i < arr.length - 1; i ++) {
            // if we are at the first index 
            if (i == num) { 
                next = arr[i + 1]; // store the second elemnt
                arr[i + 1] = arr[i]; // move the first element one one right
            } else {
                // if we are past the first element
                int temp =  arr[i + 1];
                arr[i + 1] = next; 
                next = temp;
            }
        }
    } 


    public static void main(String[] args) { 
        int[] arr = new int[]{1,0,2,3,4,0,5,6,7};
        DuplicateZeros dz  = new DuplicateZeros();
        dz.duplicateZeros(arr);
    }
}
