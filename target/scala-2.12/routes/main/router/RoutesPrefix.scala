
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/gleno/Documents/College Work/Year 2/Semester 2/Software Development 4/SoftwarePlayFrameworkLab5/conf/routes
// @DATE:Wed Mar 14 01:54:52 GMT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
