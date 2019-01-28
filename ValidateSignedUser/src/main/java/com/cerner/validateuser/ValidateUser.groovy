/**
 * 
 */
package com.cerner.validateuser

import com.sun.jersey.api.client.Client
import com.sun.jersey.api.client.ClientResponse
import com.sun.jersey.api.client.WebResource

/**
 * @author IB041355
 *
 */
class ValidateUser {

	def validUser(userId){
		String baseUrl = "http://api.milltools.cerner.net/users/"
		if (userId?.trim()){
		String fullUrl = "$baseUrl$userId"
		def response = performOperation(fullUrl)
		return response.getStatus()
		}
		else{
			println "User Id is blank:::"
			return
		}
	}
	def performOperation(fullUrl){
		ClientResponse response
		Client client=Client.create()
		println "Complete Url :::::$fullUrl"
		Class<?> responseClass = ClientResponse.class
		WebResource webResource=client.resource(fullUrl)
		response = webResource.get(responseClass)
		int responseSatus = response.getStatus()
		return response
	}
}
