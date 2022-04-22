import org.example.pizzaprovider.HawaiiPizza;
import org.example.pizzaprovider.KebabPizza;
import org.example.pizzaprovider.MargheritaPizza;
import org.example.pizzaservice.PizzaMaker;

module org.example.pizzaprovider {
    requires org.example.pizzaservice;
    provides PizzaMaker with KebabPizza, HawaiiPizza, MargheritaPizza;
}