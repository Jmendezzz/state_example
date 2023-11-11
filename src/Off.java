public class Off extends State {
  public Off(Laptop laptop) {
    super(laptop);
  }

  @Override
  public void powerButton() {
    laptop.setState(new On(laptop));
    System.out.println("Turning on...");
  }
}
