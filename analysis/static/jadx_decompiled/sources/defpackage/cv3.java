package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class cv3 {
    public static final /* synthetic */ bc7[] a;
    public static final e54 b;
    public static final e54 c;
    public static final e54 d;

    static {
        gob gobVar = new gob("methodInflate", "getMethodInflate()Ljava/lang/reflect/Method;");
        nec.a.getClass();
        a = new bc7[]{gobVar, new gob("methodRemoveViewReference", "getMethodRemoveViewReference()Ljava/lang/reflect/Method;"), new gob("methodSetNeedsAttach", "getMethodSetNeedsAttach()Ljava/lang/reflect/Method;")};
        b = new e54(bv3.b, "inflate", (Class[]) Arrays.copyOf(new Class[]{ViewGroup.class}, 1));
        c = new e54(bv3.c, "removeViewReference", (Class[]) Arrays.copyOf(new Class[]{Context.class}, 1));
        d = new e54(bv3.o, "setNeedsAttach", (Class[]) Arrays.copyOf(new Class[]{Boolean.TYPE}, 1));
    }
}
