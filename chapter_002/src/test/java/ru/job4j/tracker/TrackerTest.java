package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void showAllItems() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[2];
        for (int i = 0; i < item.length; i++) {
            item[i] = new Item("name" + (i + 1));
            tracker.add(item[i]);
        }
        Item[] result = tracker.findAll();
        assertThat(result, is(item));
}

    @Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item item = new Item("name1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

    @Test
    public void findItemByName() {
        Tracker tracker = new Tracker();
        Item[] item = new Item[4];
        for (int i = 0; i < item.length; i++) {
            item[i] = new Item("name" + (i + 1));
            tracker.add(item[i]);
        }
        item[3].setName("name1");
        Item[] control = new Item[] {item[0], item[3]};
        Item[] result = tracker.findByName("name1");
        assertThat(result, is(control));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
