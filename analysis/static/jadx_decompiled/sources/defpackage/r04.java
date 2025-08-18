package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class r04 implements cje {
    public final ViewPager2 a;
    public final boolean b;
    public final boolean c;

    public r04(ViewPager2 viewPager2, boolean z, boolean z2) {
        this.a = viewPager2;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.bje
    public final void a(eje ejeVar) {
        int[] iArrB;
        int i;
        boolean z = this.b;
        ViewPager2 viewPager2 = this.a;
        if (!z) {
            viewPager2.e(ejeVar.d, this.c);
            return;
        }
        int i2 = ejeVar.d;
        int currentItem = viewPager2.getCurrentItem() - i2;
        if (Math.abs(currentItem) > 1) {
            int iAbs = (Math.abs(currentItem) - 1) * Integer.signum(currentItem) * viewPager2.getWidth();
            jb5 jb5Var = viewPager2.B0;
            vwc vwcVar = jb5Var.b;
            if (!(vwcVar.f == 1)) {
                jb5Var.g = 0;
                jb5Var.f = 0;
                jb5Var.h = SystemClock.uptimeMillis();
                VelocityTracker velocityTracker = jb5Var.d;
                if (velocityTracker == null) {
                    jb5Var.d = VelocityTracker.obtain();
                    jb5Var.e = ViewConfiguration.get(jb5Var.a.getContext()).getScaledMaximumFlingVelocity();
                } else {
                    velocityTracker.clear();
                }
                vwcVar.e = 4;
                vwcVar.f(true);
                if (vwcVar.f != 0) {
                    jb5Var.c.E0();
                }
                long j = jb5Var.h;
                MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
                jb5Var.d.addMovement(motionEventObtain);
                motionEventObtain.recycle();
            }
            float f = iAbs;
            jb5 jb5Var2 = viewPager2.B0;
            if (jb5Var2.b.m) {
                float f2 = jb5Var2.f - f;
                jb5Var2.f = f2;
                int iRound = Math.round(f2 - jb5Var2.g);
                jb5Var2.g += iRound;
                long jUptimeMillis = SystemClock.uptimeMillis();
                boolean z2 = jb5Var2.a.getOrientation() == 0;
                int i3 = z2 ? iRound : 0;
                if (z2) {
                    iRound = 0;
                }
                float f3 = z2 ? jb5Var2.f : 0.0f;
                float f4 = z2 ? 0.0f : jb5Var2.f;
                jb5Var2.c.scrollBy(i3, iRound);
                MotionEvent motionEventObtain2 = MotionEvent.obtain(jb5Var2.h, jUptimeMillis, 2, f3, f4, 0);
                jb5Var2.d.addMovement(motionEventObtain2);
                motionEventObtain2.recycle();
            }
            jb5 jb5Var3 = viewPager2.B0;
            vwc vwcVar2 = jb5Var3.b;
            boolean z3 = vwcVar2.m;
            if (z3) {
                if (!(vwcVar2.f == 1) || z3) {
                    vwcVar2.m = false;
                    vwcVar2.g();
                    uwc uwcVar = vwcVar2.g;
                    if (uwcVar.c == 0) {
                        int i4 = uwcVar.b;
                        if (i4 != vwcVar2.h) {
                            vwcVar2.c(i4);
                        }
                        vwcVar2.d(0);
                        vwcVar2.e();
                    } else {
                        vwcVar2.d(2);
                    }
                }
                VelocityTracker velocityTracker2 = jb5Var3.d;
                velocityTracker2.computeCurrentVelocity(1000, jb5Var3.e);
                if (!jb5Var3.c.O((int) velocityTracker2.getXVelocity(), (int) velocityTracker2.getYVelocity())) {
                    ViewPager2 viewPager22 = jb5Var3.a;
                    View viewI = viewPager22.y0.i(viewPager22.u0);
                    if (viewI != null && ((i = (iArrB = viewPager22.y0.b(viewPager22.u0, viewI))[0]) != 0 || iArrB[1] != 0)) {
                        viewPager22.x0.A0(i, iArrB[1], false);
                    }
                }
            }
        }
        viewPager2.e(i2, true);
    }
}
