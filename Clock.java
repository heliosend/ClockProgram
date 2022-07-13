public class Clock {
    Display hour = new Display(24);
    Display minute = new Display(60);
    specialDisplay second = new specialDisplay(60);

    public void start() {
        while (true) {
            second.timePass();
            if (second.getTime() == 0) {
                minute.timePass();
                if (minute.getTime() == 0) {
                    hour.timePass();
                }
            }
            System.out.printf("%2d:%2d:%2d\n", hour.getTime(), minute.getTime(), second.getTime());
        }
    }

}
