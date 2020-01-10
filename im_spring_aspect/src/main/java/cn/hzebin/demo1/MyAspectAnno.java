package cn.hzebin.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * AspectJ定义切面类，注解方式
 */
@Aspect  //定义切面类
public class MyAspectAnno {

    //前置通知
//    @Before(value = "execution(* cn.hzebin.demo1.ProductDao.*(..))")
    @Before(value = "execution(* cn.hzebin.demo1.ProductDao.add(..))")
    public void before(JoinPoint joinPoint) {
        //JoinPoint为获得切入点信息
        System.out.println("==前置通知==,可以获得切入点信息" + joinPoint);
    }

    //后置通知
    @AfterReturning(value = "execution(* cn.hzebin.demo1.ProductDao.update(..))", returning = "result")
    public void demo2(Object result) {
        System.out.println("==后置通知==，可以获得切入点的返回值  ->  " + result);
    }

    //环绕通知
    @Around(value = "execution(* cn.hzebin.demo1.ProductDao.delete(..))")
    public Object demo3(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前的通知");
        Object obj = joinPoint.proceed();  //执行目标方法，会有目标方法的返回值
        System.out.println("环绕后的通知");
        return obj;
    }

    //异常通知
    @AfterThrowing(value = "execution(* cn.hzebin.demo1.ProductDao.find(..))", throwing = "e")
    public void demo4(Throwable e) {
        System.out.println("异常通知，" + e.getMessage());
    }

    //最终通知
    @After(value = "execution(* cn.hzebin.demo1.ProductDao.findOne(..))")
    public void demo5() {
        System.out.println("最终通知");
    }
}
