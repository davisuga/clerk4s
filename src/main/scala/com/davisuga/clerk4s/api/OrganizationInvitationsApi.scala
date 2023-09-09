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
package com.davisuga.clerk4s.api

import com.davisuga.clerk4s.model.ClerkErrors
import com.davisuga.clerk4s.model.CreateOrganizationInvitationBulkRequestInner
import com.davisuga.clerk4s.model.CreateOrganizationInvitationRequest
import com.davisuga.clerk4s.model.OrganizationInvitation
import com.davisuga.clerk4s.model.OrganizationInvitations
import com.davisuga.clerk4s.model.RevokeOrganizationInvitationRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object OrganizationInvitationsApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new OrganizationInvitationsApi(baseUrl)
}

class OrganizationInvitationsApi(baseUrl: String) {

  /**
   * Creates a new organization invitation and sends an email to the provided `email_address` with a link to accept the invitation and join the organization. You can specify the `role` for the invited organization member.  New organization invitations get a \"pending\" status until they are revoked by an organization administrator or accepted by the invitee.  The request body supports passing an optional `redirect_url` parameter. When the invited user clicks the link to accept the invitation, they will be redirected to the URL provided. Use this parameter to implement a custom invitation acceptance flow.  You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. That user must be a member with administrator privileges in the organization. Only \"admin\" members can create organization invitations.  You can optionally provide public and private metadata for the organization invitation. The public metadata are visible by both the Frontend and the Backend whereas the private ones only by the Backend. When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
   * 
   * Expected answers:
   *   code 200 : OrganizationInvitation (An organization invitation)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param organizationId The ID of the organization for which to send the invitation
   * @param createOrganizationInvitationRequest 
   */
  def createOrganizationInvitation(bearerToken: String)(organizationId: String, createOrganizationInvitationRequest: CreateOrganizationInvitationRequest
): Request[Either[ResponseException[String, Exception], OrganizationInvitation], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/organizations/${organizationId}/invitations")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createOrganizationInvitationRequest)
      .response(asJson[OrganizationInvitation])

  /**
   * Creates new organization invitations in bulk and sends out emails to the provided email addresses with a link to accept the invitation and join the organization. You can specify a different `role` for each invited organization member. New organization invitations get a \"pending\" status until they are revoked by an organization administrator or accepted by the invitee. The request body supports passing an optional `redirect_url` parameter for each invitation. When the invited user clicks the link to accept the invitation, they will be redirected to the provided URL. Use this parameter to implement a custom invitation acceptance flow. You must specify the ID of the user that will send the invitation with the `inviter_user_id` parameter. Each invitation can have a different inviter user. Inviter users must be members with administrator privileges in the organization. Only \"admin\" members can create organization invitations. You can optionally provide public and private metadata for each organization invitation. The public metadata are visible by both the Frontend and the Backend, whereas the private metadata are only visible by the Backend. When the organization invitation is accepted, the metadata will be transferred to the newly created organization membership.
   * 
   * Expected answers:
   *   code 200 : OrganizationInvitations (A list of organization invitations)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param organizationId The organization ID.
   * @param createOrganizationInvitationBulkRequestInner 
   */
  def createOrganizationInvitationBulk(bearerToken: String)(organizationId: String, createOrganizationInvitationBulkRequestInner: Seq[CreateOrganizationInvitationBulkRequestInner]
): Request[Either[ResponseException[String, Exception], OrganizationInvitations], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/organizations/${organizationId}/invitations/bulk")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createOrganizationInvitationBulkRequestInner)
      .response(asJson[OrganizationInvitations])

  /**
   * This request returns the list of organization invitations with \"pending\" status. These are the organization invitations that can still be used to join the organization, but have not been accepted by the invited user yet. Results can be paginated using the optional `limit` and `offset` query parameters. The organization invitations are ordered by descending creation date. Most recent invitations will be returned first.
   * 
   * Expected answers:
   *   code 200 : OrganizationInvitations (A list of organization invitations)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param organizationId The organization ID.
   * @param limit Applies a limit to the number of results returned. Can be used for paginating the results together with `offset`. Must be an integer greater than zero and less than 500. By default, if not supplied, a limit of 10 is used.
   * @param offset Skip the first `offset` results when paginating. Needs to be an integer greater or equal to zero. To be used in conjunction with `limit`.
   */
  def listPendingOrganizationInvitations(bearerToken: String)(organizationId: String, limit: Option[Double] = None, offset: Option[Double] = None
): Request[Either[ResponseException[String, Exception], OrganizationInvitations], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/organizations/${organizationId}/invitations/pending?limit=${ limit }&offset=${ offset }")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[OrganizationInvitations])

  /**
   * Use this request to revoke a previously issued organization invitation. Revoking an organization invitation makes it invalid; the invited user will no longer be able to join the organization with the revoked invitation. Only organization invitations with \"pending\" status can be revoked. The request needs the `requesting_user_id` parameter to specify the user which revokes the invitation. Only users with \"admin\" role can revoke invitations.
   * 
   * Expected answers:
   *   code 200 : OrganizationInvitation (An organization invitation)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 403 : ClerkErrors (Authorization invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param organizationId The organization ID.
   * @param invitationId The organization invitation ID.
   * @param revokeOrganizationInvitationRequest 
   */
  def revokeOrganizationInvitation(bearerToken: String)(organizationId: String, invitationId: String, revokeOrganizationInvitationRequest: RevokeOrganizationInvitationRequest
): Request[Either[ResponseException[String, Exception], OrganizationInvitation], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/organizations/${organizationId}/invitations/${invitationId}/revoke")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(revokeOrganizationInvitationRequest)
      .response(asJson[OrganizationInvitation])

}