package lt.code.academy;

public class GradeService {
    private final MarkDao markDao;

    public GradeService() {
        markDao = new  InternalMarkDao();
    }
    public  Double getMarAverage() {
        return  markDao.getMarks()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }
}
