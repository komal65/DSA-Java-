import java.uti.*;
class solution{
 public static ArrayList<Integer>printLeadersBruteForce(int[] arr, int n){
    
  ArrayList<Integer> ans= new ArrayList<>();
   int max = arr[n - 1];
   ans.add(arr[n-1]);
   for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max)
      {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
  }
