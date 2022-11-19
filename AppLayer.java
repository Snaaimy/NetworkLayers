import java.util.List;

public class AppLayer extends PacketHandler {

  public void handle(List<String> request) {
    System.out.println("App Layer!");
    MessageParser.incoded_message += request.get(0);
    request.remove(0);
    if (this.next_handler != null) {
      this.next_handler.handle(request);
    }
  }

  public void handle_decode(String request) {
    System.out.println("App Layer!");

    MessageParser.decoded_message.add(0, request.split(",")[0]);

    if (this.next_handler != null) {
      this.next_handler.handle_decode(request);
    }
  }
}