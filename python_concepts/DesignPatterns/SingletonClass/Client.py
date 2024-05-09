from DbConnection import DbConnection
import threading

if __name__ == "__main__":
    db1 = DbConnection.getInstance()
    db2 = DbConnection.getInstance()

    thread1 = threading.Thread(target=DbConnection.getInstance,)
    thread2 = threading.Thread(target=DbConnection.getInstance,)

    thread1.start()
    thread2.start()

    # wait
    thread1.join()
    thread2.join()