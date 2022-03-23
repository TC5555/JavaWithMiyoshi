
public class StudentData {
    String[] Data;

    public StudentData(String[] Data) {
        this.Data = Data;
    }

    public int compareTo(StudentData other, int type) {
        int i = 0;
        if (Data[type].equals(other.Data[type]) && type != Data.length - 1) {
            return compareTo(other, type + 1);
        }
        while (i != Data[type].length() - 1 && i != other.Data[type].length() - 1) {
            int Difference = Data[type].charAt(i) - other.Data[type].charAt(i);
            if (Difference == 0) {
                i++;
            } else return Difference;
        }
        return 0;
    }
}