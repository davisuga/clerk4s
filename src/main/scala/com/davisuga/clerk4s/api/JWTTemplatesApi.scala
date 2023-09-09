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
import com.davisuga.clerk4s.model.CreateJWTTemplateRequest
import com.davisuga.clerk4s.model.DeletedObject
import com.davisuga.clerk4s.model.JWTTemplate
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object JWTTemplatesApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new JWTTemplatesApi(baseUrl)
}

class JWTTemplatesApi(baseUrl: String) {

  /**
   * Create a new JWT template
   * 
   * Expected answers:
   *   code 200 : JWTTemplate (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 402 : ClerkErrors (Payment required)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param createJWTTemplateRequest 
   */
  def createJWTTemplate(bearerToken: String)(createJWTTemplateRequest: Option[CreateJWTTemplateRequest] = None
): Request[Either[ResponseException[String, Exception], JWTTemplate], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/jwt_templates")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createJWTTemplateRequest)
      .response(asJson[JWTTemplate])

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : DeletedObject (Deleted Object)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param templateId JWT Template ID
   */
  def deleteJWTTemplate(bearerToken: String)(templateId: String
): Request[Either[ResponseException[String, Exception], DeletedObject], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/jwt_templates/${templateId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeletedObject])

  /**
   * Retrieve the details of a given JWT template
   * 
   * Expected answers:
   *   code 200 : JWTTemplate (Success)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param templateId JWT Template ID
   */
  def getJWTTemplate(bearerToken: String)(templateId: String
): Request[Either[ResponseException[String, Exception], JWTTemplate], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/jwt_templates/${templateId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[JWTTemplate])

  /**
   * Expected answers:
   *   code 200 : Seq[JWTTemplate] (List of JWT templates)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   */
  def listJWTTemplates(bearerToken: String)(
): Request[Either[ResponseException[String, Exception], Seq[JWTTemplate]], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/jwt_templates")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Seq[JWTTemplate]])

  /**
   * Updates an existing JWT template
   * 
   * Expected answers:
   *   code 200 : JWTTemplate (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 402 : ClerkErrors (Payment required)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param templateId The ID of the JWT template to update
   * @param createJWTTemplateRequest 
   */
  def updateJWTTemplate(bearerToken: String)(templateId: String, createJWTTemplateRequest: Option[CreateJWTTemplateRequest] = None
): Request[Either[ResponseException[String, Exception], JWTTemplate], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/jwt_templates/${templateId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createJWTTemplateRequest)
      .response(asJson[JWTTemplate])

}
