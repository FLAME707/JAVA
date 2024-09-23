public class FallingBodies
{
    public static void main(String[] args)
    {
        // Time
        double t = 23;
        
        // Gravity
        final double g = 9.8;
        
        // Velocity
        double v = g*t;
        
        // Height
        double h = 0.5*g*(t*t);
        
        System.out.print("The height of the cliff is ");
        System.out.print(h);
        System.out.println(" m.");
        
        System.out.print("The final velocity of the ball is ");
        System.out.print(v);
        System.out.print(" m/s.");
    }
}
