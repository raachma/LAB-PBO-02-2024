package Soal1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class MainThread {
    private static int failedLoads = 0;

    public static void incrementFailedLoad() {
        failedLoads++;
    }

    public static void main(String[] args) {
        int numSources = 4;
        var uithread = new Uithread();
        uithread.startLoading(numSources);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit background threads for data loading
        for (int i = 0; i < numSources; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                Uithread.updateLoading(totalTime);
            }
            Uithread.taskFinish(totalTime, numSources - failedLoads, failedLoads);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}