# what is recursion
 recursion means fucntion calling itself.
# typical style of recursion.
  func(){
    //base cases
    //with atleast one change in parameters
  }

# Applications of recursion.

    A.many algorthims using recursion
    1.DP(dynamic programming)
    2.Divide and conqueror
    3.Backtracking.

    B.Standrad problems in recursion.
    1.Tower Of hanoi.
    2.DFS,BFS(traversals)
// towers of hanoi problem
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        long count=0;
        if(N==1){
    System.out.println("move disk " + N + " from rod " +  from +  " to rod " + to);
            return 1;
            
        }
        count+=toh(N-1,from,aux,to);
        System.out.println("move disk " + N + " from rod " +  from + " to rod " + to);
        count+=1;
        count+=toh(N-1,aux,to,from);
        return count;
    }


    //jospheus problem
    class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        return jos(n,k)+1;
      
    }
    
    static int jos(int n,int k){
         if(n == 1)
    		return 0;
    	
    		return (jos(n - 1, k) + k) % n;
    }

}

}


//power using recursion
class Solution
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p==0){
            return 1;
        }
        if(p%2==0){
            int res=RecursivePower(n,p/2);
            return res*res;
        }else{
            return RecursivePower(n,p-1)*n;
        }
        
    }
 
}

//sum of digits of a number
class Solution
{
    // complete the function
    public static int sumOfDigits(int n)
    {
        // add your code here
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }
}

//count total no of digits using recursion
class Solution
{
    // complete the below function
    public static int countDigits(int n)
    {
        // add your code here
        if(n<10){
            return 1;
        }else{
            return 1+countDigits(n/10);
        }
    }
}

//power of an number
class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int mod=1000000007;
        if(R==0){
            return 1;
        }
        long ans=0;
        if(R%2==0){
            ans=power(N,R/2);
            ans=(ans*ans)%mod;
        }else{
            ans=N%mod;
            ans=(ans*power(N,R-1)%mod)%mod;
        }
        return (ans)%mod;
        
    }

}

//lucky numbers
class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        for(int i=2;i<=n;i++){
            if(n%i==0)
                return false;
                
                n=n-n/i;
            
        }
        return true;
    }
}

//power set using recursion
 class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
     static ArrayList<String> al;
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        al=new ArrayList<>();
        subsets(s,"",0);
        Collections.sort(al);
        return al;
    }
    
  static  void subsets(String s,String curr,int idx){
        if(idx==s.length()&&curr.length()>0){
            al.add(curr);
            return;
        }
        if(idx<s.length()){
            subsets(s,curr,idx+1);
            subsets(s,curr+s.charAt(idx),idx+1);
        }
    }
}


 

// possibel numbers
class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here  
        ArrayList <String> res=new ArrayList<String>();
        if(N==0){
            return res;
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        backTrack(a,0,map,new StringBuilder(),res);
        return res;
        
    }
    static void backTrack(int a[],int i,HashMap<Integer,String> map,StringBuilder sb,List<String> res){
        if(sb.length()==a.length){
            res.add(sb.toString());
            return;
            
        }
        
        String currEle=map.get(a[i]);
        for(int j=0;j<currEle.length();j++){
            sb.append(currEle.charAt(j));
            backTrack(a,i+1,map,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}