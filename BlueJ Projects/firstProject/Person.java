
public class Person
{
    //Fields constructors methods
    //Fields - instance data ... private
    //access type variableName
    
    private int age;
    private String name;
    
    
    
    //constructers - instructions that run when the object is created/initialize fields ... same name as class and no return data
    
    public Person(){
        name = "Jane Doe";
        age = 27;
        
        
    }
    
    
    //methods - things the object can do
    //access returnType methodName(parameters)
    
    public void growOlder(){
        age++;
        
    }
    
    public void introduce(){
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old.");
        
    }
}
