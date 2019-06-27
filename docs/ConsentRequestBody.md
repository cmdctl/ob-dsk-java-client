
# ConsentRequestBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**ConsentRequestBodyAccess**](ConsentRequestBodyAccess.md) |  | 
**recurringIndicator** | **String** | TRUE, if the consent is for recurring access to the account data. FALSE, if the consent is for one access to the account data. | 
**validUntil** | [**LocalDate**](LocalDate.md) | This parameter is requesting a valid until date for the requested consent. Max validity is 90 day. If the consent is for one access to the account data value is current date.The content is the local BDSK date in ISODate Format, e.g. 2018-11-25 | 
**frequencyPerDay** | **String** | This field indicates the requested maximum frequency for an access per day. For a one-off access, this attribute is set to “1”. Max value is “4”. | 



