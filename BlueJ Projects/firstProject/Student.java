
public class Student
{
    private int pointsPossible;
    private int pointsEarned;
    private String name;
    

    public Student(){
        name = "Jane Doe";
        
    }
    
    public Student(String n, int P, int E){
        name = n;
        pointsPossible = P;
        pointsEarned = E;
    }
    
    public void addAssignment(int P, int E){
        pointsPossible += P;
        pointsEarned += E;
        
    }
    
    public double getPercent(){
        return (double) pointsEarned / pointsPossible * 100;
    }
    
    public String toString(){
        return name + ": Points Earned: " + pointsEarned + ", Points Possible: " + pointsPossible;
        
        
    }
}
    
    
    
    

