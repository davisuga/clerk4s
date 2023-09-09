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


case class CreateOrganizationMembershipRequest(
  /* The ID of the user that will be added as a member in the organization. The user needs to exist in the same instance as the organization and must not be a member of the given organization already. */
  userId: String,
  /* The role that the new member will have in the organization. */
  role: CreateOrganizationMembershipRequestEnums.Role
)

object CreateOrganizationMembershipRequestEnums {

  type Role = Role.Value
  object Role extends Enumeration {
    val Admin = Value("admin")
    val BasicMember = Value("basic_member")
  }

}