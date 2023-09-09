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


case class BlocklistIdentifier(
  /* String representing the object's type. Objects of the same type share the same value.  */
  `object`: Option[BlocklistIdentifierEnums.`Object`] = None,
  id: Option[String] = None,
  /* An email address, email domain, phone number or web3 wallet.  */
  identifier: Option[String] = None,
  identifierType: Option[BlocklistIdentifierEnums.IdentifierType] = None,
  instanceId: Option[String] = None,
  /* Unix timestamp of creation  */
  createdAt: Option[Long] = None,
  /* Unix timestamp of last update.  */
  updatedAt: Option[Long] = None
)

object BlocklistIdentifierEnums {

  type `Object` = `Object`.Value
  type IdentifierType = IdentifierType.Value
  object `Object` extends Enumeration {
    val BlocklistIdentifier = Value("blocklist_identifier")
  }

  object IdentifierType extends Enumeration {
    val EmailAddress = Value("email_address")
    val PhoneNumber = Value("phone_number")
    val Web3Wallet = Value("web3_wallet")
  }

}