package java_anotation;
public class Student {

    @MyAnnotation(author = "Alice", version = 2)
    public String getName(String name){
        return name;
    }
    
}
