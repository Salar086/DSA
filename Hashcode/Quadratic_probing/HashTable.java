package Quadratic_probing;

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

    public int hash(Object key){
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    public int size(){
        return size;
    }

    public Object put(Object key, Object value){
        int h= hash(key);
        for(int i=0; i<entries.length; i++){
            int j= (h+i*i) % entries.length;
            Entry entry = entries[j];
            if(entry==null || entry==Nill){
                entries[j]= new Entry (key,value);
                ++size ;
                return null;
            }
        }
        return null;    
    }

    public Object remove(Object key){
        int h= hash(key);
        for(int i=0; i<entries.length;i++){
            int j= (h+i*i) % entries.length;
            Entry entry = entries[j];
            if(entry==null){
                return null;
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

    public Object get(Object key){
        int h= hash(key);
        for(int i=0; i<entries.length;i++){
            int j= (h+i*i) % entries.length;
            Entry entry = entries[j];
            if(entry==null){
                return null;
            }
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
        return null;    
    }

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
        Country c12= new Country("Brazil","Portuguese",210000000);

        HashTable ht = new HashTable();
        
        ht.put("Pk", c1);
        System.out.println("Pk-->" + ht.hash("Pk")); // Output the hash value(Original index) for "Pk"
        
        ht.put("In", c2);
        System.out.println("In-->" + ht.hash("In")); // Output the hash value(Original index) for "In"
      
        ht.put("Us", c3);
        System.out.println("Us-->" + ht.hash("Us")); // Output the hash value(Original index) for "Us"
      
        ht.put("Ch", c4);
        System.out.println("Ch-->" + ht.hash("Ch")); // Output the hash value(Original index) for "Ch"  
      
        ht.put("Ru", c5);
        System.out.println("Ru-->" + ht.hash("Ru")); // Output the hash value(Original index) for "Ru"
      
        ht.put("Ja", c6);
        System.out.println("Ja-->" + ht.hash("Ja")); // Output the hash value(Original index) for "Ja"
      
        ht.put("Ge", c7);
        System.out.println("Ge-->" + ht.hash("Ge")); // Output the hash value(Original index) for "Ge"
      
        ht.put("Fr", c8);
        System.out.println("Fr-->" + ht.hash("Fr")); // Output the hash value(Original index) for "Fr"
      
        ht.put("It", c9);
        System.out.println("It-->" + ht.hash("It")); // Output the hash value(Original index) for "It"
      
        ht.put("Ca", c10);
        System.out.println("Ca-->" + ht.hash("Ca")); // Output the hash value(Original index) for "Ca"
      
        ht.put("Me", c11);
        System.out.println("Me-->" + ht.hash("Me")); // Output the hash value(Original index) for "Me"
        
        ht.put("Br", c12);
        System.out.println("Br-->" + ht.hash("Br")); // Output the hash value(Original index) for "Br"
    
        System.out.println("Get Pakistan: "+ht.get("Pk"));
        System.out.println("Get India: "+ht.get("In"));
        System.out.println("Get USA: "+ht.get("Us"));
        System.out.println("Get China: "+ht.get("Ch"));
        System.out.println("Get Russia: "+ht.get("Ru"));
        System.out.println("Get Japan: "+ht.get("Ja"));
        System.out.println("Get Germany: "+ht.get("Ge"));
        System.out.println("Get France: "+ht.get("Fr"));
        System.out.println("Get Italy: "+ht.get("It"));
        System.out.println("Get Canada: "+ht.get("Ca"));
        System.out.println("Get Mexico: "+ht.get("Me"));
        
 /*  As we know Brazil is the 12 object and we have only 11 slots in the 
     hash table so it will not be stored in the hash table bcz there is no 
     place null remaining and it will return null.
 */   
        System.out.println("Get Brazil: "+ht.get("Br"));
    
        // We will use the Get method to retrieve the value of a country from the hash table using its key.
        System.out.println();
        System.out.println("Using the Get method : ");
        System.out.println("Get Russia with help of GET METHOD even we know we r facing collision here : "+ht.get("Ru")); // This will return the value of Russia from the hash table.

        // We will use the remove method to remove the entry of a country from the hash table using its key.
        System.out.println();
        System.out.println("Using the Remove method : ");
        System.out.println("Remove Russia with help of REMOVE METHOD even we know we r facing collision here : "+ht.remove("Ru")); // This will remove the entry of Russia from the hash table
    
        // Here we will use the Get method to retrieve the value of a country from the hash table using its key after removing it from the hash table.
        System.out.println();
        System.out.println("Get Russia after removing it from the hash table : "+ht.get("Ru")); // This will return null as the entry of Russia has been removed from the hash table.
    }

   
}
