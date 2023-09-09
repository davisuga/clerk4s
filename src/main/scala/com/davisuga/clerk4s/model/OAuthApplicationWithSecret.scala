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
package com.davisuga.clerk4s.model


case class OAuthApplicationWithSecret(
  `object`: OAuthApplicationWithSecretEnums.`Object`,
  id: String,
  instanceId: String,
  name: String,
  clientId: String,
  public: Boolean,
  scopes: String,
  callbackUrl: String,
  authorizeUrl: String,
  tokenFetchUrl: String,
  userInfoUrl: String,
  /* Unix timestamp of creation.  */
  createdAt: Long,
  /* Unix timestamp of last update.  */
  updatedAt: Long,
  /* Empty if public client.  */
  clientSecret: Option[String] = None
)

object OAuthApplicationWithSecretEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val OauthApplication = Value("oauth_application")
  }

}
