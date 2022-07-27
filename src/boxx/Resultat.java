package boxx;

public class Resultat {
    public static void main(String[] args) {
        BoxInterface defoltBox = new DefoltBox(3,3,3,60);
        BoxInterface cylinderBox = new CylinderBox(4,4,70);

        BoxInterface gitBoxDefolt = new HappyBox("Happy Birthday","Eva","Kate",defoltBox);
        BoxInterface gitboxCylinder = new HappyBox("Happy Birthday","Roma","Polina",cylinderBox);


        System.out.println(defoltBox.FindVolume());
        System.out.printf("%.2f %n",cylinderBox.FindVolume());
        System.out.println(gitboxCylinder.FindVolume());
        System.out.println(gitBoxDefolt.FindVolume());
        System.out.println("\n");
        System.out.println(defoltBox.getPrice());
        System.out.println(cylinderBox.getPrice());
        System.out.println(gitboxCylinder.getPrice());
        System.out.println(gitBoxDefolt.getPrice());












    }
}
