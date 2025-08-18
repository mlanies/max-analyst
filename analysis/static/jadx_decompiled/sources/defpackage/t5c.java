package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t5c {
    public static final t5c a;
    public static final t5c b;
    public static final t5c c;
    public static final /* synthetic */ t5c[] o;

    static {
        t5c t5cVar = new t5c("NONE", 0);
        a = t5cVar;
        t5c t5cVar2 = new t5c("READ", 1);
        b = t5cVar2;
        t5c t5cVar3 = new t5c("WRITE", 2);
        c = t5cVar3;
        o = new t5c[]{t5cVar, t5cVar2, t5cVar3};
    }

    public static t5c valueOf(String str) {
        return (t5c) Enum.valueOf(t5c.class, str);
    }

    public static t5c[] values() {
        return (t5c[]) o.clone();
    }
}
