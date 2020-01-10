package cn.hzebin.demo2;

import org.aspectj.lang.annotation.*;

/**
 * 给切点命名，维护代码更加方便
 */
@Aspect
public class AspectAnno {
    @Before(value = "myPointCut1() || myPointCut2()")  //多个切点可以使用||进行连接
    public void demo1() {
        System.out.println("前置通知");
    }

    @AfterReturning(value = "myPointCut2()", returning = "result")
    public void demo2(Object result) {
        System.out.println("后置通知" + result);
    }


    //给切点命名
    @Pointcut(value = "execution(* cn.hzebin.demo2.ProductDao.add(..))")
    private void myPointCut1() {}

    @Pointcut(value = "execution(* cn.hzebin.demo2.ProductDao.delete(..))")
    private void myPointCut2() {}

    @Pointcut(value = "execution(* cn.hzebin.demo2.ProductDao.update(..))")
    private void myPointCut3() {}

    @Pointcut(value = "execution(* cn.hzebin.demo2.ProductDao.findOne(..))")
    private void myPointCut4() {}

    @Pointcut(value = "execution(* cn.hzebin.demo2.ProductDao.findAll(..))")
    private void myPointCut5() {}
}
