var a = false && expensiveFunction("1")
var b = true && expensiveFunction("2")
var c = false || expensiveFunction("3")
var d = true || expensiveFunction("4")

function expensiveFunction(id)
{
   print("expensiveFunction() called with " + id)
}