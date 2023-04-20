public class Main {
    public static void main(String[] args) {
        boolean useManyThreads = false;

        System.out.println("Let's launch some Launchables!");
        Rocket samJRocket = new Rocket("Sam Jenkins's Rocket", 9);
        Boat samGBoat = new Boat("Sam Gombiner's Boat", 5);

        if (useManyThreads) {
            Thread rocketLaunchingThread = new Thread(samJRocket);
            Thread boatLaunchingThread = new Thread(samGBoat);
            boatLaunchingThread.start();
            rocketLaunchingThread.start();
        } else {
            samJRocket.launch();
            samGBoat.launch();
        }

        System.out.println("Main thread is DONE!");
    }
}