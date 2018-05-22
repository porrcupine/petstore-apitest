package models.pet;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by SK on 2018-05-14
 */
@Getter
@Setter
public class ItemTagsModel {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
}
