package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ks2 extends pnf {
    public static final /* synthetic */ bc7[] I0 = {new oi9(ks2.class, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, ks2.class, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;")};
    public final s35 A0;
    public final s35 B0;
    public final AtomicLong C0;
    public final w4d D0;
    public final w4d E0;
    public volatile String F0;
    public String G0;
    public String H0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final long[] b;
    public final pyd c;
    public final y7d o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final q0e y0;
    public final w7c z0;

    public ks2(long[] jArr, pyd pydVar) {
        nyd nydVar = nyd.a;
        y7d y7dVarB = nydVar.b();
        khe kheVarD = nydVar.getAccessor().d(pk.class);
        khe kheVarD2 = nydVar.getAccessor().d(kke.class);
        khe kheVarD3 = nydVar.getAccessor().d(eua.class);
        khe kheVarD4 = nydVar.getAccessor().d(kk5.class);
        khe kheVarD5 = nydVar.getAccessor().d(p82.class);
        khe kheVarF = nydVar.getAccessor().f();
        khe kheVarD6 = nydVar.getAccessor().d(av0.class);
        khe kheVarD7 = nydVar.getAccessor().d(wha.class);
        khe kheVarD8 = nydVar.getAccessor().d(Context.class);
        khe kheVarD9 = nydVar.getAccessor().d(cz3.class);
        khe kheVarD10 = nydVar.getAccessor().d(qe5.class);
        this.b = jArr;
        this.c = pydVar;
        this.o = y7dVarB;
        this.X = kheVarD;
        this.Y = kheVarD3;
        this.Z = kheVarD2;
        this.s0 = kheVarD4;
        this.t0 = kheVarD5;
        this.u0 = kheVarF;
        this.v0 = kheVarD6;
        this.w0 = kheVarD7;
        this.x0 = kheVarD8;
        q0e q0eVarA = r0e.a(new ds2(null, null, null));
        this.y0 = q0eVarA;
        this.z0 = new w7c(q0eVarA);
        this.A0 = new s35(0);
        this.B0 = new s35(0);
        this.C0 = new AtomicLong();
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.G0 = "";
        this.H0 = "";
        if (pydVar == pyd.o) {
            od2.L(new zn5(new v7c(((cz3) kheVarD9.getValue()).a), new fs2(this, kheVarD2, kheVarD10, null), 5), this.a);
        }
    }

    public static final void q(ks2 ks2Var, long j) {
        String strO;
        q0e q0eVar = ks2Var.y0;
        String str = ((ds2) q0eVar.getValue()).a;
        String str2 = ((ds2) q0eVar.getValue()).b;
        if (str2 == null || (strO = j47.O(str2)) == null) {
            strO = null;
        }
        if (str == null) {
            return;
        }
        if (strO != null) {
            p82 p82Var = (p82) ks2Var.t0.getValue();
            p82Var.getClass();
            hm9.n("p82", "changeChatIcon, chatId = " + j + ", path = " + strO);
            p82Var.c(j, v82.b);
            p82Var.h(j, false, new m82(strO, 0));
            p82Var.m.c(new vz2(Collections.singletonList(Long.valueOf(j)), false));
        }
        RectF rectF = ((ds2) q0eVar.getValue()).c;
        pk pkVar = (pk) ks2Var.X.getValue();
        a20 a20VarH = c37.h(rectF);
        k4a k4aVar = (k4a) pkVar;
        if (k4aVar.o(j)) {
            ((s8g) k4aVar.e.getValue()).b(new b32(((p7b) k4aVar.y()).a.o(), str, j, a20VarH));
        }
    }

    public final void r(String str, RectF rectF, Rect rect) {
        Object njcVar;
        try {
            njcVar = c37.i(str, rect, nyd.a.b());
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (pjc.a(njcVar) != null) {
            hm9.n(ks2.class.getName(), "local crop failed. Crop will be applied after update from server");
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        this.y0.m(null, new ds2(str, (String) njcVar, rectF));
    }

    public final void s() {
        Object njcVar;
        if (!((eua) this.Y.getValue()).b(eua.l)) {
            pnf.o(this.A0, tr2.b);
            return;
        }
        try {
            this.F0 = String.valueOf(System.currentTimeMillis());
            Uri uriFromFile = Uri.fromFile(((kk5) this.s0.getValue()).q(this.F0));
            String string = uriFromFile.toString();
            int i = tfg.c;
            if (!string.startsWith("content://")) {
                uriFromFile = ((kk5) this.s0.getValue()).f((Context) this.x0.getValue(), ft.A(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            njcVar = intent;
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        Throwable thA = pjc.a(njcVar);
        if (thA != null) {
            t();
            hm9.p(ks2.class.getName(), "capturePhoto: failed to capture photo", thA);
        }
        if (!(njcVar instanceof njc)) {
            pnf.o(this.A0, new sr2((Intent) njcVar));
        }
    }

    public final void t() {
        this.F0 = null;
        wha whaVar = (wha) this.w0.getValue();
        whaVar.g(new eqe(jpc.s));
        whaVar.e(new kia(woc.I));
        whaVar.i();
    }

    public final void u() {
        this.F0 = null;
        wha whaVar = (wha) this.w0.getValue();
        whaVar.g(new eqe(jpc.u));
        whaVar.e(new kia(woc.I));
        whaVar.i();
    }
}
