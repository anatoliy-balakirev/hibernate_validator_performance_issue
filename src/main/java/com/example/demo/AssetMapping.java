package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonTypeName("AssetMapping")
@Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")
public class AssetMapping {
  
  private @Valid AssetKey mainAsset;
  private @Valid List<AssetKey> alternativeIds = new ArrayList<>();

  /**
   **/
  public AssetMapping mainAsset(AssetKey mainAsset) {
    this.mainAsset = mainAsset;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mainAsset")
  public AssetKey getMainAsset() {
    return mainAsset;
  }

  @JsonProperty("mainAsset")
  public void setMainAsset(AssetKey mainAsset) {
    this.mainAsset = mainAsset;
  }

/**
   **/
  public AssetMapping alternativeIds(List<AssetKey> alternativeIds) {
    this.alternativeIds = alternativeIds;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alternativeIds")
  public List<AssetKey> getAlternativeIds() {
    return alternativeIds;
  }

  @JsonProperty("alternativeIds")
  public void setAlternativeIds(List<AssetKey> alternativeIds) {
    this.alternativeIds = alternativeIds;
  }

  public AssetMapping addAlternativeIdsItem(AssetKey alternativeIdsItem) {
    if (this.alternativeIds == null) {
      this.alternativeIds = new ArrayList<>();
    }

    this.alternativeIds.add(alternativeIdsItem);
    return this;
  }

  public AssetMapping removeAlternativeIdsItem(AssetKey alternativeIdsItem) {
    if (alternativeIdsItem != null && this.alternativeIds != null) {
      this.alternativeIds.remove(alternativeIdsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetMapping assetMapping = (AssetMapping) o;
    return Objects.equals(this.mainAsset, assetMapping.mainAsset) &&
           Objects.equals(this.alternativeIds, assetMapping.alternativeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mainAsset, alternativeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetMapping {\n");
    
    sb.append("    mainAsset: ").append(toIndentedString(mainAsset)).append("\n");
    sb.append("    alternativeIds: ").append(toIndentedString(alternativeIds)).append("\n");
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

