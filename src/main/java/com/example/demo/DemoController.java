package com.example.demo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
public class DemoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @PutMapping(value = "/endpoint_with_validation",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public void endpointWithValidation(@Valid @NotNull @RequestBody final AssetsHolder assetsHolder) {
        LOGGER.info("Got into the controller with validation, amount of elements in the request: {}", assetsHolder.size());
    }

    @PutMapping(value = "/endpoint_with_explicit_validation",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public void endpointWithExplicitValidation(@RequestBody final AssetsHolder assetsHolder) {
        validateNoNulls(assetsHolder);
        LOGGER.info("Got into the controller with explicit validation, amount of elements in the request: {}", assetsHolder.size());
    }

    @PutMapping(value = "/endpoint_without_validation",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public void endpointWithoutValidation(@RequestBody final AssetsHolder assetsHolder) {
        LOGGER.info("Got into the controller without validation, amount of elements in the request: {}", assetsHolder.size());
    }


    public static void validateNoNulls(final AssetsHolder assetsHolder) {
        requireNonNull(assetsHolder, "shopping list alternative ids");
        for (final AssetMapping assetMapping : assetsHolder) {
            validateNoNulls(assetMapping.getMainAsset());
            validateNoNulls(assetMapping.getAlternativeIds());
        }
    }

    public static void validateNoNulls(final List<AssetKey> assetKeys) {
        requireNonNull(assetKeys, "asset keys");
        for (final AssetKey assetKey : assetKeys) {
            validateNoNulls(assetKey);
        }
    }

    public static void validateNoNulls(final AssetKey assetKeyRaw) {
        requireNonNull(assetKeyRaw, "asset key");
        if (assetKeyRaw instanceof AssetKey1 assetKey) {
            requireNonNull(assetKey.getCurrencyCode(), "currency code");
            requireNonNull(assetKey.getModifiedDuration(), "modified duration");
        } else if (assetKeyRaw instanceof AssetKey2 assetKey) {
            requireNonNull(assetKey.getCurrencyCode(), "currency code");
        } else if (assetKeyRaw instanceof AssetKey3 assetKey) {
            requireNonNull(assetKey.getSymbol(), "symbol");
            requireNonNull(assetKey.getSymbolType(), "symbol type");
        } else if (assetKeyRaw instanceof AssetKey4 assetKey) {
            requireNonNull(assetKey.getContractSize(), "contract size");
            requireNonNull(assetKey.getLongCurrencyCode(), "long currency code");
            requireNonNull(assetKey.getShortCurrencyCode(), "short currency code");
        } else if (assetKeyRaw instanceof AssetKey5 assetKey) {
            requireNonNull(assetKey.getSymbol(), "symbol");
        } else if (assetKeyRaw instanceof AssetKey6 assetKey) {
            requireNonNull(assetKey.getCurrencyCode(), "currency code");
        } else if (assetKeyRaw instanceof AssetKey7 assetKey) {
            requireNonNull(assetKey.getSymbol(), "symbol");
        } else if (assetKeyRaw instanceof AssetKey8 assetKey) {
            requireNonNull(assetKey.getName(), "name");
        }
    }

    private static void requireNonNull(final Object value,
                                       final String fieldName) {
        if (value == null) {
            throw new IllegalArgumentException(fieldName + " can't be null");
        }
    }

}