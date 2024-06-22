import java.util.*;

public class Hashimplement {

    static class HashMap<K,V> {

        private class  Node {

            K key;
            V value;

            Node(K key,V value)
            {
                this.key =key;
                this.value = value;
            }
        
            
        }
        private int n; //n-nodes array
        private int N; //N-buckets
        private LinkedList<Node> bucket[] ;//N = bucket.length

        public HashMap()
        {
            this.N = 4;
            this.bucket = new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.bucket[i] = new LinkedList<>();
            }
        }
        
        private int bucketindex(K key)
        {
            int bi = key.hashCode(); //It can give negative as well as positive value so using abs()
            return Math.abs(bi) % N;
        }
        
        private int searchindex(K key,int bi)
        {
            LinkedList<Node> lst = bucket[bi];
            for(int i=0;i<lst.size();i++)
            {
                if(lst.get(i).key == key)
                {
                    return i;
                }
            }
            return -1;
        }

        public void rehash()
        {
            LinkedList<Node> oldBucket[] = bucket;
            bucket = new LinkedList[N*2];

            for(int i =0;i<N*2;i++)
            {
                bucket[i]= new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++)
            {
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key,V value)
        {
            int bi = bucketindex(key);
            int di = searchindex(key,bi);
            
            if(di == -1)
            {
                bucket[bi].add(new Node(key, value));
                n++;
            }
            else
            {
                Node node = bucket[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda>2.0)
            {
                rehash();
            }
        }
        
        //get
        public V get(K key)
        {
            int bi = bucketindex(key);
            int di = searchindex(key,bi);
            
            if(di == -1)
            {
                return null;
            }
            else
            {
                Node node = bucket[bi].get(di);
               return  node.value;
            }
        }

        public boolean containsKey(K key)
        {
            int bi = bucketindex(key);
            int di = searchindex(key,bi);
            
            if(di == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        public V remove(K key)
        {
            int bi = bucketindex(key);
            int di = searchindex(key,bi);
            
            if(di == -1)
            {
                return null;
            }
            else
            {
                Node node = bucket[bi].remove(di);
                n--;
                return node.value;
            }
        }
        //key set
        public ArrayList<K> keySet()
        {
            ArrayList<K> keys = new ArrayList<>();
            for(int i =0;i<bucket.length;i++)
            {
                LinkedList<Node> ll = bucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        //isempty
        public boolean isEmpty()
        {
            return n==0;
        }
    }

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        map.put("india",456);
        map.put("pakistan",234);
        map.put("china",488);
        map.put("australia",565);

        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i)+ " "+ map.get(keys.get(i)));
        }
        
    }
    
}
