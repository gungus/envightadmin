environments {
	development {
		grails.serverURL = "http://localhost:8080/envightadmin"
	}
	ci {
		grails.serverURL = "http://localhost:8080/envightadmin"
	}
	test {
		grails.serverURL = "http://envight-test.jelastic.elastx.net/envightadmin"
	}
	production {
		grails.serverURL = "http://envight-prod.jelastic.elastx.net/"
	}
}
