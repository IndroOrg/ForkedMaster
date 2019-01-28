package com.cerner.validateuser
import org.json.JSONObject

import groovy.json.JsonSlurper
class JsonParser {

	static main(args) {
		File f=new File("mu.json")
		new JsonParser().parseJson(f)
	}
	def parseJson(jsonFile){
		def slurper = new JsonSlurper()
		def jsonText = jsonFile.getText() //This is the json string. You can directly initialized this var with json string
		def json = slurper.parseText( jsonText )
		println json.permission
	}
	

}
