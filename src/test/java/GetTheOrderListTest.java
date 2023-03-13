import client.OrdersClient;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class GetTheOrderListTest {
    OrdersClient ordersClient;
    @Test
    @DisplayName("Получение списка заказов")
    @Description("Проверяем получение списка заказов. Ожидаемый результат: список заказов отображается и код ответа 200")
    public void getListOrder(){
        ordersClient.getAllOrders()
        .then().statusCode(200)
                .and()
                .assertThat().body("orders", notNullValue());
    }
}
