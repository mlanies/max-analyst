package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s4c {
    public static final s4c a;
    public static final s4c b;
    public static final /* synthetic */ s4c[] c;

    static {
        s4c s4cVar = new s4c("SMALL", 0);
        a = s4cVar;
        s4c s4cVar2 = new s4c("BIG", 1);
        b = s4cVar2;
        c = new s4c[]{s4cVar, s4cVar2};
    }

    public static s4c valueOf(String str) {
        return (s4c) Enum.valueOf(s4c.class, str);
    }

    public static s4c[] values() {
        return (s4c[]) c.clone();
    }
}
