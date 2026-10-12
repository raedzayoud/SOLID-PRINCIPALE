public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;     // forces both sides equal
    }

    @Override
    public void setHeight(int height) {
        this.width = height;     // forces both sides equal
        this.height = height;
    }
}
