package com.gildedrose;

import org.chorusbdd.chorus.annotations.Handler;
import org.chorusbdd.chorus.annotations.Step;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: GA2EBBU
 * Date: 04/09/14
 * Time: 15:05
 * To change this template use File | Settings | File Templates.
 */
@Handler("Gilded Rose")
public class GildedRoseHandler {

    private String itemName;
    private int itemQuality;
    private int itemSellIn;

    private GildedRose gildedRose;

    @Step(".*an item \"([^\"]*)\"$")
    public void an_item(String name) throws Throwable {
        itemName = name;
    }

    @Step(".*the quality is (-?\\d+)")
    public void the_quality_is(int quality) throws Throwable {
        itemQuality = quality;
    }

    @Step(".*the sell in is (-?\\d+)")
    public void the_sell_in_is(int sellIn) throws Throwable {
        itemSellIn = sellIn;
    }

    @Step(".*an item \"([^\"]*)\" with quality (-?\\d+) and sell in (-?\\d+)$")
    public void an_item_with_quality_and_sell_in(String name,
                                                 int quality, int sellIn) throws Throwable {
        itemName = name;
        itemQuality = quality;
        itemSellIn = sellIn;
    }

    @Step(".*I update quality$")
    public void i_update_quality() throws Throwable {
        Item item = new Item(itemName, itemSellIn, itemQuality);
        Item[] items = new Item[]{item};
        gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
    }

    @Step(".*the quality is updated to (-?\\d+)$")
    public void the_quality_is_updated_to(int expected) throws Throwable {
        assertEquals(expected, gildedRose.items[0].quality);
    }

    @Step(".*the sell in is updated to (-?\\d+)$")
    public void the_sell_in_is_updated_to(int expected) throws Throwable {
        assertEquals(expected, gildedRose.items[0].sellIn);
    }

    @Step(".*the quality becomes (-?\\d+) and sell in becomes (-?\\d+)$")
    public void the_quality_becomes_and_sell_in_becomes(
            int expectedQuality, int expectedSellIn) throws Throwable {
        assertEquals(expectedQuality, gildedRose.items[0].quality);
        assertEquals(expectedSellIn, gildedRose.items[0].sellIn);
    }
    @Step(".*the item's name is \"([^\"]*)\"$")
    public void the_item_s_name_is(String name) throws Throwable {
        assertEquals(name, itemName);
        assertEquals(name, gildedRose.items[0].name);
    }
}
