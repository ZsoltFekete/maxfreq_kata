package maxfreq;

public class MaxFreq {

  private int[] input;

  private Integer result = null;

  public MaxFreq(int[] input) {
    this.input = input;
  }

  public void run() {
    if (0 == input.length) {
      return;
    }
  }

  public Integer getResult() {
    return result;
  }
}
