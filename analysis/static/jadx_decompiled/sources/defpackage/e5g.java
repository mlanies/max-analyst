package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class e5g {
    public static final e5g X;
    public static final e5g Y;
    public static final /* synthetic */ e5g[] Z;
    public static final e5g a;
    public static final e5g b;
    public static final e5g c;
    public static final e5g o;

    static {
        e5g e5gVar = new e5g("ADAPTIVE_ICON", 0);
        a = e5gVar;
        e5g e5gVar2 = new e5g("PICTURE", 1);
        b = e5gVar2;
        e5g e5gVar3 = new e5g("TITLE_BIG", 2);
        c = e5gVar3;
        e5g e5gVar4 = new e5g("TITLE_STANDARD", 3);
        o = e5gVar4;
        e5g e5gVar5 = new e5g("DESCRIPTION", 4);
        X = e5gVar5;
        e5g e5gVar6 = new e5g("FILE", 5);
        e5g e5gVar7 = new e5g("KEYBOARD", 6);
        Y = e5gVar7;
        Z = new e5g[]{e5gVar, e5gVar2, e5gVar3, e5gVar4, e5gVar5, e5gVar6, e5gVar7};
    }

    public static e5g valueOf(String str) {
        return (e5g) Enum.valueOf(e5g.class, str);
    }

    public static e5g[] values() {
        return (e5g[]) Z.clone();
    }
}
