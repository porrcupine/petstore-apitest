package models.pet;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class PetModel {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private String status;
    @JsonProperty("category")
    private CategoryModel category;
    @JsonProperty("photoUrls")
    private List<String> photoUrls;
    @JsonProperty("tags")
    private ItemTagsModel tags;

    public PetModel() {
    }

    public PetModel(int id, String name, String status, CategoryModel category, List<String> photoUrls, ItemTagsModel tags) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.category = category;
        this.photoUrls = photoUrls;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "PetModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", category=" + category +
                ", photoUrls=" + photoUrls +
                ", tags=" + tags +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetModel petModel = (PetModel) o;
        return id == petModel.id &&
                Objects.equals(name, petModel.name) &&
                Objects.equals(status, petModel.status) &&
                Objects.equals(category, petModel.category) &&
                Objects.equals(photoUrls, petModel.photoUrls) &&
                Objects.equals(tags, petModel.tags);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, status, category, photoUrls, tags);
    }
}
