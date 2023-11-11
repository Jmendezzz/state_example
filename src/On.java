public class On extends State{
  public On(Laptop laptop) {
    super(laptop);
  }

  @Override
  public void powerButton() {
    laptop.setState(new Off(laptop));
    System.out.println("Turning off...");
  }
}
