package com.example.paulap.crowdsourcing.models;

public class Issue {
    private String summary;
    private String description;
    private String solution;
    private String category;


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Issue(String summary, String description, String solution, String category) {
        this.summary = summary;
        this.description = description;
        this.solution = solution;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                ", solution='" + solution + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
