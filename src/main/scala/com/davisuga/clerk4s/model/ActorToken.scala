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


case class ActorToken(
  `object`: ActorTokenEnums.`Object`,
  id: String,
  status: ActorTokenEnums.Status,
  userId: String,
  actor: Any,
  token: Option[String] = None,
  url: Option[String] = None,
  /* Unix timestamp of creation.  */
  createdAt: Long,
  /* Unix timestamp of last update.  */
  updatedAt: Long
)

object ActorTokenEnums {

  type `Object` = `Object`.Value
  type Status = Status.Value
  object `Object` extends Enumeration {
    val ActorToken = Value("actor_token")
  }

  object Status extends Enumeration {
    val Pending = Value("pending")
    val Accepted = Value("accepted")
    val Revoked = Value("revoked")
  }

}
