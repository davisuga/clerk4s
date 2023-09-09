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


case class UpsertTemplateRequest(
  /* The user-friendly name of the template */
  name: Option[String] = None,
  /* The email subject. Applicable only to email templates. */
  subject: Option[String] = None,
  /* The editor markup used to generate the body of the template */
  markup: Option[String] = None,
  /* The template body before variable interpolation */
  body: Option[String] = None,
  /* Whether Clerk should deliver emails or SMS messages based on the current template */
  deliveredByClerk: Option[Boolean] = None,
  /* The local part of the From email address that will be used for emails. For example, in the address 'hello@example.com', the local part is 'hello'. Applicable only to email templates. */
  fromEmailName: Option[String] = None
)

