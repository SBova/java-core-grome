package lesson23;

/* public final class Validator такой класс нельзя отнаследовать
/ финальный класс нельзя отнаследовать обЪкты можно создавать

   финальльный метот нельзя переписать
    финальное поле не может быть изменено
 */
public class Validator {
    private String name;
    // 1 variant private final int checkCount;
    private static final int checkCount = 7; //2 variant так пишут 95%

/* 1 variant
    public Validator(String name, int checkCount) {

        this.name = name;
        this.checkCount = checkCount;
    }
*/

// 2 variant

    public Validator(String name) {

        this.name = name;
    }

    public final boolean validate(){
        //
        //logic 1
        //
        return false;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }
}
