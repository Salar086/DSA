class Country{
    String name ;
    String Language;
    int population;

    Country(String name, String Language, int population){
        this.name = name;
        this.Language = Language;
        this.population = population;
    }

    public String toString(){
        return "Country name: "+name+" Language: "+Language+" Population: "+population;
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

    private Entry[] entries=new Entry[11];
    private int size;

    private int hash(Object key){
        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    public int size(){
        return size;
    }

    public Object get(Object key){
        return entries[hash(key)].value;
    }

    public Object put(Object key,Object value){
        entries[hash(key)] = new Entry(key,value);
        size++;
        return null;

    }
    
    public Object remove(Object key){
        int h= hash(key);
        Object temp=entries[h].value;
        entries[h]=null;
        size--;
        return temp;
    }

    public static void main(String[] args) {
        Country c1 = new Country("India", "Hindi", 1000000);
        Country c2 = new Country("USA", "English", 500000);
        Country c3 = new Country("Japan", "Japanese", 200000);
        Country c4 = new Country("Germany", "German", 300000);
        Country c5 = new Country("France", "French", 400000);
        Country c6 = new Country("Canada", "English", 350000);
        Country c7 = new Country("Mexico", "Spanish", 230000);
        Country c8 = new Country("China", "Chinese", 760000);
        Country c9 = new Country("Russia", "Russian", 6500000);
        Country c10 = new Country("Italy", "Italian", 980000);

            HashTable ht = new HashTable();

            // Adding countries to the hash table .
            ht.put("IN", c1);
            // Displaying the hash value of the key "IN" . So we can see the actual collision in the hash table.
            System.out.println("IN -->" + ht.hash("IN "));


            ht.put("US", c2);
             System.out.println("US -->" + ht.hash("US "));

            ht.put("JP", c3);
             System.out.println("JP -->" + ht.hash("JP "));

            ht.put("DE", c4);
             System.out.println("DE -->" + ht.hash("DE "));

            ht.put("FR", c5);
             System.out.println("FR -->" + ht.hash("FR "));

            ht.put("CA", c6);
             System.out.println("CA -->" + ht.hash("CA "));

            ht.put("MX", c7);
             System.out.println("MX -->" + ht.hash("MX "));

            ht.put("CN", c8);
             System.out.println("CN -->" + ht.hash("CN "));

            ht.put("RU", c9);
             System.out.println("RU -->" + ht.hash("RU "));

            ht.put("IT", c10);
            System.out.println("IT -->" + ht.hash("IT "));

            // Displaying the size of the hash table after adding all the countries.
            System.out.println();
            System.out.println("Size of the hash table: " + ht.size());

            // Displaying the countries in the hash table.
            System.out.println();
            System.out.println("Countries in the hash table:");
            System.out.println(ht.get("IN"));
            System.out.println(ht.get("US"));
            System.out.println(ht.get("JP"));

            // Important Note to Remember :
         
       /*   Now, in that hashtable (array) we have India,Japan and russia at the same index (which is 3) . So, bcz of this 
            Russia's values overwrite the values of India and Japan. So, when we try to get the values of India and Japan, 
            it will return Russia's values instead of their own values. This is called collision in hash table.  */
    
        }

}
