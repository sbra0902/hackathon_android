package kaufland.com.business.model;

public class DocIdModel {


    public String documentId;
    public double azureScore;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public double getAzureScore() {
        return azureScore;
    }

    public void setAzureScore(double azureScore) {
        this.azureScore = azureScore;
    }
}