package Practice_linkedlist;
class DataOfStudent{
    int age;
    String name;
    String depname;
    DataOfStudent(int age,String name,String depname){
        this.age=age ;
        this.name= name;
        this.depname=depname;
    }
}
public class Students{
    private DataOfStudent data;
    private Students next;
    Students(DataOfStudent data){
        this.data= data;
        
    }
    Students(DataOfStudent data,Students next){
        this.data= data;
        this.next= next;
    }

    //makeee objects of DataOfStudent class .
    public static void main(String[] args) {
        DataOfStudent s1=new DataOfStudent(23,"ali","CS");
          DataOfStudent s2=new DataOfStudent(13,"bahi","CS");
            DataOfStudent s3=new DataOfStudent(223,"hagna","CS");

            DataOfStudent [] ArrayStudents ={s1,s2,s3};

            Students start=null; // these will help uss to put data in linkedlist in sorted way .
            Students end=null;  //these will help uss to put data in linkedlist in sorted way .
            
            //now put all objects of array in linkedlist .
            for(int i=0;i<ArrayStudents.length;i++){
                Students newnode= new Students(ArrayStudents[i]);
                if(start==null){
                    start=newnode;
                    end=start;
                }
                else{
                    end.next=newnode;
                    end=end.next;
                }
            }
            int serialno=1;
            for(Students i=start;i!=null;i=i.next){
                System.out.println("Student : "+ serialno);
                System.out.println("age : " + i.data.age);
                System.out.println("name : " + i.data.name);
                System.out.println("depname : " + i.data.depname);
                serialno++;
                System.out.println();
            }

    }
}
