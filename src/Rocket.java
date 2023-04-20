public class Rocket implements Launchable, Runnable {
    String name;
    int secondsUntilLaunch;

    public Rocket(String name, int secondsUntilLaunch) {
        this.name = name;
        this.secondsUntilLaunch = secondsUntilLaunch;
    }

    @Override
    public void launch()  {
        System.out.println(name + " will TAKE OFF in " + secondsUntilLaunch + " seconds");
        for (int i = secondsUntilLaunch; i > 0; i -= 1) {
            System.out.println(name + " countdown: " + i + " seconds.");
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception ex) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " has LAUNCHED.");
    }


    @Override
    public void run() {
        launch();
    }
}
