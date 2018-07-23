/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.DurationFieldType;

/**
 * DurationField
 */

public class DurationField {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private DurationFieldType type = null;

  @SerializedName("supported")
  private Boolean supported = null;

  @SerializedName("unitMillis")
  private Long unitMillis = null;

  @SerializedName("precise")
  private Boolean precise = null;

  public DurationField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DurationField type(DurationFieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public DurationFieldType getType() {
    return type;
  }

  public void setType(DurationFieldType type) {
    this.type = type;
  }

  public DurationField supported(Boolean supported) {
    this.supported = supported;
    return this;
  }

   /**
   * Get supported
   * @return supported
  **/
  @ApiModelProperty(value = "")
  public Boolean isSupported() {
    return supported;
  }

  public void setSupported(Boolean supported) {
    this.supported = supported;
  }

  public DurationField unitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
    return this;
  }

   /**
   * Get unitMillis
   * @return unitMillis
  **/
  @ApiModelProperty(value = "")
  public Long getUnitMillis() {
    return unitMillis;
  }

  public void setUnitMillis(Long unitMillis) {
    this.unitMillis = unitMillis;
  }

  public DurationField precise(Boolean precise) {
    this.precise = precise;
    return this;
  }

   /**
   * Get precise
   * @return precise
  **/
  @ApiModelProperty(value = "")
  public Boolean isPrecise() {
    return precise;
  }

  public void setPrecise(Boolean precise) {
    this.precise = precise;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DurationField durationField = (DurationField) o;
    return Objects.equals(this.name, durationField.name) &&
        Objects.equals(this.type, durationField.type) &&
        Objects.equals(this.supported, durationField.supported) &&
        Objects.equals(this.unitMillis, durationField.unitMillis) &&
        Objects.equals(this.precise, durationField.precise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, supported, unitMillis, precise);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DurationField {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    supported: ").append(toIndentedString(supported)).append("\n");
    sb.append("    unitMillis: ").append(toIndentedString(unitMillis)).append("\n");
    sb.append("    precise: ").append(toIndentedString(precise)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
