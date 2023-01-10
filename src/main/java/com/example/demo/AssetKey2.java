package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;


@JsonTypeName("AssetKey2")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey2 extends AssetKey  {
  
  private @Valid String currencyCode;

  /**
   * ISO 4217
   **/
  public AssetKey2 currencyCode(String currencyCode) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetKey2 assetKey2 = (AssetKey2) o;
    return Objects.equals(this.currencyCode, assetKey2.currencyCode) &&
           super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey2 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
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

