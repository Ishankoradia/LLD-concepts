from threading import Semaphore

class ZeroEvenOdd:
    def __init__(self, n):
        self.n = n
        self.zeroSema: Semaphore = Semaphore(1)
        self.evenSema: Semaphore = Semaphore(0)
        self.oddSema: Semaphore = Semaphore(0)
        
        
	# printNumber(x) outputs "x", where x is an integer.
    def zero(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(self.n):
            self.zeroSema.acquire()
            printNumber(0)
            if i % 2 == 0:
                self.oddSema.release()
            else:
                self.evenSema.release()
        
        
        
    def even(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(2, self.n + 1, 2):
            self.evenSema.acquire()
            printNumber(i)
            self.zeroSema.release()
        
        
    def odd(self, printNumber: 'Callable[[int], None]') -> None:
        for i in range(1, self.n + 1, 2):
            self.oddSema.acquire()
            printNumber(i)
            self.zeroSema.release()