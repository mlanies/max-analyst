package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public enum b10 {
    UNKNOWN("UNKNOWN"),
    CONTROL("CONTROL"),
    PHOTO("PHOTO"),
    VIDEO("VIDEO"),
    AUDIO("AUDIO"),
    STICKER("STICKER"),
    SHARE("SHARE"),
    APP("APP"),
    CALL("CALL"),
    FILE("FILE"),
    CONTACT("CONTACT"),
    PRESENT("PRESENT"),
    INLINE_KEYBOARD("INLINE_KEYBOARD"),
    LOCATION("LOCATION"),
    REPLY_KEYBOARD("REPLY_KEYBOARD"),
    VIDEO_MSG("VIDEO_MSG"),
    WIDGET("WIDGET");

    public static final HashSet D0;
    public static final HashSet E0;
    public static final HashSet F0;
    public static final HashSet G0;
    public static final HashSet H0;
    public static final HashSet I0;
    public static final HashSet J0;
    public final String a;

    static {
        b10 b10Var = PHOTO;
        b10 b10Var2 = VIDEO;
        b10 b10Var3 = AUDIO;
        b10 b10Var4 = SHARE;
        b10 b10Var5 = FILE;
        b10 b10Var6 = LOCATION;
        D0 = new HashSet(Arrays.asList(b10Var, b10Var2, b10Var3, b10Var4, b10Var5));
        E0 = new HashSet(Arrays.asList(b10Var, b10Var2));
        F0 = new HashSet(Collections.singletonList(b10Var4));
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{b10Var5}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G0 = new HashSet(Collections.unmodifiableList(arrayList));
        H0 = new HashSet(Collections.singletonList(b10Var3));
        I0 = new HashSet(Collections.singletonList(b10Var5));
        J0 = new HashSet(Collections.singletonList(b10Var6));
    }

    b10(String str) {
        this.a = str;
    }

    public static b10 a(String str) {
        str.getClass();
        switch (str) {
            case "WIDGET":
                return WIDGET;
            case "LOCATION":
                return LOCATION;
            case "STICKER":
                return STICKER;
            case "VIDEO_MSG":
                return VIDEO_MSG;
            case "INLINE_KEYBOARD":
                return INLINE_KEYBOARD;
            case "APP":
                return APP;
            case "CALL":
                return CALL;
            case "FILE":
                return FILE;
            case "AUDIO":
                return AUDIO;
            case "PHOTO":
                return PHOTO;
            case "SHARE":
                return SHARE;
            case "VIDEO":
                return VIDEO;
            case "PRESENT":
                return PRESENT;
            case "CONTACT":
                return CONTACT;
            case "CONTROL":
                return CONTROL;
            case "REPLY_KEYBOARD":
                return REPLY_KEYBOARD;
            default:
                return UNKNOWN;
        }
    }
}
