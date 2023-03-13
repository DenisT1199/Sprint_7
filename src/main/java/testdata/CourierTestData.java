package testdata;
import org.apache.commons.lang3.RandomStringUtils;
import model.NewCourier;

public class CourierTestData {
    private static final String LOGIN = RandomStringUtils.randomAlphanumeric(5);
    private static final String PASSWORD = "asdasd";
    private static final String FIRST_NAME = "Dan";

    public static NewCourier getCourierRequestAllRequiredField()
    {
        NewCourier newCourier = new NewCourier();
        newCourier.setLogin(LOGIN);
        newCourier.setPassword(PASSWORD);
        newCourier.setFirstName(FIRST_NAME);
        return newCourier;
    }

    public static NewCourier getCourierRequestWithoutRequiredField()
    {
        NewCourier newCourier = new NewCourier();
        newCourier.setPassword(PASSWORD);
        newCourier.setFirstName(FIRST_NAME);
        return newCourier;
    }
}
