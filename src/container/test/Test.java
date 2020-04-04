package container.test;

/**
 * 性能测试框架，测试对象
 * @author yuanshuchang
 * @since 2020/4/2
 */
public abstract class Test<C> {
    String name;
    public Test(String name) {
        this.name = name;
    }
    protected abstract int test(C container, TestParam tp);
}
