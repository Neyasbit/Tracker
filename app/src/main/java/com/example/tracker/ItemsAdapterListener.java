package com.example.tracker;

import com.example.tracker.api.Item;

public interface ItemsAdapterListener {
    void onItemClick(Item item, int position);
    void onItemLongLick(Item item, int position);
}
