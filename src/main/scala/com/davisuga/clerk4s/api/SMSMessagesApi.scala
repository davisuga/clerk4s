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
import com.davisuga.clerk4s.model.CreateSMSMessageRequest
import com.davisuga.clerk4s.model.SMSMessage
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object SMSMessagesApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new SMSMessagesApi(baseUrl)
}

class SMSMessagesApi(baseUrl: String) {

  /**
   * Create and send an SMS message to the supplied phone number ID
   * 
   * Expected answers:
   *   code 200 : SMSMessage (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param createSMSMessageRequest Required parameters
   */
  def createSMSMessage(bearerToken: String)(createSMSMessageRequest: Option[CreateSMSMessageRequest] = None
): Request[Either[ResponseException[String, Exception], SMSMessage], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/sms_messages")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createSMSMessageRequest)
      .response(asJson[SMSMessage])

}
