package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;


@JsonTypeName("AssetKey4")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey4 extends AssetKey  {
  
  private @Valid Double contractSize;
  private @Valid String longCurrencyCode;
  private @Valid String shortCurrencyCode;

  /**
   **/
  public AssetKey4 contractSize(Double contractSize) {
    this.contractSize = contractSize;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("contractSize")
  @NotNull
  public Double getContractSize() {
    return contractSize;
  }

  @JsonProperty("contractSize")
  public void setContractSize(Double contractSize) {
    this.contractSize = contractSize;
  }

/**
   * ISO 4217
   **/
  public AssetKey4 longCurrencyCode(String longCurrencyCode) {
    this.longCurrencyCode = longCurrencyCode;
    return this;
  }

  
  @ApiModelProperty(example = "CHF", required = true, value = "ISO 4217")
  @JsonProperty("longCurrencyCode")
  @NotNull
  public String getLongCurrencyCode() {
    return longCurrencyCode;
  }

  @JsonProperty("longCurrencyCode")
  public void setLongCurrencyCode(String longCurrencyCode) {
    this.longCurrencyCode = longCurrencyCode;
  }

/**
   * ISO 4217
   **/
  public AssetKey4 shortCurrencyCode(String shortCurrencyCode) {
    this.shortCurrencyCode = shortCurrencyCode;
    return this;
  }

  
  @ApiModelProperty(example = "CHF", required = true, value = "ISO 4217")
  @JsonProperty("shortCurrencyCode")
  @NotNull
  public String getShortCurrencyCode() {
    return shortCurrencyCode;
  }

  @JsonProperty("shortCurrencyCode")
  public void setShortCurrencyCode(String shortCurrencyCode) {
    this.shortCurrencyCode = shortCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetKey4 assetKey4 = (AssetKey4) o;
    return Objects.equals(this.contractSize, assetKey4.contractSize) &&
           Objects.equals(this.longCurrencyCode, assetKey4.longCurrencyCode) &&
           Objects.equals(this.shortCurrencyCode, assetKey4.shortCurrencyCode) &&
           super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractSize, longCurrencyCode, shortCurrencyCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey4 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contractSize: ").append(toIndentedString(contractSize)).append("\n");
    sb.append("    longCurrencyCode: ").append(toIndentedString(longCurrencyCode)).append("\n");
    sb.append("    shortCurrencyCode: ").append(toIndentedString(shortCurrencyCode)).append("\n");
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

