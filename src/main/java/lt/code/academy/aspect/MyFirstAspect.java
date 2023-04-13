package lt.code.academy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstAspect {

    //@Around sitas aspecktas kviescias pries metoda ir po jo
    //@Before pries metodo kvietima
    //@After po metodo kvietimo
    //@AfterReturning isisterpti kai rezuktatas nebuvo dar grazintas is kur kviete

    @Around("execution(* lt.code.academy.GradeService.getMarkAverage())")
    public Double changeMarkAverage(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Iskviestas pries getMarkAverage");

        Object value = joinPoint.proceed();

        if (value instanceof Double average) {
            System.out.println("Nepakeistas rezultatas" + average);
            return average + 25;
        }
return 0.0;
    }

}
