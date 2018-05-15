package models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PetModel {
    private int id;
    private String name;
    private String status;
    private CategoryModel category;
    private List<String> photoUrls;
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


}
