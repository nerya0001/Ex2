package logicControl;

public class Node implements api.NodeData {

    private int id;
    private api.GeoLocation pos;
    private double weight;
    private int tag;
    private int lowLink;
    private int revealTime;//for dfs algorithm
    private boolean onStack;

    public Node(int id, api.GeoLocation pos) {
        this.id = id;
        this.pos = pos;
        this.revealTime = -1;
    }
    public Node(Node n){
        this.id = n.id;
        this.pos = n.pos;
        this.tag = n.tag;
        this.weight = n.weight;
    }

    @Override
    public int getKey() {
        return this.id;
    }

    @Override
    public api.GeoLocation getPos() {
        return this.pos;
    }

    @Override
    public void setPos(api.GeoLocation p) {
        this.pos = new GeoLocation(p.x(), p.y(), p.z());
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(double w) {
        this.weight = w;
    }

    @Override
    public String getInfo() {
        return null; ////// complete
    }

    @Override
    public void setInfo(String s) {
        ////// complete
    }

    @Override
    public int getTag() {
        return this.tag;
    }

    @Override
    public void setTag(int t) {
        this.tag = t;
    }

    public void setLowLink(int lowLink) {
        this.lowLink = lowLink;
    }

    public void setRevealTime(int index) {
        this.revealTime = index;
    }

    public int getLowLink() {
        return lowLink;
    }

    public int getRevealTime() {
        return revealTime;
    }

    public void setOnStack(boolean onStack) {
        this.onStack = onStack;
    }

    public boolean isOnStack() {
        return onStack;
    }

    @Override
    public String toString() {
        return "{\n" +
                "\"pos\": " + pos + ",\n" +
                "\"id\": " + id + "\n" +
                "}";
    }
}
