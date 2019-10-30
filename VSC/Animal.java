public class Animal{
    
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void sleep(){
        System.out.println(name + " goes zzzzz");
    }

    public void eat(){
        System.out.println(name + " says nom nom");
    }
    
    public String speak(){
        return "I went to Maryville"; 
    }


   public String getName(){
       return name;
   }

   public String toString(){
    return name + " says " + speak();
    }

}