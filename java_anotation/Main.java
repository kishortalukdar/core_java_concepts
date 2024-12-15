package java_anotation;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        String name;

        Student stu = new Student();
        name = stu.getName("Kishor Talukdar");
        System.out.println("Welcome, " + name);

        // Accessing the @MyAnnotation using Reflection
        Method method = Student.class.getMethod("getName", String.class);

        // Check if the method is annotated with @MyAnnotation
        if (method.isAnnotationPresent(MyAnnotation.class)) {
            // Get the annotation instance
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);

            // Access annotation values
            System.out.println("Annotation Details:");
            System.out.println("Author: " + annotation.author());
            System.out.println("Version: " + annotation.version());
        } else {
            System.out.println("No annotation found on method.");
        }
    }
}
