/**
 * Clerk Backend API
 * The Clerk REST Backend API, meant to be accessed by backend servers. Please see https://clerk.com/docs for more information.
 *
 * The version of the OpenAPI document: v1
 * Contact: support@clerk.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.davisuga.clerk4s.api

import com.davisuga.clerk4s.model.AddDomainRequest
import com.davisuga.clerk4s.model.ClerkErrors
import com.davisuga.clerk4s.model.DeletedObject
import com.davisuga.clerk4s.model.Domain
import com.davisuga.clerk4s.model.Domains
import com.davisuga.clerk4s.model.UpdateDomainRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object DomainsApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new DomainsApi(baseUrl)
}

class DomainsApi(baseUrl: String) {

  /**
   * Add a new domain for your instance. Useful in the case of multi-domain instances, allows adding satellite domains to an instance. The new domain must have a `name`. The domain name can contain the port for development instances, like `localhost:3000`. At the moment, instances can have only one primary domain, so the `is_satellite` parameter must be set to `true`. If you're planning to configure the new satellite domain to run behind a proxy, pass the `proxy_url` parameter accordingly.
   * 
   * Expected answers:
   *   code 200 : Domain (A domain)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param addDomainRequest 
   */
  def addDomain(bearerToken: String)(addDomainRequest: Option[AddDomainRequest] = None
): Request[Either[ResponseException[String, Exception], Domain], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/domains")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(addDomainRequest)
      .response(asJson[Domain])

  /**
   * Deletes a satellite domain for the instance. It is currently not possible to delete the instance's primary domain.
   * 
   * Expected answers:
   *   code 200 : DeletedObject (Deleted Object)
   *   code 403 : ClerkErrors (Request was not successful)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param domainId The ID of the domain that will be deleted. Must be a satellite domain.
   */
  def deleteDomain(bearerToken: String)(domainId: String
): Request[Either[ResponseException[String, Exception], DeletedObject], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/domains/${domainId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeletedObject])

  /**
   * Use this endpoint to get a list of all domains for an instance. The response will contain the primary domain for the instance and any satellite domains. Each domain in the response contains information about the URLs where Clerk operates and the required CNAME targets.
   * 
   * Expected answers:
   *   code 200 : Domains (A list of domains)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def listDomains(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], Domains], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/domains")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Domains])

  /**
   * Updates an existing domain for the instance. Use this endpoint to specify the `proxy_url`, if you choose to use Clerk via proxy. Whenever you decide you'd rather switch to DNS setup for Clerk, simply set `proxy_url` to `null` for the domain. The `proxy_url` can be updated only for production instances.
   * 
   * Expected answers:
   *   code 200 : Domain (A domain)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param domainId The ID of the domain that will be updated.
   * @param updateDomainRequest 
   */
  def updateDomain(bearerToken: String)(domainId: String, updateDomainRequest: UpdateDomainRequest
): Request[Either[ResponseException[String, Exception], Domain], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/domains/${domainId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateDomainRequest)
      .response(asJson[Domain])

}
