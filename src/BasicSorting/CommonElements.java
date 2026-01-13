package BasicSorting;
import java.util.ArrayList;
import java.util.Arrays;
public class CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 4, 6};

        ArrayList<Integer> result = commonElements(a, b);
        System.out.println(result);
    }

    public static ArrayList<Integer> commonElements(int a[], int b[]) {

    int i = 0, j = 0;
    Arrays.sort(a);
    Arrays.sort(b);

    ArrayList<Integer> ans = new ArrayList<>();

    while (i < a.length && j < b.length) {

        if (a[i] == b[j]) {

            // avoid duplicates
            if (ans.size() == 0 || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
            j++;

        } else if (a[i] < b[j]) {
            i++;
        } else {
            j++;
        }
    }
        return ans;
    }
}