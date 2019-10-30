import java.awt.Color;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

public class OctagonBug extends Bug
{
    private int sideLength;
    private int steps;
    
    
    public OctagonBug(){
        sideLength = 2;
        steps = 0;
        setColor(Color.BLACK);
    }
    
    
    public void act(){
        if(steps < sideLength){
            move();
            steps++;
            
        }else{
            setDirection(getDirection() + Location.HALF_LEFT);
            steps = 0;
        }
        
        
    }
}
