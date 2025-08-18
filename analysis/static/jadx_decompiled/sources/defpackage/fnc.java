package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fnc {
    public static final fnc X;
    public static final fnc Y;
    public static final fnc Z;
    public static final fnc a;
    public static final fnc b;
    public static final fnc c;
    public static final fnc o;
    public static final fnc s0;
    public static final /* synthetic */ fnc[] t0;

    static {
        fnc fncVar = new fnc("NEUTRAL", 0);
        a = fncVar;
        fnc fncVar2 = new fnc("POSITIVE", 1);
        b = fncVar2;
        fnc fncVar3 = new fnc("NEGATIVE", 2);
        c = fncVar3;
        fnc fncVar4 = new fnc("SELECTED", 3);
        o = fncVar4;
        fnc fncVar5 = new fnc("CONTRAST", 4);
        X = fncVar5;
        fnc fncVar6 = new fnc("INACTIVE", 5);
        Y = fncVar6;
        fnc fncVar7 = new fnc("SELECTED_THEMED", 6);
        Z = fncVar7;
        fnc fncVar8 = new fnc("NONE", 7);
        s0 = fncVar8;
        t0 = new fnc[]{fncVar, fncVar2, fncVar3, fncVar4, fncVar5, fncVar6, fncVar7, fncVar8};
    }

    public static fnc valueOf(String str) {
        return (fnc) Enum.valueOf(fnc.class, str);
    }

    public static fnc[] values() {
        return (fnc[]) t0.clone();
    }
}
