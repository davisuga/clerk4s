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


case class CreateRedirectURLRequest(
  /* The full url value prefixed with `https://` or a custom scheme e.g. `\"https://my-app.com/oauth-callback\"` or `\"my-app://oauth-callback\"` */
  url: Option[String] = None
)
