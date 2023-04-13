package lt.code.academy.repository;

import lt.code.academy.MarkDao;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository // 1 dalis: taip pasakom kad tai springo skoupo dalis
public class InternalMarkDao implements MarkDao {
    @Override
    public List<Double> getMarks() {
        return List.of(9.0, 8.5, 5.0, 5.9, 7.0, 9.9);
    }
}
