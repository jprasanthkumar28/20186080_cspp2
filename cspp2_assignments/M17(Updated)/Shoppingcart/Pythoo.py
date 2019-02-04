global catalog
catalog = {}
global cart
cart = {}
def addCatalog(info):
    data = info.split(",")
    # print(data[0])
    if data[0] not in catalog:
        catalog[data[0]] = {data[1] : int(data[2])}

def displayCatalog():
    # print(catalog)
    for key,val in catalog.items():
        for k,v in val.items():
            print(key, k , float(v))

def addCart(info):
    data = info.split(",")
    # print(data)
    if data[0] not in cart:
        # cart = update({data[0] : data[1]})
        cart[data[0]] = int(data[1])
    else:
        cart[data[0]] += int(data[1])


def displayCart():
    for key,val in cart.items():
        print(key, val)

def totalAmount():
    # print()
    global amount
    amount = 0.0
    # quant = 
    for key,val in catalog.items():
        # print(key, "keyyyyyyyyy")
        for k,v in val.items():
            # print(k,type(v),"vallllllll")
            for k1,v1 in cart.items():
                # print(k1, v1, "cartttttttt")
                if k1 == key:
                    # print(v1)
                    # print(v)
                    amount += v1 * v
    print("totalAmount:", amount)

def payableAmount():
    global res
    global tax
    tax = 15 * amount/100
    res = tax + amount
    print("Payable amount: ",res)
    # print("Tax:",tax)

def remove(info):
    data = info.split(",")
#     # print(data)
    for key,val in cart.items():
        # print(key, "------" ,val)
        if key == data[0]:
            val -= int(data[1])
            cart[key] = val
            # print(val,"kkkk")
                
def display():
    print("Name   quantity   Price")
    for key,val in catalog.items():
        for k,v in val.items():
            for k1,v1 in cart.items():
                if k1 == key:
                    print(key, v1, float(v))

    print("Total:", amount)
    print("Disc%:", 0.0)
    print("Tax:",tax)
    print("Payable amount: ", res)

def main():
    lines = int(input())
    for x in range(lines):
        string = input().split(" ")
        # print(string[0])
        if string[0] == "Item":
            addCatalog(string[1])
        if string[0] == "catalog":
            displayCatalog()
        if string[0] == "add":
            addCart(string[1])
        if string[0] == "show":
            displayCart()
        if string[0] == "totalAmount":
            totalAmount()
        if string[0] == "remove":
            remove(string[1])
        if string[0] == "payableAmount":
            payableAmount()
        if string[0] == "print":
            display()
    # print(catalog)
    # print(cart)
if __name__ == '__main__':
    main()