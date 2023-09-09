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


case class UpdateSAMLConnectionRequest(
  /* The name of the new SAML Connection */
  name: Option[String] = None,
  /* The domain to use for the new SAML Connection */
  domain: Option[String] = None,
  /* The entity id as provided by the IdP */
  idpEntityId: Option[String] = None,
  /* The SSO url as provided by the IdP */
  idpSsoUrl: Option[String] = None,
  /* The x509 certificated as provided by the IdP */
  idpCertificate: Option[String] = None,
  /* Activate or de-activate the SAML Connection */
  active: Option[Boolean] = None,
  /* Controls whether to update the user's attributes in each sign-in */
  syncUserAttributes: Option[Boolean] = None
)
