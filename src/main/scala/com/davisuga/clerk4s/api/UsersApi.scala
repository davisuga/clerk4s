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
import com.davisuga.clerk4s.model.CreateUserRequest
import com.davisuga.clerk4s.model.DeletedObject
import com.davisuga.clerk4s.model.DisableMFA200Response
import java.io.File
import com.davisuga.clerk4s.model.GetOAuthAccessToken200ResponseInner
import com.davisuga.clerk4s.model.OrganizationMemberships
import com.davisuga.clerk4s.model.TotalCount
import com.davisuga.clerk4s.model.UpdateUserMetadataRequest
import com.davisuga.clerk4s.model.UpdateUserRequest
import com.davisuga.clerk4s.model.User
import com.davisuga.clerk4s.model.VerifyPassword200Response
import com.davisuga.clerk4s.model.VerifyPasswordRequest
import com.davisuga.clerk4s.model.VerifyTOTP200Response
import com.davisuga.clerk4s.model.VerifyTOTPRequest
import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object UsersApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new UsersApi(baseUrl)
}

class UsersApi(baseUrl: String) {

  /**
   * Marks the given user as banned, which means that all their sessions are revoked and they are not allowed to sign in again.
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 402 : ClerkErrors (Payment required)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to ban
   */
  def banUser(bearerToken: String)(userId: String
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/${userId}/ban")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[User])

  /**
   * Creates a new user. Your user management settings determine how you should setup your user model.  Any email address and phone number created using this method will be marked as verified.  Note: If you are performing a migration, check out our guide on [zero downtime migrations](https://clerk.com/docs/deployments/import-users).  A rate limit rule of 20 requests per 10 seconds is applied to this endpoint.
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param createUserRequest 
   */
  def createUser(bearerToken: String)(createUserRequest: CreateUserRequest
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(createUserRequest)
      .response(asJson[User])

  /**
   * Delete the specified user
   * 
   * Expected answers:
   *   code 200 : DeletedObject (Deleted Object)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to delete
   */
  def deleteUser(bearerToken: String)(userId: String
): Request[Either[ResponseException[String, Exception], DeletedObject], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/users/${userId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DeletedObject])

  /**
   * Disable all of a user's MFA methods (e.g. OTP sent via SMS, TOTP on their authenticator app) at once.
   * 
   * Expected answers:
   *   code 200 : DisableMFA200Response (Successful operation.)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 500 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user whose MFA methods are to be disabled
   */
  def disableMFA(bearerToken: String)(userId: String
): Request[Either[ResponseException[String, Exception], DisableMFA200Response], Any] =
    basicRequest
      .method(Method.DELETE, uri"$baseUrl/users/${userId}/mfa")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[DisableMFA200Response])

  /**
   * Fetch the corresponding OAuth access token for a user that has previously authenticated with a particular OAuth provider. For OAuth 2.0, if the access token has expired and we have a corresponding refresh token, the access token will be refreshed transparently the new one will be returned.
   * 
   * Expected answers:
   *   code 200 : Seq[GetOAuthAccessToken200ResponseInner] (The OAuth access token of the user, if any.)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user for which to retrieve the OAuth access token
   * @param provider The ID of the OAuth provider (e.g. `oauth_google`)
   */
  def getOAuthAccessToken(bearerToken: String)(userId: String, provider: String
): Request[Either[ResponseException[String, Exception], Seq[GetOAuthAccessToken200ResponseInner]], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/${userId}/oauth_access_tokens/${provider}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Seq[GetOAuthAccessToken200ResponseInner]])

  /**
   * Retrieve the details of a user
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 404 : ClerkErrors (Resource not found)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to retrieve
   */
  def getUser(bearerToken: String)(userId: String
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/${userId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[User])

  /**
   * Returns a list of all users. The users are returned sorted by creation date, with the newest users appearing first.
   * 
   * Expected answers:
   *   code 200 : Seq[User] (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param emailAddress Returns users with the specified email addresses. Accepts up to 100 email addresses. Any email addresses not found are ignored.
   * @param phoneNumber Returns users with the specified phone numbers. Accepts up to 100 phone numbers. Any phone numbers not found are ignored.
   * @param externalId Returns users with the specified external ids. For each external id, the `+` and `-` can be prepended to the id, which denote whether the respective external id should be included or excluded from the result set. Accepts up to 100 external ids. Any external ids not found are ignored.
   * @param username Returns users with the specified usernames. Accepts up to 100 usernames. Any usernames not found are ignored.
   * @param web3Wallet Returns users with the specified web3 wallet addresses. Accepts up to 100 web3 wallet addresses. Any web3 wallet addressed not found are ignored.
   * @param userId Returns users with the user ids specified. For each user id, the `+` and `-` can be prepended to the id, which denote whether the respective user id should be included or excluded from the result set. Accepts up to 100 user ids. Any user ids not found are ignored.
   * @param organizationId Returns users that have memberships to the given organizations. For each organization id, the `+` and `-` can be prepended to the id, which denote whether the respective organization should be included or excluded from the result set. Accepts up to 100 organization ids.
   * @param query Returns users that match the given query. For possible matches, we check the email addresses, phone numbers, usernames, web3 wallets, user ids, first and last names. The query value doesn't need to match the exact value you are looking for, it is capable of partial matches as well.
   * @param limit Applies a limit to the number of results returned. Can be used for paginating the results together with `offset`. Must be an integer greater than zero and less than 500. By default, if not supplied, a limit of 10 is used.
   * @param offset Skip the first `offset` results when paginating. Needs to be an integer greater or equal to zero. To be used in conjunction with `limit`.
   * @param orderBy Allows to return users in a particular order. At the moment, you can order the returned users either by their `created_at`,`updated_at`,`email_address`,`web3wallet`,`first_name`,`last_name`,`phone_number`,`username`. In order to specify the direction, you can use the `+/-` symbols prepended in the property to order by. For example, if you want users to be returned in descending order according to their `created_at` property, you can use `-created_at`. If you don't use `+` or `-`, then `+` is implied.We only support one `order_by` parameter, and if multiple `order_by` parameters are provided, we will only keep the first one. For example, if you pass `order_by=username&order_by=created_at`, we will consider only the first `order_by` parameter, which is `username`. The `created_at` parameter will be ignored in this case.
   */
  def getUserList(bearerToken: String)(emailAddress: Seq[String], phoneNumber: Seq[String], externalId: Seq[String], username: Seq[String], web3Wallet: Seq[String], userId: Seq[String], organizationId: Seq[String], query: Option[String] = None, limit: Option[Double] = None, offset: Option[Double] = None, orderBy: Option[String] = None
): Request[Either[ResponseException[String, Exception], Seq[User]], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users?email_address=${ emailAddress }&phone_number=${ phoneNumber }&external_id=${ externalId }&username=${ username }&web3_wallet=${ web3Wallet }&user_id=${ userId }&organization_id=${ organizationId }&query=${ query }&limit=${ limit }&offset=${ offset }&order_by=${ orderBy }")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[Seq[User]])

  /**
   * Returns a total count of all users that match the given filtering criteria.
   * 
   * Expected answers:
   *   code 200 : TotalCount (Success)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param emailAddress Counts users with the specified email addresses. Accepts up to 100 email addresses. Any email addresses not found are ignored.
   * @param phoneNumber Counts users with the specified phone numbers. Accepts up to 100 phone numbers. Any phone numbers not found are ignored.
   * @param externalId Counts users with the specified external ids. Accepts up to 100 external ids. Any external ids not found are ignored.
   * @param username Counts users with the specified usernames. Accepts up to 100 usernames. Any usernames not found are ignored.
   * @param web3Wallet Counts users with the specified web3 wallet addresses. Accepts up to 100 web3 wallet addresses. Any web3 wallet addressed not found are ignored.
   * @param userId Counts users with the user ids specified. Accepts up to 100 user ids. Any user ids not found are ignored.
   * @param query Counts users that match the given query. For possible matches, we check the email addresses, phone numbers, usernames, web3 wallets, user ids, first and last names. The query value doesn't need to match the exact value you are looking for, it is capable of partial matches as well.
   */
  def getUsersCount(bearerToken: String)(emailAddress: Seq[String], phoneNumber: Seq[String], externalId: Seq[String], username: Seq[String], web3Wallet: Seq[String], userId: Seq[String], query: Option[String] = None
): Request[Either[ResponseException[String, Exception], TotalCount], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/count?email_address=${ emailAddress }&phone_number=${ phoneNumber }&external_id=${ externalId }&username=${ username }&web3_wallet=${ web3Wallet }&user_id=${ userId }&query=${ query }")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[TotalCount])

  /**
   * Update a user's profile image
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to update the profile image for
   * @param file 
   */
  def setUserProfileImage(bearerToken: String)(userId: String, file: Option[File] = None
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/${userId}/profile_image")
      .contentType("multipart/form-data")
      .auth.bearer(bearerToken)
      .multipartBody(Seq(
                file.map(multipartFile("file", _))

      ).flatten)
      .response(asJson[User])

  /**
   * Removes the ban mark from the given user.
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 402 : ClerkErrors (Payment required)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to unban
   */
  def unbanUser(bearerToken: String)(userId: String
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/${userId}/unban")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[User])

  /**
   * Update a user's attributes.  You can set the user's primary contact identifiers (email address and phone numbers) by updating the `primary_email_address_id` and `primary_phone_number_id` attributes respectively. Both IDs should correspond to verified identifications that belong to the user.  You can remove a user's username by setting the username attribute to null or the blank string \"\". This is a destructive action; the identification will be deleted forever. Usernames can be removed only if they are optional in your instance settings and there's at least one other identifier which can be used for authentication.  This endpoint allows changing a user's password. When passing the `password` parameter directly you have two further options. You can ignore the password policy checks for your instance by setting the `skip_password_checks` parameter to `true`. You can also choose to sign the user out of all their active sessions on any device once the password is updated. Just set `sign_out_of_other_sessions` to `true`.
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user to update
   * @param updateUserRequest 
   */
  def updateUser(bearerToken: String)(userId: String, updateUserRequest: UpdateUserRequest
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/users/${userId}")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateUserRequest)
      .response(asJson[User])

  /**
   * Update a user's metadata attributes by merging existing values with the provided parameters.  This endpoint behaves differently than the *Update a user* endpoint. Metadata values will not be replaced entirely. Instead, a deep merge will be performed. Deep means that any nested JSON objects will be merged as well.  You can remove metadata keys at any level by setting their value to `null`.
   * 
   * Expected answers:
   *   code 200 : User (Success)
   *   code 400 : ClerkErrors (Request was not successful)
   *   code 401 : ClerkErrors (Authentication invalid)
   *   code 404 : ClerkErrors (Resource not found)
   *   code 422 : ClerkErrors (Invalid request parameters)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user whose metadata will be updated and merged
   * @param updateUserMetadataRequest 
   */
  def updateUserMetadata(bearerToken: String)(userId: String, updateUserMetadataRequest: Option[UpdateUserMetadataRequest] = None
): Request[Either[ResponseException[String, Exception], User], Any] =
    basicRequest
      .method(Method.PATCH, uri"$baseUrl/users/${userId}/metadata")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(updateUserMetadataRequest)
      .response(asJson[User])

  /**
   * Retrieve a paginated list of the user's organization memberships
   * 
   * Expected answers:
   *   code 200 : OrganizationMemberships (A list of organization memberships)
   *   code 403 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user whose organization memberships we want to retrieve
   * @param limit Applies a limit to the number of results returned. Can be used for paginating the results together with `offset`. Must be an integer greater than zero and less than 500. By default, if not supplied, a limit of 10 is used.
   * @param offset Skip the first `offset` results when paginating. Needs to be an integer greater or equal to zero. To be used in conjunction with `limit`.
   */
  def usersGetOrganizationMemberships(bearerToken: String)(userId: String, limit: Option[Double] = None, offset: Option[Double] = None
): Request[Either[ResponseException[String, Exception], OrganizationMemberships], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/users/${userId}/organization_memberships?limit=${ limit }&offset=${ offset }")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .response(asJson[OrganizationMemberships])

  /**
   * Check that the user's password matches the supplied input. Useful for custom auth flows and re-verification.
   * 
   * Expected answers:
   *   code 200 : VerifyPassword200Response (The provided password was correct.)
   *   code 400 :  (The user does not have a password set.)
   *   code 404 :  (The user does not exist.)
   *   code 422 :  (The provided password was incorrect.)
   *   code 500 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user for whom to verify the password
   * @param verifyPasswordRequest 
   */
  def verifyPassword(bearerToken: String)(userId: String, verifyPasswordRequest: Option[VerifyPasswordRequest] = None
): Request[Either[ResponseException[String, Exception], VerifyPassword200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/${userId}/verify_password")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(verifyPasswordRequest)
      .response(asJson[VerifyPassword200Response])

  /**
   * Verify that the provided TOTP or backup code is valid for the user. Verifying a backup code will result it in being consumed (i.e. it will become invalid). Useful for custom auth flows and re-verification.
   * 
   * Expected answers:
   *   code 200 : VerifyTOTP200Response (The provided TOTP or backup code was correct.)
   *   code 400 :  (The user does not have TOTP configured for their account.)
   *   code 404 :  (The user does not exist.)
   *   code 422 :  (The provided TOTP or backup code was incorrect.)
   *   code 500 : ClerkErrors (Request was not successful)
   * 
   * Available security schemes:
   *   bearerAuth (http)
   * 
   * @param userId The ID of the user for whom to verify the TOTP
   * @param verifyTOTPRequest 
   */
  def verifyTOTP(bearerToken: String)(userId: String, verifyTOTPRequest: Option[VerifyTOTPRequest] = None
): Request[Either[ResponseException[String, Exception], VerifyTOTP200Response], Any] =
    basicRequest
      .method(Method.POST, uri"$baseUrl/users/${userId}/verify_totp")
      .contentType("application/json")
      .auth.bearer(bearerToken)
      .body(verifyTOTPRequest)
      .response(asJson[VerifyTOTP200Response])

}
