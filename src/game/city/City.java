package game.city;

import graph.Graph;

public class City {

  private Graph<Building, Road> graph;












  public Graph<Building, Road> getGraph() {
    return graph.unmodifiableGraph();
  }

}
