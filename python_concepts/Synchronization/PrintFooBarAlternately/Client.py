if __name__ == "__main__":
    from FooBar import FooBar
    import threading

    fooBar = FooBar(10)

    thread1 = threading.Thread(target=fooBar.foo, args=(lambda: print("foo"),))
    thread2 = threading.Thread(target=fooBar.bar, args=(lambda: print("bar"),))
    
    thread1.start()
    thread2.start()

    # wait
    thread1.join()
    thread2.join()

