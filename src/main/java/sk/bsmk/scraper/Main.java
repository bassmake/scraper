package sk.bsmk.scraper;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Scraper init");

        for (int i = waitTime(args); i >= 0; i--) {
            if (i == 0) {
                System.out.print("\rScraper finished");
            } else {
                System.out.printf("\rWill work for %d seconds", i);
                Thread.sleep(1_000);
            }
        }
    }

    private static int waitTime(String[] args) {
        if (args.length < 1) {
            return 3;
        }
        return Integer.parseInt(args[0]);
    }

}
