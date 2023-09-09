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


case class CreateOrganizationInvitationBulkRequestInner(
  /* The email address of the new member that is going to be invited to the organization */
  emailAddress: String,
  /* The ID of the user that invites the new member to the organization. Must be an administrator in the organization. */
  inviterUserId: String,
  /* The role of the new member in the organization. */
  role: CreateOrganizationInvitationBulkRequestInnerEnums.Role,
  /* Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API. */
  publicMetadata: Option[Any] = None,
  /* Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API. */
  privateMetadata: Option[Any] = None,
  /* Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email. */
  redirectUrl: Option[String] = None
)

object CreateOrganizationInvitationBulkRequestInnerEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val Admin = Value("admin")
    val BasicMember = Value("basic_member")
  }

}