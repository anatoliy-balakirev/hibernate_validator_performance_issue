package com.example.demo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;


@JsonTypeName("AssetKey3")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey3 extends AssetKey  {
  

public enum SymbolTypeEnum {

    SYMBOL_1(String.valueOf("SYMBOL_1")), SYMBOL_2(String.valueOf("SYMBOL_2")), SYMBOL_3(String.valueOf("SYMBOL_3")), SYMBOL_4(String.valueOf("SYMBOL_4")), SYMBOL_5(String.valueOf("SYMBOL_5")), SYMBOL_6(String.valueOf("SYMBOL_6"));


    private String value;

    SymbolTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
	public static SymbolTypeEnum fromString(String s) {
        for (SymbolTypeEnum b : SymbolTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
	}
	
    @JsonCreator
    public static SymbolTypeEnum fromValue(String value) {
        for (SymbolTypeEnum b : SymbolTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid SymbolTypeEnum symbolType;
  private @Valid String symbol;

  /**
   **/
  public AssetKey3 symbolType(SymbolTypeEnum symbolType) {
    this.symbolType = symbolType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("symbolType")
  @NotNull
  public SymbolTypeEnum getSymbolType() {
    return symbolType;
  }

  @JsonProperty("symbolType")
  public void setSymbolType(SymbolTypeEnum symbolType) {
    this.symbolType = symbolType;
  }

/**
   **/
  public AssetKey3 symbol(String symbol) {
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
    AssetKey3 assetKey3 = (AssetKey3) o;
    return Objects.equals(this.symbolType, assetKey3.symbolType) &&
           Objects.equals(this.symbol, assetKey3.symbol) &&
           super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbolType, symbol, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey3 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    symbolType: ").append(toIndentedString(symbolType)).append("\n");
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

