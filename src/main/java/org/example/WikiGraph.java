package org.example;

import it.unimi.dsi.webgraph.ImmutableGraph;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class WikiGraph {
    /** The number of nodes, read at creation time and cached. */
    final private ImmutableGraph graph;
    final private Map<Long, String> names;
    final private long numNodes;

    public WikiGraph(String filesPath) throws IOException {
        // Load the graph from the file
        graph = ImmutableGraph.load(filesPath);

        names = new HashMap<>();
        AtomicLong counter = new AtomicLong(0);
        try (Stream<String> lines = java.nio.file.Files.lines(Paths.get(System.getProperty("user.dir"), filesPath + ".ids"))) {
            lines.forEach(line -> names.put(counter.getAndIncrement(), line));
        }

        numNodes = counter.get();
    }

    public ImmutableGraph getGraph() {
        return graph;
    }

    public String getName(long id) {
        return names.get(id);
    }

    public long getNumNodes() {
        return numNodes;
    }

    public long getNumArcs() {
        return graph.numArcs();
    }
}
