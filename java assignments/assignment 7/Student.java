public class Student {
    String name;
    
    public Student(){
        name = "Unknown"; 
    }

    public Student(String name){
        this.name = name;
    }

    public void nameGetter(){
        System.out.println(this.name);
    }
}

public static void main(String[] args){
    Student temp = new Student();
    Student einstein = new Student("Albert Einstein");

    temp.nameGetter();
    einstein.nameGetter();


}
