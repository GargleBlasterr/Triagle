package boxx;

public class Resultat {
    public static void main(String[] args) {

        BoxInterface defoltBox = new DefoltBox(3, 3, 3, 100);
        BoxInterface cylinderBox = new CylinderBox(4, 4, 125);


        BoxInterface gitBoxDefolt = new HappyBox("Happy Birthday", "Eva", "Kate", defoltBox);
        BoxInterface gitboxCylinder = new HappyBox("Happy Birthday", "Roma", "Polina", cylinderBox);


        System.out.println(defoltBox.findVolume());
        System.out.printf("%.2f %n", cylinderBox.findVolume());
        System.out.println(gitboxCylinder.findVolume());
        System.out.println(gitBoxDefolt.findVolume());
        System.out.println("\n");
        System.out.println(defoltBox.getPrice());
        System.out.println(gitBoxDefolt.getPrice());
        System.out.println(((HappyBox) gitboxCylinder).getPrices());
        System.out.println(cylinderBox.getPrice());


    }
}
