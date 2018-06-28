import java.sql.Connection
import com.ddxygq.scala.jdbc.ConnectPool

/**
  * Created by 26015 on 2018/5/6.
  */
object JDBCTest {
  def main(args: Array[String]): Unit = {
    val conn = ConnectPool.getConn()
    val sql = "insert into actor value(?,?,?,?)"
    val params = Array("201","广","柯","2018-02-15 04:34:33")
    val sql2 = "select * from actor"
    insert(conn,sql,params)
    query(conn,sql2)
    ConnectPool.releaseCon(conn)
  }

  def query(conn:Connection,sql:String): Unit ={
    val ps = conn.prepareStatement(sql)
    val result = ps.executeQuery()

    while (result.next()){
      val name = result.getString("first_name")
      println("name = " + name)
    }

  }

  def insert(conn:Connection,sql:String,params:Array[String]): Unit ={
    val ps = conn.prepareStatement(sql)
    ps.setObject(1,params(0))
    ps.setObject(2,params(1))
    ps.setObject(3,params(2))
    ps.setObject(4,params(3))
    ps.execute()
  }


}
