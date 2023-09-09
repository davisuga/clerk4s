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


case class Email(
  `object`: EmailEnums.`Object`,
  id: String,
  slug: Option[String] = None,
  fromEmailName: String,
  emailAddressId: String,
  toEmailAddress: String,
  userId: Option[String] = None,
  subject: String,
  body: String,
  bodyPlain: Option[String] = None,
  status: String,
  data: Option[Any] = None,
  deliveredByClerk: Boolean
)

object EmailEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val Email = Value("email")
  }

}