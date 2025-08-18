package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class m5g {
    public static final /* synthetic */ v25 X;
    public static final nd2 b;
    public static final m5g c;
    public static final /* synthetic */ m5g[] o;
    public final short a;

    static {
        m5g m5gVar = new m5g("UNKNOWN", 0, (short) 0);
        c = m5gVar;
        m5g[] m5gVarArr = {m5gVar, new m5g("ADAPTIVE_ICON", 1, (short) 1), new m5g("PICTURE", 2, (short) 2), new m5g("TITLE_BIG", 3, (short) 3), new m5g("TITLE_STANDARD", 4, (short) 4), new m5g("DESCRIPTION", 5, (short) 5), new m5g("FILE", 6, (short) 6), new m5g("KEYBOARD", 7, (short) 7)};
        o = m5gVarArr;
        X = new v25(m5gVarArr);
        b = new nd2(19);
    }

    public m5g(String str, int i, short s) {
        this.a = s;
    }

    public static m5g valueOf(String str) {
        return (m5g) Enum.valueOf(m5g.class, str);
    }

    public static m5g[] values() {
        return (m5g[]) o.clone();
    }
}
