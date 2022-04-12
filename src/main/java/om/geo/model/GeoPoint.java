package om.geo.model;

import java.util.Objects;

public class GeoPoint {

	private double latitude;
    private double longitude;
    private double altitude;
    
	public GeoPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GeoPoint(double latitude, double longitude, double altitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}

	public GeoPoint(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public GeoPoint(String latitude, String longitude) {
		super();
		this.latitude = Double.valueOf(latitude);
		this.longitude = Double.valueOf(longitude);
	}
	
	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.setLatitude(Double.valueOf(altitude));
	}

	
	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return longitude;
	}
	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	/**
	 * @return the altitude
	 */
	public double getAltitude() {
		return altitude;
	}
	/**
	 * @param altitude the altitude to set
	 */
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}

	@Override
	public String toString() {
		return "GeoPoint [latitude=" + latitude + ", longitude=" + longitude + ", altitude=" + altitude + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(altitude, latitude, longitude);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof GeoPoint)) {
			return false;
		}
		GeoPoint other = (GeoPoint) obj;
		return Double.doubleToLongBits(altitude) == Double.doubleToLongBits(other.altitude)
				&& Double.doubleToLongBits(latitude) == Double.doubleToLongBits(other.latitude)
				&& Double.doubleToLongBits(longitude) == Double.doubleToLongBits(other.longitude);
	}
	
    
	
}
