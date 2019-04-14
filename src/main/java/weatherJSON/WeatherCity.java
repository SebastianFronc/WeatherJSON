package weatherJSON;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherCity {
    private final Integer id;
    private final String name;
    private final String country;
    private final Coordinates  coordinates;

    @JsonCreator
    public WeatherCity(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("country") String country,
            @JsonProperty("coord") Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.coordinates = coordinates;
    }
}
