package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;


@JsonTypeName("AssetKey1")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey1 extends AssetKey  {
  
  private @Valid String currencyCode;
  private @Valid Double modifiedDuration;

  /**
   * ISO 4217
   **/
  public AssetKey1 currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  
  @ApiModelProperty(example = "CHF", required = true, value = "ISO 4217")
  @JsonProperty("currencyCode")
  @NotNull
  public String getCurrencyCode() {
    return currencyCode;
  }

  @JsonProperty("currencyCode")
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

/**
   **/
  public AssetKey1 modifiedDuration(Double modifiedDuration) {
    this.modifiedDuration = modifiedDuration;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("modifiedDuration")
  @NotNull
  public Double getModifiedDuration() {
    return modifiedDuration;
  }

  @JsonProperty("modifiedDuration")
  public void setModifiedDuration(Double modifiedDuration) {
    this.modifiedDuration = modifiedDuration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetKey1 assetKey1 = (AssetKey1) o;
    return Objects.equals(this.currencyCode, assetKey1.currencyCode) &&
           Objects.equals(this.modifiedDuration, assetKey1.modifiedDuration) &&
           super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, modifiedDuration, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey1 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    modifiedDuration: ").append(toIndentedString(modifiedDuration)).append("\n");
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

