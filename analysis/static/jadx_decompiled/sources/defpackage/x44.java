package defpackage;

import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public abstract class x44 {
    public static final boolean a;
    public static final yd3 b;
    public static final /* synthetic */ w44 c;

    static {
        Object njcVar;
        s5c.d(new Exception(), pag.class.getSimpleName());
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        new yd3(false);
        a = true;
        try {
            Object objNewInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            f8.c(1, objNewInstance);
            njcVar = (m56) objNewInstance;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        b = new yd3(true);
        c = new w44();
    }
}
