/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiralabra.graph.utils;

import java.util.ArrayList;
import java.util.List;
import tiralabra.graph.Node;

/**
 *
 * @author mikkomo
 */
public abstract class Result {

    private long runningTimeMs;
    private int shortestPathLength;
    private Node startNode;
    private String algorithm;
    private List<Result> subResults;


    public void start() {
        this.runningTimeMs = System.currentTimeMillis();
    }

    public void end() {
        this.runningTimeMs = (System.currentTimeMillis() - this.runningTimeMs);
    }

    @Override
    public abstract String toString();

    public void addSubResult(Result result) {
        if (this.subResults == null) {
            this.subResults = new ArrayList();
        }
        this.subResults.add(result);
    }

    public int getShortestPathLength() {
        return shortestPathLength;
    }

    public Node getStartNode() {
        return startNode;
    }

    public Result(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setShortestPathLength(int shortestPathLength) {
        this.shortestPathLength = shortestPathLength;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public long getRunningTimeMs() {
        return runningTimeMs;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public List<Result> getSubResults() {
        return subResults;
    }

    
    
}
