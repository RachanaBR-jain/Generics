
public class GenericsMain  {
    public Integer find_Max(Integer firstPosition, Integer secondPosition, Integer thirdPosition) {
        Integer max= firstPosition;
        if (secondPosition.compareTo(max) > 0) {
            max = secondPosition;
        }
        if (thirdPosition.compareTo(max) > 0) {
            max = thirdPosition;
        }
        return max;
    }
}
