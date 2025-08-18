package defpackage;

/* loaded from: classes.dex */
public abstract class ta5 {
    public static ft7 a = ua5.b;

    public static void a(Class cls, String str) {
        if (a.i(6)) {
            a.e(cls.getSimpleName(), str);
        }
    }

    public static void b(Class cls, String str, Object... objArr) {
        if (a.i(6)) {
            a.e(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (a.i(6)) {
            a.e(str, str2, th);
        }
    }

    public static void d(Class cls, Object obj, String str) {
        if (a.i(2)) {
            ft7 ft7Var = a;
            String simpleName = cls.getSimpleName();
            String.format(null, str, obj);
            ft7Var.b(simpleName);
        }
    }

    public static void e(Class cls, String str, Object obj, Object obj2) {
        if (a.i(2)) {
            ft7 ft7Var = a;
            String simpleName = cls.getSimpleName();
            String.format(null, str, obj, obj2);
            ft7Var.b(simpleName);
        }
    }

    public static void f(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (a.i(2)) {
            String.format(null, str, obj, obj2, obj3);
            if (a.i(2)) {
                a.b(cls.getSimpleName());
            }
        }
    }

    public static void g(String str, Long l, Object obj, Object obj2) {
        if (a.i(2)) {
            ft7 ft7Var = a;
            String.format(null, str, l, obj, obj2);
            ft7Var.b("RequestLoggingListener");
        }
    }

    public static void h(String str, String str2, Object... objArr) {
        if (a.i(2)) {
            ft7 ft7Var = a;
            String.format(null, str2, objArr);
            ft7Var.b(str);
        }
    }

    public static void i(Class cls, String str, Exception exc) {
        if (a.i(5)) {
            a.w(cls.getSimpleName(), str, exc);
        }
    }

    public static void j(Class cls, String str, Object... objArr) {
        if (a.i(5)) {
            a.w(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void k(Exception exc) {
        if (a.i(5)) {
            a.w("OkHttpNetworkFetchProducer", "Exception when closing response body", exc);
        }
    }

    public static void l(Exception exc, String str, Object... objArr) {
        if (a.i(5)) {
            i(du0.class, String.format(null, str, objArr), exc);
        }
    }

    public static void m(String str, String str2, Object... objArr) {
        if (a.i(5)) {
            a.w(str, String.format(null, str2, objArr));
        }
    }

    public static void n(String str, String str2, Object... objArr) {
        if (a.i(6)) {
            a.f(str, String.format(null, str2, objArr));
        }
    }
}
