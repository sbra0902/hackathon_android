package main.java.kaufland.com.business.model;


import java.util.ArrayList;
import java.util.List;

public class VisionResultModel
    {
        public VisionResultModel()
        {
            recipeName = new ArrayList<>();
            recipeContent = new ArrayList<>();
            pictureInput = "";
        }

        public List<String> recipeName;
        
        public List<Object/* dynamic  ?? */> recipeContent;

        public String pictureInput;

        public List<String> getRecipeName() {
            return recipeName;
        }

        public void setRecipeName(List<String> recipeName) {
            this.recipeName = recipeName;
        }

        public List<Object> getRecipeContent() {
            return recipeContent;
        }

        public void setRecipeContent(List<Object> recipeContent) {
            this.recipeContent = recipeContent;
        }

        public String getPictureInput() {
            return pictureInput;
        }

        public void setPictureInput(String pictureInput) {
            this.pictureInput = pictureInput;
        }
    }
