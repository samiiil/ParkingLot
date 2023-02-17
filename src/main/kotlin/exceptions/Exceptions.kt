package exceptions

class InvalidSpotExceptions : Exception("Invalid spot number")

class ParkingLotFullException : Exception("Parking Lot full")
class SpotIsOccupiedException : Exception("Spot is occupied")

