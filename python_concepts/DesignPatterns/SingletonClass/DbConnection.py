from typing import Optional
import threading

class DbConnection:
    connInstance = None 
    lock = threading.Lock()

    def __init__(self) -> None:
        print("Read config params from env")
        print("Assign these params to the instance vars")
        self.username ="db-username"
        self.password = "db-password"
        self.db = "db-name"
        print("Use it to open connection to database")

    @classmethod
    def getInstance(cls):
        #
        # Double checking lock
        # Covers an edge case in case of multi-threaded env
        #
        
        if cls.connInstance is None:
            if cls.lock.acquire():
                cls.connInstance = DbConnection()
            cls.lock.release()
        print("using " + str(id(cls.connInstance)))
        return cls.connInstance