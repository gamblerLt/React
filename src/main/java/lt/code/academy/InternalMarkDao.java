package lt.code.academy;

import java.util.List;

public class InternalMarkDao implements MarkDao{
    @Override
    public List<Double> getMarks() {
        return List.of(9.0, 8.5, 5.0, 5.9, 7.0, 9.9);
    }
}
