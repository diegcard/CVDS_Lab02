package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Hexagon implements Shape {
    private final int EDGES = 12;
    @Override
    public int getNumberOfEdges() {
        return EDGES;
    }
}
