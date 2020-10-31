package org.telegram.telegrambots.meta.api.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.meta.api.interfaces.BotApiObject;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * This object represents a point on the map.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location implements BotApiObject {

    private static final String LONGITUDE_FIELD = "longitude";
    private static final String LATITUDE_FIELD = "latitude";

    @JsonProperty(LONGITUDE_FIELD)
    private Double longitude; ///< Longitude as defined by sender
    @JsonProperty(LATITUDE_FIELD)
    private Double latitude; ///< Latitude as defined by sender
}
