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