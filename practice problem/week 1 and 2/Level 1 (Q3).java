class DistanceConversion {
    public static void main(String[] args) {
        double distanceKm = 10.8;
        double kmToMilesFactor = 1.6;
        double distanceMiles = distanceKm * kmToMilesFactor;
        System.out.println("The distance " + distanceKm + 
                           " km in miles is " + distanceMiles);
    }
}