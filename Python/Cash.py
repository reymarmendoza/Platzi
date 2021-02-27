from Payment import Payment

class Cash(Payment):

    def __init__(self, id):
        super().__init__(id)