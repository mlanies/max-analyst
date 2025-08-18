package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* loaded from: classes.dex */
public final class v {
    private static volatile v h;
    private final d a = new d();
    private final r b = new r();
    private final z c = new z();
    private final e0 d = new e0();
    private final f e = new f();
    private final k f = new k();
    private final x g = new x();

    private v() {
    }

    public static v a() {
        v vVar;
        v vVar2 = h;
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (v.class) {
            try {
                vVar = h;
                if (vVar == null) {
                    vVar = new v();
                    h = vVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public u a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, Context context) {
        d0 d0VarA;
        y yVarA;
        w wVarA;
        c cVarA = this.a.a(context);
        q qVarA = this.b.a(context);
        e eVarA = this.e.a(installedPackagesProvider, context);
        if (z) {
            yVarA = null;
            d0VarA = null;
            wVarA = null;
        } else {
            d0VarA = this.d.a(context);
            yVarA = this.c.a(context);
            wVarA = this.g.a(context);
        }
        return new u(cVarA, qVarA, yVarA, d0VarA, eVarA, this.f.a(context), wVarA);
    }
}
