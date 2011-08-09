package maxfreq;

public class MaxFreq {

  private int[] input;

  private Integer result = null;

  private HashMap<Integer, Integer> frequencies =
    new HashMap<Integer, Integer>();


  public MaxFreq(int[] input) {
    this.input = input;
  }

  public void run() {
    if (0 == input.length) {
      return;
    }
    for (int i : input) {
    
    }
  }

  public Integer getResult() {
    return result;
  }
}
