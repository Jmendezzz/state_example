public abstract class State {
  protected Laptop laptop;
  public State(Laptop laptop) {
    this.laptop = laptop;
  }
  public abstract void powerButton();
}
