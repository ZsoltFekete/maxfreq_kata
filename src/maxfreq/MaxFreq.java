package maxfreq;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

  private int[] input;

  private Integer result = null;

  private Map<Integer, Integer> frequencies =
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
