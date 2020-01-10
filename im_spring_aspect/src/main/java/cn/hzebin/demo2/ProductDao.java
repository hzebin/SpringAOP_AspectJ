package cn.hzebin.demo2;

public class ProductDao {
    public void add() {
        System.out.println("增加操作");
    }

    public String delete() {
        System.out.println("删除操作");
        return "Hello 给切面命名返回值";
    }

    public void update() {
        System.out.println("更新操作");
    }

    public void findOne() {
        System.out.println("查找一个操作");
    }

    public void findAll() {
        System.out.println("查找全部操作");
    }
}
