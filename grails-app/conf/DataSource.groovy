dataSource {
    pooled = true
    driverClassName = "org.hsqldb.jdbcDriver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:hsqldb:mem:devDB"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/envight?useUnicode=true&amp;characterEncoding=utf8"
			driverClassName = "com.mysql.jdbc.Driver"
            username = "envight"
            password = "envight"
        }
    }
    production {
        dataSource {
            dbCreate = "create"
            url = "jdbc:mysql://localhost:3306/envight?useUnicode=true&amp;characterEncoding=utf8"
			driverClassName = "com.mysql.jdbc.Driver"
            username = "envight"
            password = "envight"
        }
    }
}
