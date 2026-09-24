package Linear_probing;
class Country{
    String name;
    String Language;
    int population; 

    Country(String name, String Language, int population){
        this.name = name;
        this.Language = Language;
        this.population = population;
    }
    public String toString(){
        return "Country name: "+name+ ", Language: "+Language+", Population: "+population;
    }
}

public class HashTable {
    
    private class Entry{
        Object key;
        Object value;

        Entry(Object key, Object value){
            this.key = key;
            this.value = value;
        }
    }

    // Nill is a special entry that indicates a deleted entry in the hash table
    Entry Nill = new Entry(null, null);

    private Entry[] entries = new Entry[11];
    private int size;

    // Hash function to compute the index for a given key .
    private int hash(Object key){
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    // Returns the number of entries in the hash table.
    public int size(){
        return size;
    }

    // Inserts a new key-value pair into the hash table.

    /*  If the key already exists, it updates the value. whic can cause collision 
        and linear probing will be used to find the next available slot. */

    public Object put(Object key, Object value){
        int h= hash(key);
        for(int i=0; i<entries.length; i++){
            int j= (h+i) % entries.length;
            Entry entry = entries[j];
            if(entry==null){
                entries[j]= new Entry (key,value);
                ++size ;
                return null;
            }
        }
        return null;
    }

    // Retrieves the value associated with the given key from the hash table.
    public Object get(Object key){
        int h= hash(key);
        for(int i=0; i<entries.length;i++){
            int j=(h+i) % entries.length;
            Entry entry= entries [j];
            if(entry==null){
                break;
            }
            if(entry==Nill){
                continue;
            }
            if(entry.key.equals(key)){
                return entry.value; 
            }
        }
        return null;    
    }

    // Removes the entry associated with the given key from the hash table.
    public Object remove(Object key){
        int h= hash(key);
        for(int i=0; i<entries.length;i++){
            int j=(h+i) % entries.length;
            Entry entry= entries [j];
            if(entry==null){
                break;
            }
            if(entry==Nill){
                continue;
            }
            if(entry.key.equals(key)){
                Object temp=entry.value;
                entries[j]=Nill;
                --size;
                return temp; 
            }
        }
        return null;    
    }

    // Main Method to test the HashTable implementation .
    public static void main(String[] args) {
        Country c1= new Country("Pakistan","Urdu",220000000);
        Country c2= new Country("India","Hindi",1400000000);    
        Country c3= new Country("USA","English",330000000);
        Country c4= new Country("China","Mandarin",1400000000);
        Country c5= new Country("Russia","Russian",145000000);
        Country c6= new Country("Japan","Japanese",126000000);
        Country c7= new Country("Germany","German",83000000);
        Country c8= new Country("France","French",67000000);
        Country c9= new Country("Italy","Italian",60000000);
        Country c10= new Country("Canada","English",38000000);
        Country c11= new Country("Mexico","Spanish",126000000);

        // Create a hash table and add the countries to it.
        HashTable ht= new HashTable();
       
        ht.put("Pk",c1);
        // With help of this sout statement we can check the index value of that key .
        System.out.println("Pk-->"+ ht.hash("Pk")); 

        ht.put("In",c2);
        System.out.println("In-->"+ ht.hash("In"));

        ht.put("Us",c3);
        System.out.println("Us-->"+ ht.hash("Us"));

        ht.put("Ch",c4);
        System.out.println("Ch-->"+ ht.hash("Ch"));

        ht.put("Rs",c5);
        System.out.println("Rs-->"+ ht.hash("Rs"));

        ht.put("Jp",c6);
        System.out.println("Jp-->"+ ht.hash("Jp"));

        ht.put("Gr",c7);
        System.out.println("Gr-->"+ ht.hash("Gr"));

        ht.put("Fr",c8);
        System.out.println("Fr-->"+ ht.hash("Fr"));

        ht.put("It",c9);
        System.out.println("It-->"+ ht.hash("It"));

        ht.put("Ca",c10);
        System.out.println("Ca-->"+ ht.hash("Ca"));

        ht.put("Mx",c11);
        System.out.println("Mx-->"+ ht.hash("Mx"));

        /* Now, we know that India and Japan have the same hash value(Index No) . 
        so, we will face collision here . So, we will use linear probing to find 
        the next available slot for Japan. But after storing Japan we dont know the 
        index of Japan because it is not stored at its original hash value.
         */

        System.out.println("Get Pakistan: "+ht.get("Pk"));
        System.out.println("Get India: "+ht.get("In"));
        System.out.println("Get USA: "+ht.get("Us"));
        System.out.println("Get China: "+ht.get("Ch"));
        System.out.println("Get Russia: "+ht.get("Rs"));
        System.out.println("Get Japan: "+ht.get("Jp"));
        System.out.println("Get Germany: "+ht.get("Gr"));
        System.out.println("Get France: "+ht.get("Fr"));
        System.out.println("Get Italy: "+ht.get("It"));
        System.out.println("Get Canada: "+ht.get("Ca"));
        System.out.println("Get Mexico: "+ht.get("Mx"));

        /*  To Get the value of Japan we will use the key "Jp"
        and it will return the value of Japan from the hash table.
        but bcz of collisiom we will not get the value of Japan from its original hash value(Index No).
        So, we will use linear probing to find the next available slot for Japan. As, we
        dont know the stored index of Japan . So for searching we will face worst case scenario. 
        bcz the time complexity of searching in linear probing is O(n) in worst case scenario.
        */
        
       System.out.println();
       System.out.println("Get Japan with the help of its key and Get Method : "+ht.get("Jp"));
    }

    
}
