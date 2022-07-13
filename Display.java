public class Display {
    int time;
    int max;

    Display(int max) {
        this.max = max;
        this.time = 0;
    }

    public void timePass() {
        time++;
        if (time == max) {
            time = 0;
        }
    }

    public int getTime() {
        return time;
    }
}
