//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var url1 = new Url("https://google.com");

        var host = url1.getHost();
        var protocol = url1.getProtocol();

        System.out.println(protocol + "://" + host);
    }
}