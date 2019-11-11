function sort(a, cmp)
{
   for (var pass = 0; pass < a.length - 1; pass++)
      for (var i = a.length - 1; i > pass; i--)
         if (cmp(a[i], a[pass]) < 0)
         {
            var temp = a[i]
            a[i] = a[pass]
            a[pass] = temp
         }
}

var a = [22, 91, 3, 45, 64, 67, -1]
sort(a, function(i, j)
        {
           return i - j;
        })
a.forEach(function(entry) { print(entry) })
print('\n')
sort(a, function(i, j)
        {
           return j - i;
        })
a.forEach(function(entry) { print(entry) })
print('\n')
a = ["X", "E", "Q", "A", "P"]
sort(a, function(i, j)
        {
           return i < j ? -1 : i > j;
        })
a.forEach(function(entry) { print(entry) })
print('\n')
sort(a, function(i, j)
        {
           return i > j ? -1 : i < j;
        })
a.forEach(function(entry) { print(entry) })