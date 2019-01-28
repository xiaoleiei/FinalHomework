package com.bytedance.android.lesson.restapi.solution.bean;

import java.util.Collection;
import java.util.List;
/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json

    private List<String> breeds;
    private String id;
    private String url;
    private List<Categories> categories;

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }


    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Categories> getCategories() {
        return categories;
    }


    public class Categories {

        private int id;
        private String name;

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }


}
