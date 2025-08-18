package defpackage;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class yff implements sf6 {
    public final bgf a;
    public final AtomicLong b = new AtomicLong();
    public final long c;
    public final b8b d;

    public yff(bgf bgfVar, b8b b8bVar, long j) {
        this.a = bgfVar;
        this.c = j;
        this.d = b8bVar;
    }

    @Override // defpackage.wqc
    public final Surface a() {
        SparseArray sparseArray = ((rf4) this.a).d.g;
        fm9.k(oaf.l(sparseArray, 1));
        return ((r27) sparseArray.get(1)).a.j();
    }

    @Override // defpackage.q3a
    public final void b(lv4 lv4Var, long j, qy5 qy5Var, boolean z) {
        int i;
        List listJ;
        long jB = lv4Var.b(j);
        AtomicLong atomicLong = this.b;
        if (qy5Var != null) {
            int i2 = qy5Var.w % 180;
            int i3 = qy5Var.u;
            int i4 = qy5Var.t;
            int i5 = i2 == 0 ? i4 : i3;
            if (i2 != 0) {
                i3 = i4;
            }
            lsd lsdVar = new lsd(i5, i3);
            String str = qy5Var.n;
            str.getClass();
            if (ia9.i(str)) {
                i = 2;
            } else if (str.equals("video/raw")) {
                i = 3;
            } else {
                if (!ia9.k(str)) {
                    throw new IllegalArgumentException("MIME type not supported ".concat(str));
                }
                i = 1;
            }
            zw6 zw6Var = lv4Var.g.b;
            b8b b8bVar = this.d;
            if (b8bVar == null) {
                listJ = zw6.j(zw6Var);
            } else {
                ww6 ww6Var = new ww6(4);
                ww6Var.e(zw6Var);
                ww6Var.a(b8bVar);
                listJ = ww6Var.j();
            }
            i63 i63Var = qy5Var.A;
            i63Var.getClass();
            ((rf4) this.a).c(i, listJ, new t26(i63Var, lsdVar.a, lsdVar.b, qy5Var.x, atomicLong.get() + this.c));
        }
        atomicLong.addAndGet(jB);
    }

    @Override // defpackage.wqc
    public final int c() {
        v2 v2Var = ((rf4) this.a).d.k;
        if (v2Var != null) {
            return v2Var.k();
        }
        return 0;
    }

    @Override // defpackage.wqc
    public final void e() {
        ((rf4) this.a).f();
    }

    @Override // defpackage.wqc
    public final int g(Bitmap bitmap, uue uueVar) {
        rf4 rf4Var = (rf4) this.a;
        if (!rf4Var.k.e()) {
            return 2;
        }
        if (i63.g(rf4Var.p)) {
            fm9.e("VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.", oaf.a >= 34 && bitmap.hasGainmap());
        }
        t26 t26Var = rf4Var.q;
        t26Var.getClass();
        v2 v2Var = rf4Var.d.k;
        fm9.l(v2Var);
        v2Var.o(bitmap, new t26(t26Var.a, t26Var.b, t26Var.c, t26Var.d, t26Var.e), uueVar);
        return 1;
    }

    @Override // defpackage.wqc
    public final boolean h(long j) {
        return ((rf4) this.a).b();
    }
}
