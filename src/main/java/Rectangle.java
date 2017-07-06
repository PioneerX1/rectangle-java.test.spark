public class Rectangle {
  private int mLength;
  private int mWidth;

  public Rectangle(int length, int width) {
    mLength = length;
    mWidth = width;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public boolean isSquare() {
    if (mLength == mWidth) {
    return true;
  } else { return false; }
  }

  public int area() {
    return mLength * mWidth;
  }

}
