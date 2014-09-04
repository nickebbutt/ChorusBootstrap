package com.gildedrose;

import org.chorusbdd.chorus.annotations.Handler;
import org.chorusbdd.chorus.annotations.Step;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: ga2jaar
 * Date: 04/09/14
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
@Handler("GildedRose")
public class GildedRoseStepDef {


    private GildedRose gildedRose;

    @Step("^an item \"([^\"]*)\"$")
    public void an_item(String name) throws Throwable {
//        itemName = name;
    }

    @Step("^an item \"([^\"]*)\" with quality (-?\\d+) and sell in (-?\\d+)$")
    public void an_item_with_quality_and_sell_in(String name,
                                                 int quality, int sellIn) throws Throwable {
        createItem(name, quality, sellIn);
    }

    @Step("^an item \"([^\"]*)\" with quality (-?\\d+)$")
    public void an_item_with_quality_only(String name,
                                          int quality ) throws Throwable {
        createItem(name, quality, 10);
    }




    @Step("^(-?\\d+) day changes have passed")
    public void the_number_of_day_changes_passed(int days) throws Throwable {
        for (int i =0; i < days; i++) {
            i_update_quality();
        }
    }


    @Step("^the day changes$")
    public void i_update_quality() throws Throwable {
        gildedRose.updateQuality();
    }

    private void createItem(String name, int sellIn, int quality) {
        Item item = new Item(name, sellIn, quality);
        Item[] items = new Item[]{item};
        gildedRose = new GildedRose(items);
    }

    @Step("^the items quality is (-?\\d+)$")
    public void the_quality_is_updated_to(int expected) throws Throwable {
        assertEquals(expected, gildedRose.items[0].quality);
    }

    @Step("^the item \"([^\"]*)\" has quality (-?\\d+) and sell in (-?\\d+)$")
    public void the_quality_becomes_and_sell_in_becomes(
           String name, int expectedQuality, int expectedSellIn) throws Throwable {
        assertEquals(name, gildedRose.items[0].name);
        assertEquals(expectedQuality, gildedRose.items[0].quality);
        assertEquals(expectedSellIn, gildedRose.items[0].sellIn);
    }

    @Step("^the item \"([^\"]*)\" has quality (-?\\d+)$")
    public void the_quality_becomes_and_sell_in_becomes(
            String name, int expectedQuality) throws Throwable {
        assertEquals(name, gildedRose.items[0].name);
        assertEquals(expectedQuality, gildedRose.items[0].quality);
    }



    @Step("^the item's name is \"([^\"]*)\"$")
    public void the_item_s_name_is(String name) throws Throwable {
        assertEquals(name, gildedRose.items[0].name);
        assertEquals(name, gildedRose.items[0].name);
    }
}