package defpackage;

import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class r4a {
    public static void a(Throwable th) {
        int i = OneMeApplication.s0;
        try {
            hm9.p("Payload", "error while parse payload", th);
            ((xie) bcf.a.getAccessor().c(xie.class)).c().a(null, th);
        } catch (Throwable th2) {
            hm9.p("Payload", "failed to collect exception", th2);
        }
    }
}
