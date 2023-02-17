package models

import entities.Vehicle

class ParkingSpot (private var spotnumber: Int){

    private var vehicle : Vehicle? =null


    fun getparkedVehicle(): Vehicle?{
        return vehicle
    }

    fun getspotNumber():Int{
        return spotnumber
    }


    fun isFree():Boolean{
        return vehicle==null
    }

    fun assignVehicle(vehicle: Vehicle){
        this.vehicle=vehicle
    }


    fun unAssignedVehicle(){
        vehicle=null
    }
}