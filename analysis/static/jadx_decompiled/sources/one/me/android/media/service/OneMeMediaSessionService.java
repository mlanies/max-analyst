package one.me.android.media.service;

import android.content.Intent;
import android.os.Bundle;
import defpackage.bda;
import defpackage.bj8;
import defpackage.f46;
import defpackage.ffc;
import defpackage.fm9;
import defpackage.hde;
import defpackage.hm9;
import defpackage.i74;
import defpackage.imc;
import defpackage.ir6;
import defpackage.j1e;
import defpackage.j47;
import defpackage.kke;
import defpackage.lc4;
import defpackage.ls5;
import defpackage.oh8;
import defpackage.oz7;
import defpackage.qh8;
import defpackage.u35;
import defpackage.u75;
import defpackage.u88;
import defpackage.us7;
import defpackage.v24;
import defpackage.w9a;
import defpackage.wj8;
import defpackage.x65;
import defpackage.zw6;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService;", "Lbj8;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class OneMeMediaSessionService extends bj8 {
    public qh8 s0;
    public ContextScope t0;

    @Override // defpackage.bj8
    public final qh8 e(oh8 oh8Var) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "OneMeMediaSessionService", "onGetSession, controllerInfo=" + oh8Var + ", mediaSession=" + this.s0, null);
        }
        return this.s0;
    }

    @Override // defpackage.bj8, android.app.Service
    public final void onCreate() {
        qh8 qh8Var;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "OneMeMediaSessionService", "onCreate", null);
        }
        super.onCreate();
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, "OneMeMediaSessionService", "createMediaSession", null);
        }
        x65 x65Var = new x65(this);
        wj8 wj8Var = (wj8) u88.a.getAccessor().c(wj8.class);
        fm9.k(!x65Var.v);
        wj8Var.getClass();
        x65Var.d = new lc4(2, wj8Var);
        u75 u75VarA = x65Var.a();
        u35 u35Var = new u35();
        i74 i74Var = u75VarA.D0;
        i74Var.getClass();
        i74Var.Y.a(u35Var);
        try {
            Bundle bundle = Bundle.EMPTY;
            ls5 ls5Var = zw6.b;
            qh8Var = new qh8(this, u75VarA, ffc.X, new oz7(), bundle, bundle, new imc(new v24(this)));
        } catch (RuntimeException e) {
            hm9.p("OneMeMediaSessionService", "Failed to create media session", e);
            u75VarA.release();
            qh8Var = null;
        }
        this.s0 = qh8Var;
        if (qh8Var != null) {
            hde hdeVarA = f46.a();
            u88 u88Var = u88.a;
            ContextScope contextScopeA = j1e.a(hdeVarA.plus(((w9a) ((kke) u88Var.getAccessor().c(kke.class))).c().getImmediate()));
            this.t0 = contextScopeA;
            j47.T(contextScopeA, ((w9a) ((kke) u88Var.getAccessor().c(kke.class))).b(), null, new bda(2, null), 2);
        }
    }

    @Override // defpackage.bj8, android.app.Service
    public final void onDestroy() {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "OneMeMediaSessionService", "onDestroy", null);
        }
        ContextScope contextScope = this.t0;
        if (contextScope != null) {
            j1e.i(contextScope, null);
        }
        this.t0 = null;
        qh8 qh8Var = this.s0;
        if (qh8Var != null) {
            qh8Var.c().release();
            try {
                synchronized (qh8.b) {
                    qh8.c.remove(qh8Var.a.i);
                }
                qh8Var.a.r();
            } catch (Exception unused) {
            }
            this.s0 = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.bj8, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, null);
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
