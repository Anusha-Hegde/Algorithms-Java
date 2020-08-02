class MyHashSet {

    boolean[] hash;
    /** Initialize your data structure here. */
    public MyHashSet() {
        hash = new boolean[1000001];
    }
    
    public void add(int key) {
        hash[key] = true;
    }
    
    public void remove(int key) {
        hash[key] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hash[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */



/* 
using linked list


class MyHashSet {
    
    ArrayList<Integer> set=new ArrayList<>();

    //Initialize your data structure here.
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key){
                return;
            }
        }
        set.add(key);
        
    }
    
    public void remove(int key) {
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key){
                set.remove(i);
                return;
            }
        }
    }
    
    // Returns true if this set contains the specified element
    public boolean contains(int key) {
        for(int i=0;i<set.size();i++){
            if(set.get(i)==key){
                return true;
            }
        }
        return false;
    }
}
*/ 