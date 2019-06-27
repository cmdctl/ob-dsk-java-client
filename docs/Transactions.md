
# Transactions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionId** | **String** | Can be used as access-id in the API, where more details on an transaction is offered. |  [optional]
**bookingDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**valueDate** | [**LocalDate**](LocalDate.md) |  |  [optional]
**transactionAmount** | [**Amount**](Amount.md) |  | 
**creditorName** | **String** | Name of the creditor if a “Debited” transaction |  [optional]
**creditorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**debtorName** | **String** | Name of the debtor if a “Credited” transaction |  [optional]
**debtorAccount** | [**AccountReference**](AccountReference.md) |  |  [optional]
**remittanceInformationUnstructured** | **String** |  |  [optional]



