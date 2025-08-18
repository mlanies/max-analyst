package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class hv9 {
    public static final hv9 a;
    public static final /* synthetic */ hv9[] b;

    static {
        hv9 hv9Var = new hv9("COMPLETE", 0);
        a = hv9Var;
        b = new hv9[]{hv9Var};
    }

    public static boolean a(f2a f2aVar, Object obj) {
        if (obj == a) {
            f2aVar.b();
            return true;
        }
        if (obj instanceof fv9) {
            f2aVar.onError(((fv9) obj).a);
            return true;
        }
        f2aVar.e(obj);
        return false;
    }

    public static boolean b(f2a f2aVar, Object obj) {
        if (obj == a) {
            f2aVar.b();
            return true;
        }
        if (obj instanceof fv9) {
            f2aVar.onError(((fv9) obj).a);
            return true;
        }
        if (obj instanceof ev9) {
            f2aVar.c(((ev9) obj).a);
            return false;
        }
        f2aVar.e(obj);
        return false;
    }

    public static hv9 valueOf(String str) {
        return (hv9) Enum.valueOf(hv9.class, str);
    }

    public static hv9[] values() {
        return (hv9[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
