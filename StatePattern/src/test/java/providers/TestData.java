package providers;

import java.util.List;

public class TestData {
    private List<TestEnum> list;
    private List<String> order;

    public TestData(List<TestEnum> list, List<String> order) {
        this.list = list;
        this.order = order;
    }

    public List<TestEnum> getList() {
        return list;
    }

    public List<String> getOrder() {
        return order;
    }
}
