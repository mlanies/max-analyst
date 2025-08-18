package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class cgf {
    public final t88 a;
    public final kgf b;
    public boolean d;
    public long g;
    public boolean j;
    public final long c = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public she l = she.a;

    public cgf(Context context, t88 t88Var) {
        this.a = t88Var;
        this.b = new kgf(context, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r23, long r25, long r27, long r29, boolean r31, defpackage.l7 r32) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgf.a(long, long, long, long, boolean, l7):int");
    }

    public final boolean b(boolean z) {
        if (z && this.e == 3) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        this.l.getClass();
        if (SystemClock.elapsedRealtime() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.j = z;
        long j = this.c;
        if (j > 0) {
            this.l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.i = jElapsedRealtime;
    }

    public final void d(int i) {
        this.e = Math.min(this.e, i);
    }

    public final void e() {
        this.d = true;
        this.l.getClass();
        this.g = oaf.S(SystemClock.elapsedRealtime());
        kgf kgfVar = this.b;
        kgfVar.b = true;
        kgfVar.k = 0L;
        kgfVar.n = -1L;
        kgfVar.l = -1L;
        ggf ggfVar = (ggf) kgfVar.q;
        if (ggfVar != null) {
            jgf jgfVar = (jgf) kgfVar.r;
            jgfVar.getClass();
            jgfVar.b.sendEmptyMessage(2);
            Handler handlerO = oaf.o(null);
            DisplayManager displayManager = ggfVar.b;
            displayManager.registerDisplayListener(ggfVar, handlerO);
            kgf.a((kgf) ggfVar.c, displayManager.getDisplay(0));
        }
        kgfVar.d(false);
    }

    public final void f() {
        this.d = false;
        this.i = -9223372036854775807L;
        kgf kgfVar = this.b;
        kgfVar.b = false;
        ggf ggfVar = (ggf) kgfVar.q;
        if (ggfVar != null) {
            ggfVar.b.unregisterDisplayListener(ggfVar);
            jgf jgfVar = (jgf) kgfVar.r;
            jgfVar.getClass();
            jgfVar.b.sendEmptyMessage(3);
        }
        kgfVar.b();
    }

    public final void g(float f) {
        kgf kgfVar = this.b;
        kgfVar.d = f;
        em5 em5Var = (em5) kgfVar.p;
        ((dm5) em5Var.e).c();
        ((dm5) em5Var.f).c();
        em5Var.b = false;
        em5Var.c = -9223372036854775807L;
        em5Var.d = 0;
        kgfVar.c();
    }

    public final void h(Surface surface) {
        kgf kgfVar = this.b;
        kgfVar.getClass();
        if (surface instanceof o2b) {
            surface = null;
        }
        if (kgfVar.c != surface) {
            kgfVar.b();
            kgfVar.c = surface;
            kgfVar.d(true);
        }
        d(1);
    }
}
