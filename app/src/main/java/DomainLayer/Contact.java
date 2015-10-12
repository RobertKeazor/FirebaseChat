package DomainLayer;


import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable{

    private String UserName;
    private String password;
    private String Email;


    public Contact(String userName, String password, String email) {
        UserName = userName;
        this.password = password;
        Email = email;
    }

    public Contact(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    protected Contact(Parcel in) {
        UserName = in.readString();
        password = in.readString();
        Email = in.readString();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(UserName);
        dest.writeString(password);
        dest.writeString(Email);
    }
}
