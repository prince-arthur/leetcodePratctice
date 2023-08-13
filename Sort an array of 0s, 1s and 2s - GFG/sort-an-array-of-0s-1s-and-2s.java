//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int left = 0;
        int middle = 0;
        int right = n-1;
        int temp = 0;
        while(middle <= right){
            switch(a[middle]){
                case 0: 
                        temp = a[left];
                        a[left] = a[middle];
                        a[middle] = temp;
                        left+=1;
                        middle+=1;
                        break;
                
                case 1: middle+=1;
                        break;
                        
                case 2: 
                        temp = a[middle];
                        a[middle] = a[right];
                        a[right] = temp;
                        right-=1;
                        break;
                
            }
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends