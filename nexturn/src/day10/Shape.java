package day10;

public sealed interface Shape permits Circle,Rectangle,Triangle{
    double area();
    
    
}
