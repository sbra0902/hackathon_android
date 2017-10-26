package kaufland.com.business.model;


import java.util.ArrayList;
import java.util.List;

import kaufland.com.business.model.Answer;

public class SearchResult {

    public SearchResult() {
        answers = new ArrayList<>();
        related = new ArrayList<>();

        savedItemId = "";
        question = "";
    }

    public List<Answer> answers;

    public List<Answer> related;

    public String savedItemId;

    public String question;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getRelated() {
        return related;
    }

    public void setRelated(List<Answer> related) {
        this.related = related;
    }

    public String getSavedItemId() {
        return savedItemId;
    }

    public void setSavedItemId(String savedItemId) {
        this.savedItemId = savedItemId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
