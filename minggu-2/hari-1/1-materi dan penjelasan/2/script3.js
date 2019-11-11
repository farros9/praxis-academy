function multiply(x, y)
{
   return x * y
}

function curried_multiply(x)
{
   return function(y)
   {
      return x * y
   }
}

print(multiply(6, 7))
print(curried_multiply(6)(7))
var mul_by_4 = curried_multiply(4)
print(mul_by_4(2))