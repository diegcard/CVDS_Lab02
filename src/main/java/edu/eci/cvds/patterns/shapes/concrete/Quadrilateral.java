package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Quadrilateral implements Shape {
    private final int EDGES = 4;
    @Override
    public int getNumberOfEdges() {
        return EDGES;
    }
}
