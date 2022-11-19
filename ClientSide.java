import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ClientSide {
  public void encoder() {
    List<String> packet = new ArrayList<>(Arrays.asList(
        "application",
        "presentation",
        "session",
        "transport",
        "network",
        "dataLink",
        "physical"));
    AppLayer app = new AppLayer();
    PresentaionLayer pre = new PresentaionLayer();
    SessionLayer ses = new SessionLayer();
    TransportLayer trans = new TransportLayer();
    NetworkLayer net = new NetworkLayer();
    DatalinkLayer data = new DatalinkLayer();
    PhysicalLayer physic = new PhysicalLayer();
    app.set_next(pre).set_next(ses).set_next(trans).set_next(net).set_next(data).set_next(physic);
    app.handle(packet);
    System.out.println("Encoded message is:" + MessageParser.incoded_message);
  }

  public void decoder() {
    String packet = "application,presentation,session,transport,network,dataLink,physical";

    AppLayer app = new AppLayer();
    PresentaionLayer pre = new PresentaionLayer();
    SessionLayer ses = new SessionLayer();
    TransportLayer trans = new TransportLayer();
    NetworkLayer net = new NetworkLayer();
    DatalinkLayer data = new DatalinkLayer();
    PhysicalLayer physic = new PhysicalLayer();

    physic.set_next(data).set_next(net).set_next(trans).set_next(ses).set_next(pre).set_next(app);

    physic.handle_decode(packet);
    System.out.println(MessageParser.decoded_message);
  }

}
