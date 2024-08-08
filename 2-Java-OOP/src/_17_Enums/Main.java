package _17_Enums;
// Enums: Special "class" that represents a group of constants
//        (unchangeable variables, like final variables).

public class Main {
    public static void main(String[] args) {
        System.out.println(Planets.Earth);
        System.out.println(Planets.Earth.ordinal());  // Accessing the default index
        System.out.println(Planets.Earth.getIndex()+"\n");  // Accessing assigned index

        for (Planets p : Planets.values()) {
            System.out.println(p.getIndex()+". "+p);
            System.out.println("Radius: "+p.getRadius()+" km");
            System.out.println("Area: "+p.getArea()+" km^2");
            System.out.println("Volume "+p.getVolume()+" km^3\n");
        }
    }
}

enum Planets{
    Mercury(1, 2439),
    Venus(2, 6051),
    Earth(3, 6371),
    Mars(4, 3389),
    Jupiter(5, 69911),
    Saturn(6, 58232),
    Uranus(7, 25362),
    Neptune(8, 24622),
    Pluto(9, 1188);

    private final int index;
    private final int radius;

    Planets(int index, int radius) {
        this.index = index;
        this.radius = radius;
    }

    public int getIndex(){
        return index;
    }
    public int getRadius(){
        return radius;
    }

    public double getArea(){
        return (4.0) * Math.PI * radius * radius;
    }
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
