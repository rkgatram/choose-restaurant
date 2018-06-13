package com.vladmeh.choosing.testdata;

import com.vladmeh.choosing.model.Menu;
import com.vladmeh.choosing.model.Restaurant;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static com.vladmeh.choosing.testdata.RestaurantTestData.*;

public class MenuTestData {
    //RESTAURANT_0
    public static final Menu MENU_0 = new Menu(0L, RESTAURANT_0, LocalDate.now() );
    public static final Menu MENU_1 = new Menu(1L, RESTAURANT_0, LocalDate.of(2018, 5, 23) );
    //RESTAURANT_1
    public static final Menu MENU_2 = new Menu(2L, RESTAURANT_1, LocalDate.now() );
    public static final Menu MENU_3 = new Menu(3L, RESTAURANT_1, LocalDate.of(2018, 5, 23) );
    //RESTAURANT_2
    public static final Menu MENU_4 = new Menu(4L, RESTAURANT_2, LocalDate.now() );
    public static final Menu MENU_5 = new Menu(5L, RESTAURANT_2, LocalDate.of(2018, 5, 23) );

    public static Map<String, Object> getStringObjectMapMenu(Restaurant restaurant, LocalDate date) {
        Map<String, Object> menu = new HashMap<>();
        menu.put("restaurant", "http://localhost:8080/api/restaurant/" + restaurant.getId());
        menu.put("date", date);

        return menu;
    }
}