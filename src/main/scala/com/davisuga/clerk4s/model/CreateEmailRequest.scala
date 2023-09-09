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


case class CreateEmailRequest(
  /* The email name portion of the sending email address. <br/>e.g.: `from_email_name=info` will send from info@example.com */
  fromEmailName: Option[String] = None,
  /* The subject of the email. */
  subject: Option[String] = None,
  /* The body of the email. */
  body: Option[String] = None,
  /* The ID of the email address to send to. */
  emailAddressId: Option[String] = None
)

