import org.eclipse.jetty.server.Server;

/**
 * Created by Anatoly Gostev on 13.12.2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        Server server = new Server(8080);
        server.setHandler(new PageGenerator());
        server.start();
        server.join();
    }
}
