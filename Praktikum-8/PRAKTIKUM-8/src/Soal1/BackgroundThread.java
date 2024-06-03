package Soal1;

public class BackgroundThread implements Runnable {
    @Override
    public void run() {
        int executionTime = TaskTimeHelper.getRandomNumber();
        try {
            Thread.sleep(executionTime * 1000);
            if (executionTime > 4) {
                System.out.println("Request Timeout");
                MainThread.incrementFailedLoad();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}