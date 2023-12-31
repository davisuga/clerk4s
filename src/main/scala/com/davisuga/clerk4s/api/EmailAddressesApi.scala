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
import com.davisuga.clerk4s.model.CreateEmailAddressRequest
import com.davisuga.clerk4s.model.DeletedObject
import com.davisuga.clerk4s.model.EmailAddress
import com.davisuga.clerk4s.model.UpdateEmailAddressRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object EmailAddressesApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new EmailAddressesApi(baseUrl)
}

class EmailAddressesApi(baseUrl: String) {

  /**
   * Create a new email address
   * 
   * Expected answers:
   *   code 200 : EmailAddress (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param createEmailAddressRequest 
   */
  def createEmailAddress(bearerToken: String)(createEmailAddressRequest: Option[CreateEmailAddressRequest] = None
): Request[Either[ResponseException[String, Exception], EmailAddress], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/email_addresses")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createEmailAddressRequest)
      .response(asJson[EmailAddress])

  /**
   * Delete the email address with the given ID
   * 
   * Expected answers:
   *   code 200 : DeletedObject (Deleted Object)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param emailAddressId The ID of the email address to delete
   */
  def deleteEmailAddress(bearerToken: String)(emailAddressId: String
): Request[Either[ResponseException[String, Exception], DeletedObject], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/email_addresses/${emailAddressId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeletedObject])

  /**
   * Returns the details of an email address.
   * 
   * Expected answers:
   *   code 200 : EmailAddress (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param emailAddressId The ID of the email address to retrieve
   */
  def getEmailAddress(bearerToken: String)(emailAddressId: String
): Request[Either[ResponseException[String, Exception], EmailAddress], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/email_addresses/${emailAddressId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[EmailAddress])

  /**
   * Updates an email address.
   * 
   * Expected answers:
   *   code 200 : EmailAddress (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param emailAddressId The ID of the email address to update
   * @param updateEmailAddressRequest 
   */
  def updateEmailAddress(bearerToken: String)(emailAddressId: String, updateEmailAddressRequest: Option[UpdateEmailAddressRequest] = None
): Request[Either[ResponseException[String, Exception], EmailAddress], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/email_addresses/${emailAddressId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateEmailAddressRequest)
      .response(asJson[EmailAddress])

}
