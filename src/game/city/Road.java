package game.city;

public class Road implements Travelable {

  private int length;
  private boolean blocked;

  public Road(int length) {
    if (length < 0) {
      throw new IllegalArgumentException();
    }

    this.length = length;
    this.blocked = false;
  }

  @Override
  public int getWeight() {
    return blocked ? Integer.MAX_VALUE : length;
  }
}
