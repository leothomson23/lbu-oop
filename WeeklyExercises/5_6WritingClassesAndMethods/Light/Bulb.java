public class Bulb {
    private boolean isOn;

    public Bulb() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String getStatus() {
        if (isOn) {
            return "The bulb is on.";
        } else {
            return "The bulb is off.";
        }
    }

    public void controlBulb(int choice) {
        if (choice == 1) {
            turnOn();
        } else {
            turnOff();
        }
    }
}