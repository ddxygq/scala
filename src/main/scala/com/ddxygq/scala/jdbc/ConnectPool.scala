package com.ddxygq.scala.jdbc

import java.sql.{Connection, DriverManager}
import java.util.LinkedList

/**
  * Created by 26015 on 2018/5/6.
  */
object ConnectPool {
  private val url = "jdbc:mysql://localhost:3306/sakila?characterEncoding=UTF-8"
  private val username = "root"
  private val password = "www123456"
  private var current_num = 0
  // 当前连接池已产生连接数
  private val max_connection = 8 // 连接池总数
  private val connection_num = 10 // 产生连接数
  val pools = new LinkedList[Connection]() // 连接池
  val driver = "com.mysql.jdbc.Driver"

  /**
    * 加载驱动
    */
  private def before(): Unit ={
    if(current_num > max_connection && pools.isEmpty){
      Thread.sleep(2000)
      before()
    }else{
      Class.forName(driver)
    }
  }

  /**
    * 获得连接
    * @return
    */
  private def initConn():Connection = {
    val conn = DriverManager.getConnection(url,username,password)
    conn
  }

  /**
    * 初始化连接池
    * @return
    */
  private def initConnectPool():LinkedList[Connection] = {
    AnyRef.synchronized({
      if(pools.isEmpty()){
        before()
        for(i <- 1 to connection_num){
          pools.push(initConn())
          current_num = current_num + 1
        }
      }
      pools
    })
  }

  /**
    * 获得连接
    */
  def getConn():Connection = {
    initConnectPool()
    pools.poll()
  }

  /**
    * 释放连接
    */
  def releaseCon(con:Connection): Unit ={
    pools.push(con)
  }
}
