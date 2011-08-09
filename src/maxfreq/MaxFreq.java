package maxfreq;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {

  private int[] input;

  private Integer maxFrequentItem = null;

  private Map<Integer, Integer> frequencies =
    new HashMap<Integer, Integer>();


  public MaxFreq(int[] input) {
    this.input = input;
  }

  public void run() {
    if (0 == input.length) {
      return;
    }
   computeFrequencies();
   findMaxFrequency();
  }

  private void computeFrequencies() {
    for (int i : input) {
      increaseFrequency(i);
    }
  }

  private void increaseFrequency(int i) {
    if (frequencies.containsKey(i)) {
      int freq = frequencies.get(i);
      frequencies.put(i, freq+1);
    } else {
      frequencies.put(i, 1);
    } 
  }

  private int maxFrequency;
  private int actualFrequency;
  private int actualItem;

  private void findMaxFrequency() {
    maxFrequency = 0;
    maxFrequentItem = 0;
    for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
      actualFrequency = entry.getValue();
      actualItem = entry.getKey();
      if (betterFound()) {
        maxFrequency = actualFrequency;
        maxFrequentItem = actualItem;
      }
    }
  }

  private boolean betterFound() {
    return (actualFrequency > maxFrequency || 
          (actualFrequency == maxFrequency &&
           actualItem > maxFrequentItem));
  }

  public Integer getResult() {
    return maxFrequentItem;
  }
}
