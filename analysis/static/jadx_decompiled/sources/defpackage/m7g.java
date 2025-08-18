package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class m7g {
    public static final m7g X;
    public static final m7g Y;
    public static final /* synthetic */ m7g[] Z;
    public static final m7g a;
    public static final m7g b;
    public static final m7g c;
    public static final m7g o;

    static {
        m7g m7gVar = new m7g("ENQUEUED", 0);
        a = m7gVar;
        m7g m7gVar2 = new m7g("RUNNING", 1);
        b = m7gVar2;
        m7g m7gVar3 = new m7g("SUCCEEDED", 2);
        c = m7gVar3;
        m7g m7gVar4 = new m7g("FAILED", 3);
        o = m7gVar4;
        m7g m7gVar5 = new m7g("BLOCKED", 4);
        X = m7gVar5;
        m7g m7gVar6 = new m7g("CANCELLED", 5);
        Y = m7gVar6;
        Z = new m7g[]{m7gVar, m7gVar2, m7gVar3, m7gVar4, m7gVar5, m7gVar6};
    }

    public static m7g valueOf(String str) {
        return (m7g) Enum.valueOf(m7g.class, str);
    }

    public static m7g[] values() {
        return (m7g[]) Z.clone();
    }

    public final boolean a() {
        return this == c || this == o || this == Y;
    }
}
