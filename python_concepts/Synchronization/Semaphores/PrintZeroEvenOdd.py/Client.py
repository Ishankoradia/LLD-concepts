if __name__ == "__main__":
    from ZeroEvenOdd import ZeroEvenOdd
    import threading

    zeroEvenOdd = ZeroEvenOdd(10)

    printNumber = lambda x: print(x)

    thread1 = threading.Thread(target=zeroEvenOdd.zero, args=(printNumber,))
    thread2 = threading.Thread(target=zeroEvenOdd.even, args=(printNumber,))
    thread3 = threading.Thread(target=zeroEvenOdd.odd, args=(printNumber,))
    
    thread1.start()
    thread2.start()
    thread3.start()

    # wait
    thread1.join()
    thread2.join()
    thread3.join()


