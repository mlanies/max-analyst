package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class o2f {
    public static volatile e14 e;
    public final d9f a;
    public final d9f b;
    public final ytc c;
    public final t8f d;

    public o2f(d9f d9fVar, d9f d9fVar2, ytc ytcVar, t8f t8fVar, o7g o7gVar) {
        this.a = d9fVar;
        this.b = d9fVar2;
        this.c = ytcVar;
        this.d = t8fVar;
        o7gVar.getClass();
        o7gVar.a.execute(new ule(19, o7gVar));
    }

    public static o2f a() {
        e14 e14Var = e;
        if (e14Var != null) {
            return (o2f) e14Var.Z.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (o2f.class) {
                try {
                    if (e == null) {
                        o9g o9gVar = new o9g(11, false);
                        context.getClass();
                        o9gVar.b = context;
                        e = o9gVar.o();
                    }
                } finally {
                }
            }
        }
    }

    public final m2f c(f05 f05Var) {
        Set setSingleton;
        byte[] bytes;
        if (f05Var instanceof f05) {
            ((fw0) f05Var).getClass();
            setSingleton = Collections.unmodifiableSet(fw0.d);
        } else {
            setSingleton = Collections.singleton(new i15("proto"));
        }
        vq7 vq7VarA = hc0.a();
        f05Var.getClass();
        vq7VarA.b = "cct";
        fw0 fw0Var = (fw0) f05Var;
        String str = fw0Var.a;
        String str2 = fw0Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = rh4.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        vq7VarA.c = bytes;
        return new m2f(setSingleton, vq7VarA.j(), this);
    }
}
