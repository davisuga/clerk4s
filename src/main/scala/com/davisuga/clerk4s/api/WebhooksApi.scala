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
import com.davisuga.clerk4s.model.SvixURL
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object WebhooksApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new WebhooksApi(baseUrl)
}

class WebhooksApi(baseUrl: String) {

  /**
   * Create a Svix app and associate it with the current instance
   * 
   * Expected answers:
   *   code 200 : SvixURL (Response that contains a temporary Svix URL to access management dashboard)
   *   code 400 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def createSvixApp(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], SvixURL], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/svix")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[SvixURL])

  /**
   * Delete a Svix app and disassociate it from the current instance
   * 
   * Expected answers:
   *   code 204 :  (Svix app was successfully deleted)
   *   code 400 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def deleteSvixApp(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], Unit], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/webhooks/svix")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Unit])

  /**
   * Generate a new url for accessing the Svix's management dashboard for that particular instance
   * 
   * Expected answers:
   *   code 200 : SvixURL (Response that contains a temporary Svix URL to access management dashboard)
   *   code 400 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def generateSvixAuthURL(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], SvixURL], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/webhooks/svix_url")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[SvixURL])

}
