import java.time.Clock;

public class Timer {
  private ClockHand hund;
  private ClockHand seconds;

  public Timer() {
    this.hund = new ClockHand(60);
    this.seconds = new ClockHand(100);
  }

  public void advance() {
    this.seconds.advance();

    if (this.seconds.value() == 0) {
      this.hund.advance();
    }
  }
  public String toString() {
    return this.hund + ":" + this.seconds;
  }
}
