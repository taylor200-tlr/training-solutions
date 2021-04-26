package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> performers = new ArrayList<>();
    private List<String> composer = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title is empty");
        }
        this.title = title;
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers is empty");
        }
        this.performers = performers;

    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException("Title is empty");
        }
        this.title = title;
        this.length = length;
        if (Validators.isEmpty(performers)) {
            throw new IllegalArgumentException("Performers is empty");
        }
        this.performers = performers;
        this.composer = composer;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        contributors.addAll(composer);
        contributors.addAll(performers);
        return contributors;
    }

    @Override
    public String getTitle() {
        return title;
    }


    public int getLength() {
        return length;
    }

}
