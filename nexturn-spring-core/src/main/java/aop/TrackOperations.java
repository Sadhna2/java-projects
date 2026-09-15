package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperations {
   @Pointcut("execution(* Operation.m*(..))")
   public void pointcutName() {}
   
   @Before ("pointcutName()")
   public void beforeMethod(JoinPoint jp) {
	   System.out.println("** berfore method **");
   }
   
   @After ("pointcutName()")
   public void afterMethod(JoinPoint jp) {
	   System.out.println("** after method **"+jp.getSignature());
   }
   
   
}
