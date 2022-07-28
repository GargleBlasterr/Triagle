package boxx;

public class HappyBox implements BoxInterface {
    private String text;
    private String from;
    private String to;

    public HappyBox(String text, String from, String to, BoxInterface defoltBox) {
        this.text = text;
        this.from = from;
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public double findVolume() {
        return 8;
    }

    @Override
    public double getPrice() {
        return 125;
    }
    public double getPrices(){
        return 150;
    }


}
