def list = [1, 2, 3, 4, 5]

list.eachWithIndex { item, index ->
    list[index] = item * 2
}

println list