# java-hash-graph
This is a simple Graph implementation made in Java using Hash Maps and Sets. 

Example:
```java
Graph<String> graph = new HashGraph<>();

graph.addVertex("Olivia", "John", "Diana");
graph.addVertex("John", "Phillip");
graph.addVertex("Annika", "Olivia");

Set<String> depthFirstTraversal = graph.depthFirstTraversal("Olivia");
Set<String> breadthFirstTraversal = graph.breadthFirstTraversal("Olivia");
```