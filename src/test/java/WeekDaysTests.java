import homeWork.Module8.WeekDays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

public class WeekDaysTests {
    private static final Logger logger = LogManager.getLogger(WeekDaysTests.class);

    static Stream<Arguments> allDays(){
        return Stream.of(
                Arguments.of(1, "Sunday"),
                Arguments.of(2, "Monday"),
                Arguments.of(3, "Tuesday"),
                Arguments.of(4, "Wednesday"),
                Arguments.of(5, "Thursday"),
                Arguments.of(6, "Friday"),
                Arguments.of(7, "Saturday")
        );
    }

    @ParameterizedTest
    @MethodSource("allDays")

    public void testAllDaysHappyPath(int a, String expectedResult){
logger.info("Parameterized all numbers Test");
        WeekDays weekDay = new WeekDays();
        String actualResult = weekDay.getDay(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -20})
    public void testSmallerNumbers(int a){
        String expectedResult = "The number should be equal or larger than 1";

         WeekDays weekDay = new WeekDays();
         String actualResult = weekDay.getDay(a);

         Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {8, 80, 2346899})
    public void testLargerNumbers(int a) {
        String expectedResult = "The number should be equal or smaller than 7";

        WeekDays weekDay = new WeekDays();
        String actualResult = weekDay.getDay(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testWeekDaysHappyPath(){
        logger.info("Simple Trial Method");
        Integer dayNumber = 1;
        String expectedResult = "Sunday";

        WeekDays weekDay = new WeekDays();
        String actualResult = weekDay.getDay(dayNumber);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public  void testNullNegative(){
        logger.error("Null checking");
        Integer dayNumber = null;
        WeekDays weekDay = new WeekDays();
        Assertions.assertThrows(NullPointerException.class,()->weekDay.getDay(dayNumber));
    }


}
