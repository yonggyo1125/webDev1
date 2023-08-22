package exam02.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution( * exam02.aopex..*(..))")
    public void publicTarget() {}

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime(); // 추가 공통 기능
        try {
            Object result = joinPoint.proceed(); // 핵심 기능 수행 : factorial(..)

            return result;
        } finally {
            long etime = System.nanoTime(); // 추가 공통 기능
            System.out.printf("걸린시간 : %d%n", etime - stime);
        }
    }
}
