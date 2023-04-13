package lt.code.academy.repository;

import lt.code.academy.MarkDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewInternalMarkDao  implements MarkDao {
    @Override
    public List<Double> getMarks() {
        return List.of(2.0, 10.0, 3.9);
    }
}
