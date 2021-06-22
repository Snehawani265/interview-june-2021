package exam;


import java.util.Arrays;  
public class CountCombinations 
{  
//function to swap array elements  
public static void swapElement(int[] array, int i, int j)  
{  
int temp = array[i];  
array[i] = array[j];  
array[j] = temp;  
}  
//function to reverse a given subarray  
public static void reverseArray(int[] array, int low, int high)  
{  
for (int i = low, j = high; i < j; i++, j--)   
{  
swapElement(array, i, j);  
}  
}  
//function to rotate array to the right by k positions  
public static void rotateRight(int[] array, int k, int n)  
{  
//reverse the last k elements  
reverseArray(array, n - k, n - 1);  
//reverse the first n-k elements  
reverseArray(array, 0, n - k - 1);  
//reverse the complete array  
reverseArray(array, 0, n - 1);  
}  
public static void main(String args[])  
{  
//array to rotate  
int[] array = {1,2,3,4,5};  
//k denotes the position to shift   
int k = 1;  

System.out.println();  
 
rotateRight(array, k, array.length);  
System.out.println(Arrays.toString(array));  
}  
}   
