package game.city;

import graph.Algorithm;
import graph.Graph;
import io.TextIO;
import org.json.JSONString;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class City implements JSONString {

  private Graph<Location, Travelable> graph;
  private static final String LOCATION_KEY = "locations";
  private static final String TRAVELABLE_KEY = "travelables";


  public static City readFromFile(String filename) throws IOException {
    String[] arr = TextIO.read(new File(filename));
    City c = new City();

    return c;
  }

  private City() {
    graph = new Graph<Location, Travelable>();
  }

  public City(Graph<Location, Travelable> g) {
    graph = new Graph<Location, Travelable>(g);
  }

  public Graph<Location, Travelable> getGraph() {
    return graph.unmodifiableGraph();
  }

  public List<Location> shortestPath(Location from, Location to) {
    return Algorithm.shortestPath(graph, from, to);
  }

  @Override
  public String toJSONString() {
    String s = "{";


    return s;
  }
}
