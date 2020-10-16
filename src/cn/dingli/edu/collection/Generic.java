package cn.dingli.edu.collection;

public class Generic {

    private Object[] arrayList;

    public Generic(int catacity) {
        this.arrayList = new Object[catacity];
    }

    public void setData(int index, Object object) {
        arrayList[index] = object;
    }

    public Object getData(int index) {
        return arrayList[index];
    }
}
