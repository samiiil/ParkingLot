package exceptions



class ParkingLotFullException : Exception("Parking Lot is full")
class SpotIsOccupiedException : Exception("Spot is occupied")

class InvalidSpotExceptions : Exception("Spot number is Invalid")