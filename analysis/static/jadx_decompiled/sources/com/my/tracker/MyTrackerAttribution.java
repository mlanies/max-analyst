package com.my.tracker;

/* loaded from: classes.dex */
public final class MyTrackerAttribution {
    private final String a;

    private MyTrackerAttribution(String str) {
        this.a = str;
    }

    public static MyTrackerAttribution newAttribution(String str) {
        return new MyTrackerAttribution(str);
    }

    public String getDeeplink() {
        return this.a;
    }
}
