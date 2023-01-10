package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;


@JsonTypeName("AssetKey5")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey5 extends AssetKey  {
  
  private @Valid String symbol;

  /**
   **/
  public AssetKey5 symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("symbol")
  @NotNull
  public String getSymbol() {
    return symbol;
  }

  @JsonProperty("symbol")
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetKey5 assetKey5 = (AssetKey5) o;
    return Objects.equals(this.symbol, assetKey5.symbol) &&
           super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey5 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

