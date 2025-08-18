package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ll {
    public static final ll a;
    public static final /* synthetic */ ll[] b;

    static {
        ll llVar = new ll("SAME", 0);
        a = llVar;
        b = new ll[]{llVar, new ll("NO_SESSION", 1), new ll("ANONYMOUS_SESSION", 2), new ll("SESSION", 3)};
    }

    public static ll valueOf(String str) {
        return (ll) Enum.valueOf(ll.class, str);
    }

    public static ll[] values() {
        return (ll[]) b.clone();
    }
}
