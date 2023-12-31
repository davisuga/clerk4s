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


case class CreateEmailAddressRequest(
  /* The ID representing the user */
  userId: Option[String] = None,
  /* The new email address. Must adhere to the RFC 5322 specification for email address format. */
  emailAddress: Option[String] = None,
  /* When created, the email address will be marked as verified. */
  verified: Option[Boolean] = None,
  /* Create this email address as the primary email address for the user. Default: false, unless it is the first email address. */
  primary: Option[Boolean] = None
)

