package game.city;

import graph.Graph;

public class City {

  private Graph<Location, Road> graph;

  public Graph<Location, Road> getGraph() {
    return graph.unmodifiableGraph();
  }

}
