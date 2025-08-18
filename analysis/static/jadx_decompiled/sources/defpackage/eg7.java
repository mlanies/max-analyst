package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class eg7 {
    private static final /* synthetic */ eg7[] $VALUES;
    public static final cg7 Companion;
    public static final eg7 ON_ANY;
    public static final eg7 ON_CREATE;
    public static final eg7 ON_DESTROY;
    public static final eg7 ON_PAUSE;
    public static final eg7 ON_RESUME;
    public static final eg7 ON_START;
    public static final eg7 ON_STOP;

    static {
        eg7 eg7Var = new eg7("ON_CREATE", 0);
        ON_CREATE = eg7Var;
        eg7 eg7Var2 = new eg7("ON_START", 1);
        ON_START = eg7Var2;
        eg7 eg7Var3 = new eg7("ON_RESUME", 2);
        ON_RESUME = eg7Var3;
        eg7 eg7Var4 = new eg7("ON_PAUSE", 3);
        ON_PAUSE = eg7Var4;
        eg7 eg7Var5 = new eg7("ON_STOP", 4);
        ON_STOP = eg7Var5;
        eg7 eg7Var6 = new eg7("ON_DESTROY", 5);
        ON_DESTROY = eg7Var6;
        eg7 eg7Var7 = new eg7("ON_ANY", 6);
        ON_ANY = eg7Var7;
        $VALUES = new eg7[]{eg7Var, eg7Var2, eg7Var3, eg7Var4, eg7Var5, eg7Var6, eg7Var7};
        Companion = new cg7();
    }

    public static eg7 valueOf(String str) {
        return (eg7) Enum.valueOf(eg7.class, str);
    }

    public static eg7[] values() {
        return (eg7[]) $VALUES.clone();
    }

    public final fg7 a() {
        switch (dg7.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return fg7.c;
            case 3:
            case 4:
                return fg7.o;
            case 5:
                return fg7.X;
            case 6:
                return fg7.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
