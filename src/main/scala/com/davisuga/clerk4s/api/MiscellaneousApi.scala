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

import com.davisuga.clerk4s.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object MiscellaneousApi {

def apply(baseUrl: String = "https://api.clerk.com/v1") = new MiscellaneousApi(baseUrl)
}

class MiscellaneousApi(baseUrl: String) {

  /**
   * The Clerk interstitial endpoint serves an html page that loads clerk.js in order to check the user's authentication state. It is used by Clerk SDKs when the user's authentication state cannot be immediately determined.
   * 
   * Expected answers:
   *   code 200 :  (The interstitial page markup)
   *   code 400 :  (A required query parameter is missing)
   * 
   * @param frontendApi The Frontend API key of your instance
   * @param publishableKey The publishable key of your instance
   */
  def getPublicInterstitial(frontendApi: Option[String] = None, publishableKey: Option[String] = None
): Request[Either[ResponseException[String, Exception], Unit], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/public/interstitial?frontendApi=${ frontendApi }&publishable_key=${ publishableKey }")
      .contentType("application/json")
      .response(asJson[Unit])

}
