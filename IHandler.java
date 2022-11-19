import java.util.List;

public interface IHandler {
  public IHandler set_next(IHandler handler);

  public void handle(String request);

  public void handle(List<String> request);

  public void handle_decode(String request);
}
