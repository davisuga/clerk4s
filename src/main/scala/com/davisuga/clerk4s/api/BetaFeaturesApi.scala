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

import com.davisuga.clerk4s.model.ClerkErrors
import com.davisuga.clerk4s.model.UpdateInstanceAuthConfig200Response
import com.davisuga.clerk4s.model.UpdateInstanceAuthConfigRequest
import com.davisuga.clerk4s.model.UpdateProductionInstanceDomainRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object BetaFeaturesApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new BetaFeaturesApi(baseUrl)
}

class BetaFeaturesApi(baseUrl: String) {

  /**
   * Change the domain of a production instance.  Changing the domain requires updating the [DNS records](https://clerk.com/docs/deployments/overview#dns-records) accordingly, deploying new [SSL certificates](https://clerk.com/docs/deployments/overview#deploy), updating your Social Connection's redirect URLs and setting the new keys in your code.  WARNING: Changing your domain will invalidate all current user sessions (i.e. users will be logged out). Also, while your application is being deployed, a small downtime is expected to occur.
   * 
   * Expected answers:
   *   code 202 :  (Accepted)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 422 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param updateProductionInstanceDomainRequest 
   */
  def changeProductionInstanceDomain(bearerToken: String)(updateProductionInstanceDomainRequest: Option[UpdateProductionInstanceDomainRequest] = None
): Request[Either[ResponseException[String, Exception], Unit], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/instance/change_domain")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateProductionInstanceDomainRequest)
      .response(asJson[Unit])

  /**
   * Updates the settings of an instance
   * 
   * Expected answers:
   *   code 200 : UpdateInstanceAuthConfig200Response (InstanceSettings Server API)
   *   code 402 : ClerkErrors (Payment required)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param updateInstanceAuthConfigRequest 
   */
  def updateInstanceAuthConfig(bearerToken: String)(updateInstanceAuthConfigRequest: Option[UpdateInstanceAuthConfigRequest] = None
): Request[Either[ResponseException[String, Exception], UpdateInstanceAuthConfig200Response], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/beta_features/instance_settings")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateInstanceAuthConfigRequest)
      .response(asJson[UpdateInstanceAuthConfig200Response])

  /**
   * Change the domain of a production instance.  Changing the domain requires updating the [DNS records](https://clerk.com/docs/deployments/overview#dns-records) accordingly, deploying new [SSL certificates](https://clerk.com/docs/deployments/overview#deploy), updating your Social Connection's redirect URLs and setting the new keys in your code.  WARNING: Changing your domain will invalidate all current user sessions (i.e. users will be logged out). Also, while your application is being deployed, a small downtime is expected to occur.
   * 
   * Expected answers:
   *   code 202 :  (Accepted)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 422 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param updateProductionInstanceDomainRequest 
   */
  def updateProductionInstanceDomain(bearerToken: String)(updateProductionInstanceDomainRequest: Option[UpdateProductionInstanceDomainRequest] = None
): Request[Either[ResponseException[String, Exception], Unit], Any] =
    basicRequest
      .method(Method.PUT, uri"$baseUrl/beta_features/domain")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateProductionInstanceDomainRequest)
      .response(asJson[Unit])

}
