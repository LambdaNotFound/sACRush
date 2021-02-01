package algo

class Graph[T] {
  type Vertex = T
  type GraphMap = Map[Vertex, List[Vertex]]
  var g:GraphMap = Map()

  def BFS(start: Vertex): List[List[Vertex]] = {
    def _BFS(elems: List[Vertex],visited: List[List[Vertex]]): List[List[Vertex]] = {
      val newNeighbors = elems.flatMap(g(_)).filterNot(visited.flatten.contains).distinct
      if (newNeighbors.isEmpty)
        visited
      else
        _BFS(newNeighbors, newNeighbors :: visited)
    }
    _BFS(List(start),List(List(start))).reverse
  }

  def DFS(start: Vertex): List[Vertex] = {
    def _DFS(v: Vertex, visited: List[Vertex]): List[Vertex] = {
      if (visited.contains(v))
        visited
      else {
        val neighbours:List[Vertex] = g(v) filterNot visited.contains
        neighbours.foldLeft(v :: visited)((b,a) => _DFS(a,b))
      }
    }
    _DFS(start,List()).reverse
  }
}