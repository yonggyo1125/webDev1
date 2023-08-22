package exam02.aopex;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcut {
    @Pointcut("execution(* exam02.aopex..*(..))")
    public void publicTarget() {}
}
