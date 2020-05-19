public class Computer {
    private Keyboard kb;
    private  Mouse ms;
    private  Monitor mon;

    public Keyboard getKeyboard() {
        return kb;
    }

    public Mouse getMouse() {
        return ms;
    }

    public Monitor getMonitor() {
        return mon;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
            this.kb = keyboard;
            this.ms = mouse;
            this.mon = monitor;
    }
}
