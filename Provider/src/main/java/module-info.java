import org.example.pizzaprovider.KebabPizza;
import org.example.pizzaservice.PizzaMaker;

module org.example.pizzaprovider {
    requires org.example.pizzaservice;
    provides PizzaMaker with KebabPizza;
}