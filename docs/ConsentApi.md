# ConsentApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteConsentWithID**](ConsentApi.md#deleteConsentWithID) | **DELETE** /consents/{consent-id} | Delete consent
[**getAllConsets**](ConsentApi.md#getAllConsets) | **GET** /consents | Get Consent
[**getConsent**](ConsentApi.md#getConsent) | **GET** /consents/{consent-id} | Get Consent Request
[**getConsentStatus**](ConsentApi.md#getConsentStatus) | **GET** /consents/{consent-id}/status | Consent status request
[**postConsent**](ConsentApi.md#postConsent) | **POST** /consents | Create consent


<a name="deleteConsentWithID"></a>
# **deleteConsentWithID**
> deleteConsentWithID(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Delete consent

The TPP can delete an account information consent object if needed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

ConsentApi apiInstance = new ConsentApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an Account Information Consent Request
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the http request between PSU and TPP, if available.
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available.
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available.
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.
String psUAcceptCharset = "psUAcceptCharset_example"; // String | 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE 
String psUDeviceID = "psUDeviceID_example"; // String | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available.
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP.
try {
    apiInstance.deleteConsentWithID(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#deleteConsentWithID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| ID of the corresponding consent object as returned by an Account Information Consent Request |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **psUUserAgent** | **String**| The forwarded Agent header field of the http request between PSU and TPP, if available. | [optional]
 **psUIPPort** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available. | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available. | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. | [optional]
 **psUAcceptCharset** | **String**|  | [optional]
 **psUAcceptEncoding** | **String**|  | [optional]
 **psUAcceptLanguage** | **String**|  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **String**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP. | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllConsets"></a>
# **getAllConsets**
> InlineResponse2004 getAllConsets(xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Get Consent

Return valid Consent Id for PSU-TPP consent.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

ConsentApi apiInstance = new ConsentApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the http request between PSU and TPP, if available.
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available.
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available.
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.
String psUAcceptCharset = "psUAcceptCharset_example"; // String | 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE 
String psUDeviceID = "psUDeviceID_example"; // String | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available.
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP.
try {
    InlineResponse2004 result = apiInstance.getAllConsets(xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#getAllConsets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **psUUserAgent** | **String**| The forwarded Agent header field of the http request between PSU and TPP, if available. | [optional]
 **psUIPPort** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available. | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available. | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. | [optional]
 **psUAcceptCharset** | **String**|  | [optional]
 **psUAcceptEncoding** | **String**|  | [optional]
 **psUAcceptLanguage** | **String**|  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **String**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsent"></a>
# **getConsent**
> InlineResponse2005 getConsent(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Get Consent Request

Reads the exact definition of the given consent resource {consent-id}

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

ConsentApi apiInstance = new ConsentApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an Account Information Consent Request
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the http request between PSU and TPP, if available.
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available.
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available.
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.
String psUAcceptCharset = "psUAcceptCharset_example"; // String | 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE 
String psUDeviceID = "psUDeviceID_example"; // String | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available.
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP.
try {
    InlineResponse2005 result = apiInstance.getConsent(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#getConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| ID of the corresponding consent object as returned by an Account Information Consent Request |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **psUUserAgent** | **String**| The forwarded Agent header field of the http request between PSU and TPP, if available. | [optional]
 **psUIPPort** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available. | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available. | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. | [optional]
 **psUAcceptCharset** | **String**|  | [optional]
 **psUAcceptEncoding** | **String**|  | [optional]
 **psUAcceptLanguage** | **String**|  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **String**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP. | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getConsentStatus"></a>
# **getConsentStatus**
> InlineResponse2006 getConsentStatus(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Consent status request

Reads the transaction status of the addressed consent resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

ConsentApi apiInstance = new ConsentApi();
String consentId = "consentId_example"; // String | ID of the corresponding consent object as returned by an Account Information Consent Request
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the http request between PSU and TPP, if available.
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available.
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available.
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.
String psUAcceptCharset = "psUAcceptCharset_example"; // String | 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE 
String psUDeviceID = "psUDeviceID_example"; // String | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available.
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP.
try {
    InlineResponse2006 result = apiInstance.getConsentStatus(consentId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#getConsentStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consentId** | **String**| ID of the corresponding consent object as returned by an Account Information Consent Request |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **psUUserAgent** | **String**| The forwarded Agent header field of the http request between PSU and TPP, if available. | [optional]
 **psUIPPort** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available. | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available. | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. | [optional]
 **psUAcceptCharset** | **String**|  | [optional]
 **psUAcceptEncoding** | **String**|  | [optional]
 **psUAcceptLanguage** | **String**|  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **String**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. | [optional]
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP. | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postConsent"></a>
# **postConsent**
> InlineResponse201 postConsent(xRequestID, tpPRedirectURI, psUIPAddress, body, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID)

Create consent

This method create a consent resource, defining access rights to dedicated accounts of a given PSU. Only access rights are inserted without mentioning the addressed account. The relation to accounts is then handled afterwards between PSU and BDSK.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ConsentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

ConsentApi apiInstance = new ConsentApi();
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String tpPRedirectURI = "tpPRedirectURI_example"; // String | URI of the TPP, where the transaction flow shall be redirected to after a Redirect
String psUIPAddress = "psUIPAddress_example"; // String | The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP.
ConsentRequestBody body = new ConsentRequestBody(); // ConsentRequestBody | 
String psUUserAgent = "psUUserAgent_example"; // String | The forwarded Agent header field of the http request between PSU and TPP, if available.
String psUIPPort = "psUIPPort_example"; // String | The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available.
String psUGeoLocation = "psUGeoLocation_example"; // String | The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available.
String psUAccept = "psUAccept_example"; // String | The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available.
String psUAcceptCharset = "psUAcceptCharset_example"; // String | 
String psUAcceptEncoding = "psUAcceptEncoding_example"; // String | 
String psUAcceptLanguage = "psUAcceptLanguage_example"; // String | 
String psUHttpMethod = "psUHttpMethod_example"; // String | HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE 
String psUDeviceID = "psUDeviceID_example"; // String | UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available.
try {
    InlineResponse201 result = apiInstance.postConsent(xRequestID, tpPRedirectURI, psUIPAddress, body, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConsentApi#postConsent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **tpPRedirectURI** | **String**| URI of the TPP, where the transaction flow shall be redirected to after a Redirect |
 **psUIPAddress** | **String**| The forwarded IP Address header field consists of the corresponding HTTP request IP Address field between PSU and TPP. |
 **body** | [**ConsentRequestBody**](ConsentRequestBody.md)|  |
 **psUUserAgent** | **String**| The forwarded Agent header field of the http request between PSU and TPP, if available. | [optional]
 **psUIPPort** | **String**| The forwarded IP Address header field consists of the corresponding http request IP Address field between PSU and TPP, if available. | [optional]
 **psUGeoLocation** | **String**| The forwarded Geo Location header field of the corresponding http request between PSU and TPP if available. | [optional]
 **psUAccept** | **String**| The forwarded IP Accept header fields consist of the corresponding HTTP request Accept header fields between PSU and TPP, if available. | [optional]
 **psUAcceptCharset** | **String**|  | [optional]
 **psUAcceptEncoding** | **String**|  | [optional]
 **psUAcceptLanguage** | **String**|  | [optional]
 **psUHttpMethod** | **String**| HTTP method used at the PSU – TPP interface, if available. Valid values are\\: * GET * POST * PUT * PATCH * DELETE  | [optional] [enum: GET, POST, PUT, PATCH, DELETE]
 **psUDeviceID** | **String**| UUID (Universally Unique Identifier) for a device, which is used by the PSU, if available. | [optional]

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

