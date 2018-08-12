package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-11.
  */
class VisitDemo {
  // private 修饰
  class Inner{
    private def f(){println("f")}

    class InnerMost{
      f()
    }
  }
  // 下面不能访问
  // (new Inner).f()

  // protected 受保护的
  class Super{
    protected def f(){println("f")}
  }

  class Sub extends Super{
    f()
  }

  class Other{
    // protected修饰的方法只能在子类访问
    // (new Super).f()
  }

  // public
  class Outter{
    class Inner{
      def f2(){println("f")}

      class InnerMost{
        f2() //
      }
    }

    (new Inner).f2()
  }
}
