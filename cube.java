/**
This class holds data about a cube.
*/

public class cube extends rectangle
{
private double height; // The cube's height

/**
the contructor sets the cube's length, 
width, and height. 
@param len The cube's length.
@param w The cube's width.
@param H The cube 's height.
*/

public cube (double len,double w, double h) 
{
// Call the superclass constructor.
super(len, w);
// Set the height.
height = h;
}
/**
The getHeight method  return the cube's height.
@return the value in the height field.
*/

public double getheight()
{
return height;
/** 
the getgetSurfaceArea method calculates and
  returns the cube's surface area. 
   @return The surface area of the cube. 
     */ 
 public double getSurfaceArea()
     {
     return getArea()*6;
     }
     /**
       The getVolume method calculates and 
       returns the cube's volume. 
        @return The volume of the cube. 
          */ 
          
          public double getVolume()
          {
          return getArea() * height;
          }
         }
         
