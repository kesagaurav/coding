# hashing introduction 
# what is hashing 
 hashing is used for storing and retreving of data effectively.
 the problem with arrays is 
 1. it cannot handle large keys
 2. flaoting point numbers.
 3. it cannot handle string strings bec keys can be address or strings.
 what hash function does/how hash function works
 the task of hash function is to convert large keys,floating num,strings  into smaller values.
 should always map large key to smaller key values
 should generate keys from 0 to m-1/n-1 
 should uniformly distributed large keys into hash table slots.

# example of hash function
 h(large_keys)=large_keys%m 
  str="abcd";
 (str[o]*x^0+str[1]*x^1+str[2]*x^2+str[3]*x^4)%m where m is table size.

 universal hashing. -> a set of hash functions pick a randlomy hash function to hash all the data in hash

# collison handling 

 1.if we know keys in advance,then we know is perfect hashing.
 Birthday paradox -> ther are 23 people in room where halfof(50%) people will have 2 birthdays.
 2.if we don't know the keys in advance we will do the followings.
 1.chain 
 2. open addressing.-> we are having three -> 1.linear probing -> 2.quardaric probing -> 3.double hashing.

# chaining perfomance 
 1.m=no of hash table slots 
 2.n=no of keys to be inserted.
 loadfactor(alpha)=n/m 
 expected chain length=alpha

 DS(data structures) for stroring chains 
 1. linked lists. -> insert,dlete,search -> o(l)
 2.dynamic size arrays(arraylist in java,vector in c++,list in python) -> same with linked lists which is above
 3.self balacncing trees -> avl,red balck trees -> insert,delete,search -> o(logl)

 Hashing is an improvement over Direct Access Table. 
 The idea is to use a hash function that converts a given phone number or any other key to a smaller number and uses the small number as an index in a table called a hash table.


 # Open Addressing
   no.of slots of hash table >= no of keys to be inserted

# search in open Addressing

We compute the has function and compare if we find , we return true otherwise we linearly
search in table.We stop only when one of these 3 cases arrive.
1 emplty slot -> return false
2 key found 
3 traverse through whole table.-> return false

# linear probing (open addressing)
disadvantage is clustering

# How to handle clustering clustering in linear probing.
1. Quardratic Probing(secondary cluster was a problem). -> it is guarennted to work if load factor<0.5(n/m) and m is prime number
h(key,i)=(h(key)+i*i)%m;
2.Double Hashing.
h(key,i)=(h(key)+i*h2(key))%m;

# hash set complexities
1 add,remove,contains -> O(1) time complextiy on average
2.size,isEmpty() -> O(1) 

# hash and hashmap usecases 
1.if u have only keys then u can use hashset
2.key,value pairs hashmap
3.And in hashmap if u want order u can use LinkedHashMap

# problem for the intersection of two unsorted arrays.
public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        int c=0;
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);

        }
        for (int j = 0; j < b.length; j++) {
            int key=b[j];
            if (set.contains(b[j]))
                c++;
                set.remove(key);

        }
        return c;
    }

# notes regarding hashset.
1.Implements Set Interface.

2.The underlying data structure for HashSet is Hashtable.

3.As it implements the Set Interface, duplicate values are not allowed.

4.Objects that you insert in HashSet are not guaranteed to be inserted in the same order. 
Objects are inserted based on their hash code.

5.NULL elements are allowed in HashSet.

6.HashSet also implements Serializable and Cloneable interfaces.

public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable


# notes regarding about hashmap.
Method	Description	Time Complexity
put(Object key, Object value)	It is used to insert a particular mapping of key-value pair into a map.	O(1) on average

size()	It is used to return the size of a map.	O(1) on worst case

isEmpty()	Used to check whether the map is empty or not. Returns true if the map is empty.	O(1) on worst case



Method		
containsKey(Object key):Description:	Used to return True if for a specified key, mapping is present in the map.Time Complexity	O(1) on average
remove(Object key):Description:	It is used to remove the a particular key in the Map and returns the corresponding value. If the key is not present then the function returns Null.	
Time Complexity O(1) on average

# code for subarraywithgivensum.
static int subArraySum(int arr[], int n, int sum)
    {
        // add your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int presum=0;int res=0;
        for(int i=0;i<n;i++)
        {
            presum+=arr[i];
            if(presum==sum)
            res++;
            if(map.containsKey(presum-sum))
            res+=map.get(presum-sum);
            
            if(map.containsKey(presum))
            map.put(presum,map.get(presum)+1);
            else
            map.put(presum,1);
        }
        return res;
    }


    //same for solution 2 for the subarray with given sum.
     int count = 0, prefixSum = 0;

        

        HashMap<Integer,Integer> map = new HashMap<>();

        

        map.put(0,1);

        

        for(int val : arr){

            prefixSum = prefixSum + val;

        if(map.containsKey(prefixSum-sum)){

            count = count + map.get(prefixSum-sum);

        }

        

        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);

        }

        return count;

# subarray with given no of 0's and 1's.
static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         int sum = 0 , c = 0;
        
        map.put(0 , 1);
        
        for(int i = 0; i < n ; i++){
            
            if(arr[i] == 1){
                sum+=1;
            }
            
            else{
                sum-=1;
            }
            
            if(map.containsKey(sum))
            {
                c += map.get(sum);
                map.put(sum , map.get(sum)+1);
                
            }
            
            else{
                map.put(sum , 1);
            }
            
            
        }
        

        return c;
      
    }

# winner of election problem.
public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> hm = new HashMap<>();
        String res[] = new String[2];
        int max = 0;
        for(int i=0; i<n; i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            max = Math.max(hm.get(arr[i]),max);
        }
        
        for(String key : hm.keySet()){
            if(hm.get(key)==max){
                if(res[0]==null) res[0]=key;
                else{
                    if(res[0].compareTo(key)>0) res[0]=key;
                }
            }
        }
        res[1] = String.valueOf(max);
        return res;
    }

# Numbers containing 1,2,3
public static void findAll()
{
    //Your code here
    for(int i=1; i<=1000000; i++){
        if(isTrue(i)) mp.put(i,1);
    }
    
}
public static boolean isTrue(int a){
    int c=a;
    while(c>0){
        if(c%10 == 1 || c%10 == 2 || c%10 == 3){
            c/=10;
        }else{
            return false;
        }
    }
    return true;
}     