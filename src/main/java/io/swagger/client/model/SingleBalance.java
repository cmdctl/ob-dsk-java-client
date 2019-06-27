/*
 * AIS API
 * Account Information Service Provider API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apigate@dskbank.bg
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Amount;
import java.io.IOException;

/**
 * SingleBalance
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-27T12:18:16.648Z")
public class SingleBalance {
  @SerializedName("balanceType")
  private String balanceType = null;

  @SerializedName("balanceAmount")
  private Amount balanceAmount = null;

  public SingleBalance balanceType(String balanceType) {
    this.balanceType = balanceType;
    return this;
  }

   /**
   * Get balanceType
   * @return balanceType
  **/
  @ApiModelProperty(value = "")
  public String getBalanceType() {
    return balanceType;
  }

  public void setBalanceType(String balanceType) {
    this.balanceType = balanceType;
  }

  public SingleBalance balanceAmount(Amount balanceAmount) {
    this.balanceAmount = balanceAmount;
    return this;
  }

   /**
   * Get balanceAmount
   * @return balanceAmount
  **/
  @ApiModelProperty(required = true, value = "")
  public Amount getBalanceAmount() {
    return balanceAmount;
  }

  public void setBalanceAmount(Amount balanceAmount) {
    this.balanceAmount = balanceAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleBalance singleBalance = (SingleBalance) o;
    return Objects.equals(this.balanceType, singleBalance.balanceType) &&
        Objects.equals(this.balanceAmount, singleBalance.balanceAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceType, balanceAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleBalance {\n");
    
    sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
    sb.append("    balanceAmount: ").append(toIndentedString(balanceAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
