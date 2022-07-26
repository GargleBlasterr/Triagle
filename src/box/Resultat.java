package box;

public class Resultat {
    public static void main(String[] args) {
        Box parallelepipedOne = new Box(5, 10, 4);
        Box parallelepipedTwo = new Box(5, 6.6, 9.8);
        Box parallelepipedThree = new Box(7.7, 8.8, 9.9);
        System.out.println(parallelepipedOne.resultat());
        System.out.println(parallelepipedTwo.resultat());
        System.out.println(parallelepipedThree.resultat());
        System.out.printf("%.2f Volume of a parallelepiped One%n", parallelepipedOne.volumeOfaBox());
        System.out.printf("%.2f Volume of a parallelepiped One%n",parallelepipedTwo.volumeOfaBox());
        System.out.printf("%.2f Volume of a parallelepiped One%n",parallelepipedThree.volumeOfaBox());
        Cylinder cylinder = new Cylinder(6.5,5.5,Math.PI);
        System.out.println(cylinder.resultat());
        System.out.printf("%.2f Volume of a parallelepiped One%n",cylinder.volumeOfaBox());
    }
}
