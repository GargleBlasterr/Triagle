package box;

public class BoxMix {
    private String HappyBox;

    public BoxMix(String HappyBox) {
        this.HappyBox = HappyBox;
    }

    public String getHappyBox() {
        return HappyBox;
    }

    public void setHappyBox(String happyBox) {
        HappyBox = happyBox;
    }

    public static void postcard() {
        System.out.println("Happy birthday, Vasi from Peti");
    }

    public static void main(String[] args) {
        BoxMix happyBox = new BoxMix("Happy Box");
        System.out.println(happyBox.HappyBox+" - Open me");
        postcard();
    }
}

