package Models;

/**
 * Created by denik on 29.01.2015.
 */
public class Publication {

    private int id;
    private String Text;
    private String Code;
    private double Rate;
    private int UserID;

    private String lang;
    private String Tags;
    public Publication() {}
    public Publication(int id, String text, String code, double rate, int userID, String lang, String tags) {
        this.id = id;
        Text = text;
        Code = code;
        Rate = rate;
        UserID = userID;
        this.lang = lang;
        Tags = tags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getTags() {
        return Tags;
    }

    public void setTags(String tags) {
        Tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publication that = (Publication) o;

        if (Double.compare(that.Rate, Rate) != 0) return false;
        if (UserID != that.UserID) return false;
        if (id != that.id) return false;
        if (!Code.equals(that.Code)) return false;
        if (Tags != null ? !Tags.equals(that.Tags) : that.Tags != null) return false;
        if (!Text.equals(that.Text)) return false;
        if (!lang.equals(that.lang)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + Text.hashCode();
        result = 31 * result + Code.hashCode();
        temp = Double.doubleToLongBits(Rate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + UserID;
        result = 31 * result + lang.hashCode();
        result = 31 * result + (Tags != null ? Tags.hashCode() : 0);
        return result;
    }
}
