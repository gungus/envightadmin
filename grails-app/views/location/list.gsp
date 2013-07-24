
<%@ page import="envightadmin.Location" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'location.label', default: 'Location')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABCDE" type="text/javascript"></script>
  		<script type="text/javascript">
    	function load() {
      		if( GBrowserIsCompatible() ) {
       			var map = new GMap2( document.getElementById( "map" ) );
        		map.setCenter( new GLatLng( 63.0, 22.0 ), 4 );
        		map.addControl( new GLargeMapControl() );
        	    map.addControl( new GMapTypeControl() );

        	    <g:each in="${locationInstanceList}" status="j" var="location">
                	var point${location.id} = new GLatLng( ${location.latitude}, ${location.longitude} );
             		var marker${location.id} = new GMarker( point${location.id} );
             		marker${location.id}.bindInfoWindowHtml( "location(${location.id})" );
                	map.addOverlay( marker${location.id} )
             	</g:each>
      		}
    	}
    	</script>
    </head>
    <body onload="load()" onunload="GUnload()">
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></span>
            <span class="menuButton"><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></span>
        </div>
        <div class="body">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                            <g:sortableColumn property="id" title="${message(code: 'location.id.label', default: 'Id')}" />
                        
                            <g:sortableColumn property="latitude" title="${message(code: 'location.latitude.label', default: 'Latitude')}" />
                        
                            <g:sortableColumn property="longitude" title="${message(code: 'location.longitude.label', default: 'Longitude')}" />
                        
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${locationInstanceList}" status="i" var="locationInstance">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${locationInstance.id}">${fieldValue(bean: locationInstance, field: "id")}</g:link></td>
                        
                            <td>${fieldValue(bean: locationInstance, field: "latitude")}</td>
                        
                            <td>${fieldValue(bean: locationInstance, field: "longitude")}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${locationInstanceTotal}" />
            </div>
        </div>
        <div>
		    <div id="map" style="float:left; width: 800px; height: 500px"></div>
        </div>
    </body>
</html>
