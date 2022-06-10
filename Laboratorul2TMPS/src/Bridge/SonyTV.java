package Bridge;

public class SonyTV implements ITV{
    @Override
    public void on() {
        System.out.println("Sony este pornit.");
    }

    @Override
    public void off() {
        System.out.println("Sony este oprit");
    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("Sony: canalul - " + channel);
    }
}
