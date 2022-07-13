public class specialDisplay extends Display {
    public specialDisplay(int max) {
        super(max);
    }

    @Override
    public void timePass() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        super.timePass();
    }
}
