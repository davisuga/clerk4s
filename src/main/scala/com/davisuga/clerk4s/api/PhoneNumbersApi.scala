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
import com.davisuga.clerk4s.model.CreatePhoneNumberRequest
import com.davisuga.clerk4s.model.DeletedObject
import com.davisuga.clerk4s.model.PhoneNumber
import com.davisuga.clerk4s.model.UpdatePhoneNumberRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object PhoneNumbersApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new PhoneNumbersApi(baseUrl)
}

class PhoneNumbersApi(baseUrl: String) {

  /**
   * Create a new phone number
   * 
   * Expected answers:
   *   code 200 : PhoneNumber (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param createPhoneNumberRequest 
   */
  def createPhoneNumber(bearerToken: String)(createPhoneNumberRequest: Option[CreatePhoneNumberRequest] = None
): Request[Either[ResponseException[String, Exception], PhoneNumber], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/phone_numbers")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createPhoneNumberRequest)
      .response(asJson[PhoneNumber])

  /**
   * Delete the phone number with the given ID
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
   * @param phoneNumberId The ID of the phone number to delete
   */
  def deletePhoneNumber(bearerToken: String)(phoneNumberId: String
): Request[Either[ResponseException[String, Exception], DeletedObject], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/phone_numbers/${phoneNumberId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeletedObject])

  /**
   * Returns the details of a phone number
   * 
   * Expected answers:
   *   code 200 : PhoneNumber (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param phoneNumberId The ID of the phone number to retrieve
   */
  def getPhoneNumber(bearerToken: String)(phoneNumberId: String
): Request[Either[ResponseException[String, Exception], PhoneNumber], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/phone_numbers/${phoneNumberId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[PhoneNumber])

  /**
   * Updates a phone number
   * 
   * Expected answers:
   *   code 200 : PhoneNumber (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param phoneNumberId The ID of the phone number to update
   * @param updatePhoneNumberRequest 
   */
  def updatePhoneNumber(bearerToken: String)(phoneNumberId: String, updatePhoneNumberRequest: Option[UpdatePhoneNumberRequest] = None
): Request[Either[ResponseException[String, Exception], PhoneNumber], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/phone_numbers/${phoneNumberId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updatePhoneNumberRequest)
      .response(asJson[PhoneNumber])

}