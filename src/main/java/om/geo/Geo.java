package om.geo;

//Reference: https://www.movable-type.co.uk/scripts/latlong.html

public class Geo {
	
	private double R = 6371e3; // meters

	public double getGeoDistance(GeoPoint point1, GeoPoint point2) {
				
		double geoDistance = 0;
		
		double φ1 = point1.getLatitude() * Math.PI/180; // φ, λ in radians
		double φ2 = point2.getLatitude() * Math.PI/180;
		double Δφ = (point2.getLatitude() - point1.getLatitude()) * Math.PI/180;
		double Δλ = (point2.getLongitude() - point1.getLongitude()) * Math.PI/180;

		double a = Math.sin(Δφ/2) * Math.sin(Δφ/2) +
		           Math.cos(φ1) * Math.cos(φ2) *
		           Math.sin(Δλ/2) * Math.sin(Δλ/2);

		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

		geoDistance = (R * c) / 1000; // meters to km
		
		return geoDistance;
	}
	
}
