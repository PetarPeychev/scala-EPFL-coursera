import recfun.RecFun.*

pascal(1, 1)

balance(("(if (zero? x) max (/ 1 x))").toList)

balance(("I told him (that it's not (yet) done). (But he wasn't listening)").toList)

balance(("())(").toList)

balance((":-)").toList)

countChange(6, List(3,2,1))