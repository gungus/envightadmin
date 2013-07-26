// hibernat + username & password default loaded in grails-app/conf/DataSource.groovy. 
environments {
	development {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop','update'
			url = "jdbc:hsqldb:mem:devDB"
			driverClassName = "org.hsqldb.jdbcDriver"
			//url = "jdbc:mysql://localhost:3306/envight?useUnicode=true&amp;characterEncoding=utf8"
			//driverClassName = "com.mysql.jdbc.Driver"
			username = "sa"
			password = ""
		}
	}
	ci {
		dataSource {
			dbCreate = "create-drop" // one of 'create', 'create-drop','update'
			url = "jdbc:hsqldb:mem:devDB"
			driverClassName = "org.hsqldb.jdbcDriver"
			username = "sa"
			password = ""
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://mysql-envight-test.jelastic.elastx.net:3306/envight?useUnicode=true&amp;characterEncoding=utf8"
			driverClassName = "com.mysql.jdbc.Driver"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://mysql-envight-prod.jelastic.elastx.net:3306/envight?useUnicode=true&amp;characterEncoding=utf8"
			driverClassName = "com.mysql.jdbc.Driver"
		}
	}
}
