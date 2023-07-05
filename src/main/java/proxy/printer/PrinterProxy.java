package proxy.printer;

public class PrinterProxy implements Printable {

    private String name;
    private Printer printer;

    public PrinterProxy(String name) {
        this.name = name;
    }

    private synchronized void realize() {
        if (printer == null) {
            printer = new Printer(name);
        }
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (printer != null) {
            printer.setPrinterName(name);
        }
        this.name = name;
        System.out.println("Proxy Set " + this.name);
    }

    @Override
    public String getPrinterName() {
        System.out.println("Proxy Get " + name);
        return name;
    }

    @Override
    public void print(String str) {
        realize();
        printer.print(str);
    }
}
