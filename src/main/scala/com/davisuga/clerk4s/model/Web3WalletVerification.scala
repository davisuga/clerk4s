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


case class Web3WalletVerification(
  status: Web3WalletVerificationEnums.Status,
  strategy: Web3WalletVerificationEnums.Strategy,
  nonce: Web3WalletVerificationEnums.Nonce,
  attempts: Option[Int] = None,
  expireAt: Option[Int] = None
)

object Web3WalletVerificationEnums {

  type Status = Status.Value
  type Strategy = Strategy.Value
  type Nonce = Nonce.Value
  object Status extends Enumeration {
    val Verified = Value("verified")
  }

  object Strategy extends Enumeration {
    val Admin = Value("admin")
  }

  object Nonce extends Enumeration {
    val Nonce = Value("nonce")
  }

}
