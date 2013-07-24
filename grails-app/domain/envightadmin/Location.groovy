package envightadmin

class Location {
	double latitude 
	double longitude
	
    static constraints = {
		latitude( nullable:false )
		longitude( nullable:false )
    }
	
	static mapping = {
		table 'LOCATION'
		id column: 'ID'
		latitude column: 'LATITUDE'
		longitude column: 'LONGITUDE'
		version false
	}
}
