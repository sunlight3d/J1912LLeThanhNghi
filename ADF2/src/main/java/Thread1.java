public class Thread1 extends Thread{
    private SharedData sharedData;
    Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    @Override
    public void run() {
        super.run();
    }
}
