
public class Driver {

  public static void main(String[] args) {
    ClientSide cl = new ClientSide();
    cl.encoder();
    System.out.println();
    System.out.println("#########################################");
    System.out.println();
    cl.decoder();
  }
}