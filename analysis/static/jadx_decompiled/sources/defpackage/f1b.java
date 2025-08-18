package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class f1b implements x1b {
    public int X;
    public float Y;
    public float Z;
    public final View a;
    public final vg1 b;
    public final aa1 c;
    public int o;
    public ValueAnimator s0;
    public w1b t0 = w1b.e;

    public f1b(View view, re6 re6Var, aa1 aa1Var) {
        this.a = view;
        this.b = re6Var;
        this.c = aa1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0010 A[PHI: r3
      0x0010: PHI (r3v6 float) = (r3v0 float), (r3v1 float) binds: [B:3:0x000e, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            vg1 r0 = r6.b
            android.graphics.PointF r0 = r0.z()
            float r1 = r0.x
            w1b r2 = r6.t0
            float r3 = r2.a
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 >= 0) goto L12
        L10:
            r1 = r3
            goto L19
        L12:
            float r3 = r2.b
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L19
            goto L10
        L19:
            float r3 = r0.y
            float r4 = r2.c
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L23
            r3 = r4
            goto L2a
        L23:
            float r2 = r2.d
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L2a
            r3 = r2
        L2a:
            android.animation.ValueAnimator r2 = r6.s0
            if (r2 == 0) goto L31
            r2.end()
        L31:
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x004e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            r4 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r4)
            e1b r4 = new e1b
            r4.<init>()
            r2.addUpdateListener(r4)
            r6.s0 = r2
            r2.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1b.a():void");
    }

    @Override // defpackage.x1b
    public final boolean e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        vg1 vg1Var = this.b;
        if (action == 0) {
            PointF pointFZ = vg1Var.z();
            this.o = (int) pointFZ.x;
            this.X = (int) pointFZ.y;
            this.Y = motionEvent.getRawX();
            this.Z = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 == 1) {
            a();
            return motionEvent.getAction() == 1 && motionEvent.getEventTime() - motionEvent.getDownTime() < 100;
        }
        if (action2 != 2) {
            if (action2 != 3) {
                return true;
            }
            a();
            return true;
        }
        float rawX = motionEvent.getRawX() - this.Y;
        float f = this.o + rawX;
        float rawY = this.X + (motionEvent.getRawY() - this.Z);
        vg1Var.T(f, rawY);
        PointF pointF = ((ba1) this.c).b;
        pointF.x = f;
        pointF.y = rawY;
        return true;
    }

    @Override // defpackage.x1b
    public final void i(float f, float f2) {
        this.b.T(f, f2);
        PointF pointF = ((ba1) this.c).b;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.x1b
    public final void j(float f, float f2, int i, int i2, j1b j1bVar) {
        this.t0 = kq0.d(this.a.getContext(), f, f2, i, i2, j1bVar);
    }
}
