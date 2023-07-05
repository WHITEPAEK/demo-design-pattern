package proxy.printer;

public class Printer implements Printable {

    private String name;

    public Printer() {
        heavyJob("Create Printer Instance");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Create Printer Instance -> " + this.name);
    }

    private void heavyJob(String message) {
        System.out.println(message);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(".");
        }
        System.out.println("Completed..");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println(this.name + "-> " + str);
    }
}
