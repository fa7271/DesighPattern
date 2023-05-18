package javaa.who;

public class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    public int hashCode() {
        return number;


    }

    public boolean equals(Object obj) {
        if(obj instanceof Key){
            Key comparkey = (Key) obj;
            if (this.number == comparkey.number) {
                return true;
            }
        }
        return false;
    }
}
