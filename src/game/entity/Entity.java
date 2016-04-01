package game.entity;

import common.IDObject;
import common.types.Either;
import game.city.Location;
import game.city.Road;

public abstract class Entity extends IDObject {

  private int health;
  private Either<Location, Road> currentLocation;

  private Action action;

  public void setAction(Action a) {
    action = a;
  }

  public Action getAction() {
    return action;
  }

}
