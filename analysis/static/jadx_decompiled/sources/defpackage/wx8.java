package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wx8 {
    public static final /* synthetic */ wx8[] X;
    public static final HashMap a;
    public static final wx8 b;
    public static final wx8 c;
    public static final wx8 o;

    static {
        wx8 wx8Var = new wx8("UNKNOWN", 0);
        b = wx8Var;
        wx8 wx8Var2 = new wx8("EDITED", 1);
        wx8 wx8Var3 = new wx8("REMOVED", 2);
        c = wx8Var3;
        wx8 wx8Var4 = new wx8("DELAYED_FIRE_ERROR", 3);
        o = wx8Var4;
        X = new wx8[]{wx8Var, wx8Var2, wx8Var3, wx8Var4};
        HashMap map = new HashMap(4);
        for (wx8 wx8Var5 : values()) {
            map.put(wx8Var5.name(), wx8Var5);
        }
        a = map;
    }

    public static wx8 valueOf(String str) {
        return (wx8) Enum.valueOf(wx8.class, str);
    }

    public static wx8[] values() {
        return (wx8[]) X.clone();
    }
}
