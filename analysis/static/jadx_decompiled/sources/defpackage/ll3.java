package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ll3 {
    public static final /* synthetic */ ll3[] X;
    public static final ll3 a;
    public static final ll3 b;
    public static final ll3 c;
    public static final ll3 o;

    static {
        ll3 ll3Var = new ll3("OFFICIAL", 0);
        a = ll3Var;
        ll3 ll3Var2 = new ll3("BOT", 1);
        b = ll3Var2;
        ll3 ll3Var3 = new ll3("SERVICE_ACCOUNT", 2);
        c = ll3Var3;
        ll3 ll3Var4 = new ll3("HAS_WEBAPP", 3);
        o = ll3Var4;
        X = new ll3[]{ll3Var, ll3Var2, ll3Var3, ll3Var4};
    }

    public static ll3 valueOf(String str) {
        return (ll3) Enum.valueOf(ll3.class, str);
    }

    public static ll3[] values() {
        return (ll3[]) X.clone();
    }
}
