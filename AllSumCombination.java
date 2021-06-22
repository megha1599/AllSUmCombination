import java.io.*;
 
class Combination
{
    
static void findCombinations(int arr[], int index,
                                 int num, int reducedNum)
{
    
    if (reducedNum < 0)
        return;
 
    if (reducedNum == 0)
    {
        for (int i = 0; i < index; i++)
                System.out.print (arr[i] + " ");
            System.out.println();
        return;
    }
    int prev = (index == 0) ?
                          1 : arr[index - 1];
 
    
    for (int k = prev; k <= num ; k++)
    {
        
        arr[index] = k;
 
        
        findCombination(arr, index + 1, num,
                                 reducedNum - k);
    }
}
 
static void findCombinations(int n)
{
    
    int arr[] = new int [n];

    findCombination(arr, 0, n, n);
}
 

public static void main (String[] args)
{
    int n = 5;
    findCombinations(n);
}
}
 