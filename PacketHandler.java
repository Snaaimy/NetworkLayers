import java.util.List;

public class PacketHandler implements IHandler {
  protected IHandler next_handler;
  String message = "";
  String request_type;

  public IHandler set_next(IHandler handler) {
    this.next_handler = handler;
    return handler;
  }

  public void handle(String request) {
    // to be implemented
  }

  public void handle(List<String> request) {
    // to be implemented
  }

  public void handle_decode(String request) {
    // to be implemented
  }
}
