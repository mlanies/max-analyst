package defpackage;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class and implements qu7 {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final je7 Y;
    public final khe Z;
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final khe t0;
    public final w4d s0 = mqd.D();
    public final String u0 = and.class.getName();

    static {
        oi9 oi9Var = new oi9(and.class, "shortcutsJob", "getShortcutsJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9Var};
    }

    public and(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var4;
        this.X = je7Var6;
        this.Y = je7Var7;
        this.Z = new khe(new dr(je7Var5, je7Var3, 9));
        this.t0 = new khe(new zja(this, 24, je7Var6));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.and r7, defpackage.e52 r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.and.b(and, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.qu7
    public final void a() {
        c();
    }

    public final void c() {
        try {
            Context context = this.a;
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
            wmd.u(context).getClass();
            Iterator it = wmd.t(context).iterator();
            if (it.hasNext()) {
                au1.r(it.next());
                throw null;
            }
        } catch (Throwable th) {
            hm9.p(this.u0, "clear: failed", th);
        }
    }

    public final void d() {
        vxd vxdVarT = j47.T((sx3) this.Z.getValue(), null, vx3.b, new zmd(this, null), 1);
        this.s0.o1(this, v0[0], vxdVarT);
    }
}
