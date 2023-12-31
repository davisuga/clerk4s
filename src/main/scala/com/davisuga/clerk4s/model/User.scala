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


case class User(
  id: Option[String] = None,
  /* String representing the object's type. Objects of the same type share the same value.  */
  `object`: Option[UserEnums.`Object`] = None,
  externalId: Option[String] = None,
  primaryEmailAddressId: Option[String] = None,
  primaryPhoneNumberId: Option[String] = None,
  primaryWeb3WalletId: Option[String] = None,
  username: Option[String] = None,
  firstName: Option[String] = None,
  lastName: Option[String] = None,
  profileImageUrl: Option[String] = None,
  imageUrl: Option[String] = None,
  publicMetadata: Option[Any] = None,
  privateMetadata: Option[Any] = None,
  unsafeMetadata: Option[Any] = None,
  gender: Option[String] = None,
  birthday: Option[String] = None,
  emailAddresses: Option[Seq[EmailAddress]] = None,
  phoneNumbers: Option[Seq[PhoneNumber]] = None,
  web3Wallets: Option[Seq[Web3Wallet]] = None,
  passwordEnabled: Option[Boolean] = None,
  twoFactorEnabled: Option[Boolean] = None,
  totpEnabled: Option[Boolean] = None,
  backupCodeEnabled: Option[Boolean] = None,
  externalAccounts: Option[Seq[Any]] = None,
  samlAccounts: Option[Seq[SAMLAccount]] = None,
  /* Unix timestamp of last sign-in.  */
  lastSignInAt: Option[Long] = None,
  /* Flag to denote whether user is banned or not.  */
  banned: Option[Boolean] = None,
  /* Unix timestamp of last update.  */
  updatedAt: Option[Long] = None,
  /* Unix timestamp of creation.  */
  createdAt: Option[Long] = None,
  /* If enabled, user can delete themselves via FAPI.  */
  deleteSelfEnabled: Option[Boolean] = None,
  /* If enabled, user can create organizations via FAPI.  */
  createOrganizationEnabled: Option[Boolean] = None
)

object UserEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val User = Value("user")
  }

}
