import java.util.List;

public class TransportLayer extends PacketHandler {
  public void handle(List<String> request) {
    System.out.println("Transport Layer!");
    MessageParser.incoded_message += request.get(0);
    request.remove(0);
    if (this.next_handler != null) {
      this.next_handler.handle(request);
    }
  }

  public void handle_decode(String request) {
    System.out.println("Transport Layer!");

    MessageParser.decoded_message.add(0, request.split(",")[3]);

    if (this.next_handler != null) {
      this.next_handler.handle_decode(request);
    }
  }
}
