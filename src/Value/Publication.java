package Value;
import java.util.ArrayList;

public class Publication{
    private ArrayList<EveryPublication> publications;
    public Publication(ArrayList<EveryPublication> publications)
    {
        this.publications = publications;
    }
    public void addPublication(EveryPublication publication) {
        publications.add(publication);
    }

    // 需要遍历函数
}
