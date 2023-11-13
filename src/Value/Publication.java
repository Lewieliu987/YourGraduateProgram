package Value;

import java.util.ArrayList;

public class Publication {
    private ArrayList<EveryPublication> publications;

    public Publication() {
        this.publications = new ArrayList<EveryPublication>();
    }

    public void addPublication(EveryPublication publication) {
        publications.add(publication);
    }
    public ArrayList<EveryPublication> getPublications() {
    	return publications;
    }

    // 需要遍历函数
    public int getPublicationCount() {
        return publications.size();
    }
}
