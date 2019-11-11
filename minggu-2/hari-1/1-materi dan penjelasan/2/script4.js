var numbers = [22, 30, 43]
print(numbers.reduce(function(acc, curval) { return acc + curval })
      / numbers.length)