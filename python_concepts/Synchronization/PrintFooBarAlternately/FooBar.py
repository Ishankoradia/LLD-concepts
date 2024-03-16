from threading import *


class FooBar:
    def __init__(self, n):
        self.n = n
        self.fooSema: Semaphore = Semaphore(1)
        self.barSema: Semaphore = Semaphore(0)


    def foo(self, printFoo: 'Callable[[], None]') -> None:
        
        for i in range(self.n):
            self.fooSema.acquire()
            # printFoo() outputs "foo". Do not change or remove this line.
            printFoo()
            self.barSema.release()


    def bar(self, printBar: 'Callable[[], None]') -> None:
        
        for i in range(self.n):
            self.barSema.acquire()
            # printBar() outputs "bar". Do not change or remove this line.
            printBar()
            self.fooSema.release()
