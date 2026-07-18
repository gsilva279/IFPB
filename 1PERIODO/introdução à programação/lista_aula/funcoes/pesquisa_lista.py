def search(list, value):
    for index, element in enumerate(list):
        if element == value:
            return index
    return
    
List = [8, 4, 3, 6]
print(search(List, 3))


#forma simplificada:
def search(list, value):
    return list.index(value)
    
List = [8, 4, 3, 6]
print(search(List, 6))  