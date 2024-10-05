public class Java{
    public static int occurence(int[] arr, int n, int x){
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == x){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 4, 5, 6, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        int n = arr.length;
        int x = 5;
        System.out.println(occurence(arr, n, x));
    }
}