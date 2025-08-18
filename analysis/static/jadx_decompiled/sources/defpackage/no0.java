package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class no0 extends v2 {
    public final va8 X;
    public final boolean Y;
    public sgc Z;
    public final LinkedBlockingQueue o;
    public hd6 s0;
    public int t0;
    public boolean u0;
    public boolean v0;

    public no0(va8 va8Var, nx0 nx0Var, boolean z) {
        super(nx0Var);
        this.X = va8Var;
        this.o = new LinkedBlockingQueue();
        this.Y = z;
    }

    public final void A() {
        if (this.o.isEmpty() || this.t0 == 0) {
            return;
        }
        mo0 mo0Var = (mo0) this.o.element();
        t26 t26Var = mo0Var.b;
        uue uueVar = mo0Var.c;
        fm9.k(uueVar.hasNext());
        long next = uueVar.next() + mo0Var.b.e;
        if (!this.v0) {
            this.v0 = true;
            Bitmap bitmap = mo0Var.a;
            try {
                hd6 hd6Var = this.s0;
                if (hd6Var != null) {
                    hd6Var.a();
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                mr0.f();
                int i = iArr[0];
                mr0.b(bitmap.getWidth(), bitmap.getHeight());
                mr0.d(3553, i, 9729);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                mr0.f();
                this.s0 = new hd6(i, -1, t26Var.b, t26Var.c);
                if (oaf.a >= 34 && bitmap.hasGainmap()) {
                    sgc sgcVar = this.Z;
                    sgcVar.getClass();
                    Gainmap gainmap = bitmap.getGainmap();
                    gainmap.getClass();
                    ((od4) sgcVar).l(jo0.d(gainmap));
                }
                if (this.Y) {
                    sgc sgcVar2 = this.Z;
                    sgcVar2.getClass();
                    od4 od4Var = (od4) sgcVar2;
                    fm9.k(od4Var.a.b == 1);
                    od4Var.t = true;
                    od4Var.u = false;
                }
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        this.t0--;
        gd6 gd6Var = this.Z;
        gd6Var.getClass();
        va8 va8Var = this.X;
        hd6 hd6Var2 = this.s0;
        hd6Var2.getClass();
        ((qi0) gd6Var).e(va8Var, hd6Var2, next);
        int i2 = t26Var.b;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        if (mo0Var.c.hasNext()) {
            return;
        }
        this.v0 = false;
        ((mo0) this.o.remove()).a.recycle();
        if (this.o.isEmpty() && this.u0) {
            gd6 gd6Var2 = this.Z;
            gd6Var2.getClass();
            ((qi0) gd6Var2).b();
            d54.a();
            this.u0 = false;
        }
    }

    @Override // defpackage.ed6
    public final void h() {
        ((nx0) this.a).v(new lo0(this, 1));
    }

    @Override // defpackage.v2
    public final void i() throws VideoFrameProcessingException {
        this.o.clear();
        this.v0 = false;
        this.u0 = false;
        this.t0 = 0;
        hd6 hd6Var = this.s0;
        if (hd6Var != null) {
            try {
                hd6Var.a();
                this.s0 = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        super.i();
    }

    @Override // defpackage.v2
    public final int k() {
        return 0;
    }

    @Override // defpackage.v2
    public final void o(final Bitmap bitmap, final t26 t26Var, final uue uueVar) {
        ((nx0) this.a).v(new xff() { // from class: ko0
            @Override // defpackage.xff
            public final void run() {
                no0 no0Var = this.a;
                no0Var.getClass();
                uue uueVar2 = uueVar;
                fm9.e("Bitmap queued but no timestamps provided.", uueVar2.hasNext());
                no0Var.o.add(new mo0(bitmap, t26Var, uueVar2));
                no0Var.A();
                no0Var.u0 = false;
            }
        });
    }

    @Override // defpackage.v2
    public final void release() {
        ((nx0) this.a).v(new lo0(this, 2));
    }

    @Override // defpackage.v2
    public final void y(od4 od4Var) {
        this.t0 = 0;
        this.Z = od4Var;
    }

    @Override // defpackage.v2
    public final void z() {
        ((nx0) this.a).v(new lo0(this, 0));
    }
}
