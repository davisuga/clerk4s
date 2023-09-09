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


case class MergeOrganizationMetadataRequest(
  /* Metadata saved on the organization, that is visible to both your frontend and backend. The new object will be merged with the existing value. */
  publicMetadata: Option[Any] = None,
  /* Metadata saved on the organization that is only visible to your backend. The new object will be merged with the existing value. */
  privateMetadata: Option[Any] = None
)
