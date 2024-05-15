package TP8_1_H071231027;

public class BackgroundThread implements Runnable {
    @Override
    public void run() {
        int executionTime = TaskTimeHelper.getRandomTime();
        try {
            Thread.sleep(executionTime * 1000);
            if (executionTime > 4) {
                System.out.println("Request Timeout");
                Main.incrementFailedLoad();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
