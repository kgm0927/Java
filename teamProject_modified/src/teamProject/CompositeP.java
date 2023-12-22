package teamProject;
import java.util.ArrayList;
import java.util.List;

public class CompositeP extends P {
    private List<P> children = new ArrayList<>();

    public void add(P p) {
        children.add(p);
    }

    @Override
    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (P child : children) {
            if (child.getMax() > max) {
                max = child.getMax();
            }
        }
        return max;
    }

    @Override
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (P child : children) {
            if (child.getMin() < min) {
                min = child.getMin();
            }
        }
        return min;
    }
}