package cn.hzebin.demo1;

public class ProductDao {
    public void add() {
        System.out.println("增加操作");
    }

    public String update() {
        System.out.println("修改操作");
        return "Hello, 这是后置通知返回值";
    }

    public void find() {
        System.out.println("查询操作");
        //int a = 1 / 0;  //制造异常
    }

    public void delete() {
        System.out.println("删除操作");
    }

    public void findOne() {
        System.out.println("查询一个操作");
    }
}
