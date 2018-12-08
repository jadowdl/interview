import java.util.Arrays;

public class SortDemo {
  public static void main(String argv[]) {
    // String args to int
    int data[] = new int[argv.length];
    for(int i = 0; i < argv.length; i++) {
      data[i] = Integer.parseInt(argv[i]);
    }

    // Sort
    Arrays.sort(data);

    // Print the result
    for(int i = 0; i < argv.length; i++) {
      System.out.println(data[i]);
    }
  } 
}
