package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class se extends Drawable implements Animatable, kq4 {
    public static final c32 A0 = new c32(7, (byte) 0);
    public long X;
    public long Y;
    public int Z;
    public final vf a;
    public final g03 b;
    public volatile boolean c;
    public long o;
    public long s0;
    public long t0;
    public int u0;
    public int w0;
    public lh6 y0;
    public final re z0;
    public final long v0 = 8;
    public volatile c32 x0 = A0;

    public se(wf wfVar) {
        this.a = wfVar;
        av1 av1Var = new av1();
        this.z0 = new re(0, this);
        this.b = new g03(wfVar);
        wfVar.b0(av1Var);
    }

    @Override // defpackage.kq4
    public final void a() {
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a == null || this.b == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMax = this.c ? jUptimeMillis - this.o : (long) Math.max(this.X, 0.0d);
        int iT = this.b.T(jMax);
        if (iT == -1) {
            iT = this.a.x() - 1;
            this.x0.getClass();
            this.c = false;
        } else if (iT == 0 && this.Z != -1 && jUptimeMillis >= this.Y) {
            this.x0.getClass();
        }
        boolean zC0 = this.a.c0(this, canvas, iT);
        if (zC0) {
            this.x0.getClass();
            this.Z = iT;
        }
        if (!zC0) {
            this.w0++;
            if (ta5.a.i(2)) {
                ta5.d(se.class, Integer.valueOf(this.w0), "Dropped a frame. Count: %s");
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        if (this.c) {
            long jV = this.b.V(jUptimeMillis2 - this.o);
            if (jV != -1) {
                long j = this.o + jV + this.v0;
                this.Y = j;
                scheduleSelf(this.z0, j);
            } else {
                this.x0.getClass();
                this.c = false;
            }
        }
        this.X = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.V() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        vf vfVar = this.a;
        return vfVar != null ? vfVar.a0() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.Z(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.c) {
            return false;
        }
        long j = i;
        if (this.X == j) {
            return false;
        }
        this.X = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.y0 == null) {
            this.y0 = new lh6();
        }
        this.y0.c = i;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.p(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.y0 == null) {
            this.y0 = new lh6();
        }
        lh6 lh6Var = this.y0;
        lh6Var.f = colorFilter;
        lh6Var.b = colorFilter != null;
        vf vfVar = this.a;
        if (vfVar != null) {
            vfVar.B(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        vf vfVar;
        if (this.c || (vfVar = this.a) == null || vfVar.x() <= 1) {
            return;
        }
        this.c = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - this.s0;
        this.o = j;
        this.Y = j;
        this.X = jUptimeMillis - this.t0;
        this.Z = this.u0;
        invalidateSelf();
        this.x0.getClass();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.c) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.s0 = jUptimeMillis - this.o;
            this.t0 = jUptimeMillis - this.X;
            this.u0 = this.Z;
            this.c = false;
            this.o = 0L;
            this.Y = 0L;
            this.X = -1L;
            this.Z = -1;
            unscheduleSelf(this.z0);
            this.x0.getClass();
        }
    }
}
