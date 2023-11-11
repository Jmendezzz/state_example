public class Laptop {
  private State state;
  public Laptop() {
    state = new Off(this);
  }
  public void powerButton(){
    state.powerButton();
  }
  public void setState(State state) {
    this.state = state;
  }
}
