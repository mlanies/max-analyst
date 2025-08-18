package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v81 {
    public static final /* synthetic */ v81[] X;
    public static final /* synthetic */ v25 Y;
    public static final huc b;
    public static final v81 c;
    public static final v81 o;
    public final int a;

    static {
        v81 v81Var = new v81("ALL", 0, c0c.call_history_call_tab_all);
        c = v81Var;
        v81 v81Var2 = new v81("MISSING", 1, c0c.call_history_call_tab_missing);
        o = v81Var2;
        v81[] v81VarArr = {v81Var, v81Var2};
        X = v81VarArr;
        Y = new v25(v81VarArr);
        b = new huc();
    }

    public v81(String str, int i, int i2) {
        this.a = i2;
    }

    public static v81 valueOf(String str) {
        return (v81) Enum.valueOf(v81.class, str);
    }

    public static v81[] values() {
        return (v81[]) X.clone();
    }
}
