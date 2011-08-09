package maxfreq;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MaxFreqTest extends TestCase {

  @Override
  protected void setUp() {
  }

  @Override
  protected void tearDown() {
  }

  public void testEmpty() {
    Integer i = 5;
    assertNotNull(i);
    int j = 5;
    assertTrue(i == j);
    try {
      i = null;
      i.toString();
      fail("Allows nullpointer");
    } catch (NullPointerException e) {}
  }

  public void testConstructor() {
    int[] input = new int[] {};
    MaxFreq maxFreq = new MaxFreq(input);
  }

  public void testEmptyInput() {
    int[] input = new int[] {};
    MaxFreq maxFreq = new MaxFreq(input);
    maxFreq.run();
    Integer result = maxFreq.getResult();
    assertNull(result);
  }

  public void testOneElementInput() {
    int[] input = new int[] {42};
    MaxFreq maxFreq = new MaxFreq(input);
    maxFreq.run();
    Integer result = maxFreq.getResult();
    assertNotNull(result);
    assertTrue(42 == result);
  }

  

  public static Test suite() {
    return new TestSuite(MaxFreqTest.class);
  }

  public static void main (String[] args) {
    junit.textui.TestRunner.run (suite());
  }

}
