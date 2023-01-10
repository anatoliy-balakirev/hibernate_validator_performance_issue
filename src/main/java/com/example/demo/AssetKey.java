package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.Objects;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "keyType", visible = false)
@JsonSubTypes({
  @JsonSubTypes.Type(value = AssetKey1.class, name = "AssetKey1"),
  @JsonSubTypes.Type(value = AssetKey2.class, name = "AssetKey2"),
  @JsonSubTypes.Type(value = AssetKey3.class, name = "AssetKey3"),
  @JsonSubTypes.Type(value = AssetKey4.class, name = "AssetKey4"),
  @JsonSubTypes.Type(value = AssetKey5.class, name = "AssetKey5"),
  @JsonSubTypes.Type(value = AssetKey6.class, name = "AssetKey6"),
  @JsonSubTypes.Type(value = AssetKey7.class, name = "AssetKey7"),
  @JsonSubTypes.Type(value = AssetKey8.class, name = "AssetKey8"),
})


@JsonTypeName("AssetKey")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetKey   {

  private @Valid String id;
  private @Valid String keyType;

  /**
   **/
  public AssetKey id(String id) {
    this.id = id;
    return this;
  }


  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public AssetKey keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }


  @ApiModelProperty(value = "")
  @JsonProperty("keyType")
  public String getKeyType() {
    return keyType;
  }

  @JsonProperty("keyType")
  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetKey assetKey = (AssetKey) o;
    return Objects.equals(this.id, assetKey.id) &&
        Objects.equals(this.keyType, assetKey.keyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, keyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetKey {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
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

