package Praktikum8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    static ArrayList<Result> raceStanding = new ArrayList<>();

    private String[] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
    };

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    public void setNewWordsToType(){
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    public static void addResult(Result result){
        raceStanding.add(result);
    }

    private void printRaceStanding(){
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("===========================");

        for (int i = 0; i < raceStanding.size(); i++) {
            Result result = raceStanding.get(i);
            System.out.printf("%d. %s = %.2f detik\n", i + 1, result.getName(), result.getFinishTime() / 1000.0);
        }
    }

    void startRace(){
        for (Typer typer : raceContestant) {
            Thread thread = new Thread(typer);
            thread.start();
        }

        while (raceStanding.size() < raceContestant.size()) {
            try {
                Thread.sleep(2000);

                System.out.println("\nTyping progress...");
                System.out.println("===========================");
                for (Typer typer : raceContestant) {
                    System.out.printf("%s = %s\n", typer.getBotName(), typer.getWordsType());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        raceStanding.sort((r2, r1) -> Double.compare(r2.getFinishTime(), r1.getFinishTime()));
        printRaceStanding();
    }
}

class Typer extends Thread {
    String botName;
    String wordsTyped;
    double wpm;
    TypeRacer typeRacer;

    public Typer(String botName, int wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsType() {
        return wordsTyped;
    }

    public void addWordsTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        for (String word : wordsToType) {
            try {
                long timePerWord = (long) (60000.0 / wpm);
                Thread.sleep(timePerWord);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addWordsTyped(word);
        }

        double totalWordsTyped = wordsTyped.split(" ").length;
        double totalTime = totalWordsTyped / wpm * 60000;
        this.addWordsTyped("(selesai)");
        TypeRacer.addResult(new Result(botName, totalTime));
    }
}

class Result {
    String name;
    double finishTime;

    public Result(String botName, double d) {
        this.name = botName;
        this.finishTime = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(double finishTime) {
        this.finishTime = finishTime;
    }
}

public class TP8_2_H071231023 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Dino", 60, typeRacer);
        typers[1] = new Typer("Kasino", 120, typeRacer);
        typers[2] = new Typer("Indro", 80, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
