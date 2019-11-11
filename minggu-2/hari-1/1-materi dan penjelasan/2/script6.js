function add(x)
{
   function partialAdd(y)
   {
      return y + x
   }
   return partialAdd
}

var add10 = add(10)
var add20 = add(20)

print(add10(5))
print(add20(5))