# AccountApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountByAccountId**](AccountApi.md#getAccountByAccountId) | **GET** /accounts/{account-id} | Read Account Details
[**getAccounts**](AccountApi.md#getAccounts) | **GET** /accounts | Read account list
[**getBalanceForAccountByAccountId**](AccountApi.md#getBalanceForAccountByAccountId) | **GET** /accounts/{account-id}/balances | Read Balance
[**getTransactionsForAccountByAccountId**](AccountApi.md#getTransactionsForAccountByAccountId) | **GET** /accounts/{account-id}/transactions | Read Transaction List


<a name="getAccountByAccountId"></a>
# **getAccountByAccountId**
> InlineResponse2001 getAccountByAccountId(accountId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Read Account Details

Reads details about the addressed account. It is assumed that a consent of the PSU to this access is already given and stored on the BDSK system. The addressed details of this account depends then on the stored consent addressed by the OAuth2 access token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | The account-id is retrieved by using a \"Read Account List\" call. The account-id is the \"resourceId\" attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent.
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
    InlineResponse2001 result = apiInstance.getAccountByAccountId(accountId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccountByAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| The account-id is retrieved by using a \&quot;Read Account List\&quot; call. The account-id is the \&quot;resourceId\&quot; attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent. |
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> InlineResponse200 getAccounts(xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Read account list

Read the list of all accessible accounts relative to a granted consent. It is assumed that a consent of the PSU to this access is already given and stored on the BDSK system. The addressed list of accounts depends then on the PSU ID and OAuth2 access token. Returns all identifiers of the accounts, to which an account access has been granted to through the /consents endpoint by the PSU. In addition, relevant information about the accounts and hyperlinks to corresponding account information resources are provided if a related consent has been already granted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
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
    InlineResponse200 result = apiInstance.getAccounts(xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccounts");
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

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBalanceForAccountByAccountId"></a>
# **getBalanceForAccountByAccountId**
> InlineResponse2002 getBalanceForAccountByAccountId(accountId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Read Balance

Reads the balance list for a given account addressed by \&quot;account-id\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | The account-id is retrieved by using a \"Read Account List\" call. The account-id is the \"resourceId\" attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent.
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
    InlineResponse2002 result = apiInstance.getBalanceForAccountByAccountId(accountId, xRequestID, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getBalanceForAccountByAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| The account-id is retrieved by using a \&quot;Read Account List\&quot; call. The account-id is the \&quot;resourceId\&quot; attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent. |
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

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionsForAccountByAccountId"></a>
# **getTransactionsForAccountByAccountId**
> InlineResponse2003 getTransactionsForAccountByAccountId(accountId, xRequestID, dateFrom, bookingStatus, dateTo, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress)

Read Transaction List

Read transaction lists of a given account аddressed by \&quot;account-id\&quot;, depending on the steering parameter \&quot;bookingStatus\&quot; and the attributes \&quot;dateFrom\&quot; and \&quot;dateTo\&quot;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AccountApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: api-key-1
ApiKeyAuth api-key-1 = (ApiKeyAuth) defaultClient.getAuthentication("api-key-1");
api-key-1.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api-key-1.setApiKeyPrefix("Token");

AccountApi apiInstance = new AccountApi();
String accountId = "accountId_example"; // String | The account-id is retrieved by using a \"Read Account List\" call. The account-id is the \"resourceId\" attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent.
UUID xRequestID = new UUID(); // UUID | ID of the request, unique to the call, as determined by the initiating party.
String dateFrom = "dateFrom_example"; // String | Starting date (inclusive the date dateFrom) of the transaction list.
String bookingStatus = "bookingStatus_example"; // String | Permitted codes are “booked”, “pending” and “both”
String dateTo = "dateTo_example"; // String | End date (inclusive the data dateTo) of the transaction list, default is now if not given.
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
    InlineResponse2003 result = apiInstance.getTransactionsForAccountByAccountId(accountId, xRequestID, dateFrom, bookingStatus, dateTo, psUUserAgent, psUIPPort, psUGeoLocation, psUAccept, psUAcceptCharset, psUAcceptEncoding, psUAcceptLanguage, psUHttpMethod, psUDeviceID, psUIPAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getTransactionsForAccountByAccountId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| The account-id is retrieved by using a \&quot;Read Account List\&quot; call. The account-id is the \&quot;resourceId\&quot; attribute of the account structure. Its value is constant at least throughout the lifecycle of a given consent. |
 **xRequestID** | [**UUID**](.md)| ID of the request, unique to the call, as determined by the initiating party. |
 **dateFrom** | **String**| Starting date (inclusive the date dateFrom) of the transaction list. |
 **bookingStatus** | **String**| Permitted codes are “booked”, “pending” and “both” |
 **dateTo** | **String**| End date (inclusive the data dateTo) of the transaction list, default is now if not given. | [optional]
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

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[OAuth2](../README.md#OAuth2), [api-key-1](../README.md#api-key-1)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

