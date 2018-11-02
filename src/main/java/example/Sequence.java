package example;

public class Sequence {
    private int v;

    public int getV() {
        //增加cpu处理时间
        int i = 0;
        i = i * 10000;
        i = i + 3000;
        v = v + 1;
        int t = v / i;
        return v;
//        return v++;
    }

    public void setV(int v) {
        this.v = v;
    }
}
