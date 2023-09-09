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


case class Domain(
  `object`: DomainEnums.`Object`,
  id: String,
  name: String,
  isSatellite: Boolean,
  frontendApiUrl: String,
  accountsPortalUrl: String,
  proxyUrl: Option[String] = None,
  developmentOrigin: String,
  cnameTargets: Option[Seq[CNameTarget]] = None
)

object DomainEnums {

  type `Object` = `Object`.Value
  object `Object` extends Enumeration {
    val Domain = Value("domain")
  }

}