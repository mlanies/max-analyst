package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zb5 extends ndc implements sdc {
    public static final int[] N0 = {R.attr.state_pressed};
    public static final int[] O0 = new int[0];
    public float A0;
    public final RecyclerView D0;
    public final ValueAnimator K0;
    public int L0;
    public final re M0;
    public final int X;
    public final int Y;
    public final StateListDrawable Z;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable o;
    public final Drawable s0;
    public final int t0;
    public final int u0;
    public int v0;
    public int w0;
    public float x0;
    public int y0;
    public int z0;
    public int B0 = 0;
    public int C0 = 0;
    public boolean E0 = false;
    public boolean F0 = false;
    public int G0 = 0;
    public int H0 = 0;
    public final int[] I0 = new int[2];
    public final int[] J0 = new int[2];

    public zb5(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.K0 = valueAnimatorOfFloat;
        this.L0 = 0;
        re reVar = new re(19, this);
        this.M0 = reVar;
        s15 s15Var = new s15(1, this);
        this.c = stateListDrawable;
        this.o = drawable;
        this.Z = stateListDrawable2;
        this.s0 = drawable2;
        this.X = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.Y = Math.max(i, drawable.getIntrinsicWidth());
        this.t0 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.u0 = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new tv3(this));
        valueAnimatorOfFloat.addUpdateListener(new yj0(4, this));
        RecyclerView recyclerView2 = this.D0;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.p0(this);
            this.D0.r0(this);
            this.D0.s0(s15Var);
            this.D0.removeCallbacks(reVar);
        }
        this.D0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.j(this);
            this.D0.l(this);
            this.D0.m(s15Var);
        }
    }

    public static int k(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.sdc
    public final void a(MotionEvent motionEvent) {
        if (this.G0 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (zJ || zI) {
                if (zI) {
                    this.H0 = 1;
                    this.A0 = (int) motionEvent.getX();
                } else if (zJ) {
                    this.H0 = 2;
                    this.x0 = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.G0 == 2) {
            this.x0 = 0.0f;
            this.A0 = 0.0f;
            l(1);
            this.H0 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.G0 == 2) {
            m();
            int i = this.H0;
            int i2 = this.b;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.J0;
                iArr[0] = i2;
                int i3 = this.B0 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.z0 - fMax) >= 2.0f) {
                    int iK = k(this.A0, fMax, iArr, this.D0.computeHorizontalScrollRange(), this.D0.computeHorizontalScrollOffset(), this.B0);
                    if (iK != 0) {
                        this.D0.scrollBy(iK, 0);
                    }
                    this.A0 = fMax;
                }
            }
            if (this.H0 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.I0;
                iArr2[0] = i2;
                int i4 = this.C0 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.w0 - fMax2) < 2.0f) {
                    return;
                }
                int iK2 = k(this.x0, fMax2, iArr2, this.D0.computeVerticalScrollRange(), this.D0.computeVerticalScrollOffset(), this.C0);
                if (iK2 != 0) {
                    this.D0.scrollBy(0, iK2);
                }
                this.x0 = fMax2;
            }
        }
    }

    @Override // defpackage.sdc
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.G0;
        if (i == 1) {
            boolean zJ = j(motionEvent.getX(), motionEvent.getY());
            boolean zI = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zJ && !zI) {
                return false;
            }
            if (zI) {
                this.H0 = 1;
                this.A0 = (int) motionEvent.getX();
            } else if (zJ) {
                this.H0 = 2;
                this.x0 = (int) motionEvent.getY();
            }
            l(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.sdc
    public final void e(boolean z) {
    }

    @Override // defpackage.ndc
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int i = this.B0;
        RecyclerView recyclerView2 = this.D0;
        if (i != recyclerView2.getWidth() || this.C0 != recyclerView2.getHeight()) {
            this.B0 = recyclerView2.getWidth();
            this.C0 = recyclerView2.getHeight();
            l(0);
            return;
        }
        if (this.L0 != 0) {
            if (this.E0) {
                int i2 = this.B0;
                int i3 = this.X;
                int i4 = i2 - i3;
                int i5 = this.w0;
                int i6 = this.v0;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.C0;
                int i9 = this.Y;
                Drawable drawable = this.o;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = zmf.a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.F0) {
                int i10 = this.C0;
                int i11 = this.t0;
                int i12 = i10 - i11;
                int i13 = this.z0;
                int i14 = this.y0;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.Z;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.B0;
                int i17 = this.u0;
                Drawable drawable2 = this.s0;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    public final boolean i(float f, float f2) {
        if (f2 >= this.C0 - this.t0) {
            int i = this.z0;
            int i2 = this.y0;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(float f, float f2) {
        RecyclerView recyclerView = this.D0;
        WeakHashMap weakHashMap = zmf.a;
        boolean z = recyclerView.getLayoutDirection() == 1;
        int i = this.X;
        if (z) {
            if (f > i) {
                return false;
            }
        } else if (f < this.B0 - i) {
            return false;
        }
        int i2 = this.w0;
        int i3 = this.v0 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    public final void l(int i) {
        re reVar = this.M0;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.G0 != 2) {
            stateListDrawable.setState(N0);
            this.D0.removeCallbacks(reVar);
        }
        if (i == 0) {
            this.D0.invalidate();
        } else {
            m();
        }
        if (this.G0 == 2 && i != 2) {
            stateListDrawable.setState(O0);
            this.D0.removeCallbacks(reVar);
            this.D0.postDelayed(reVar, 1200);
        } else if (i == 1) {
            this.D0.removeCallbacks(reVar);
            this.D0.postDelayed(reVar, 1500);
        }
        this.G0 = i;
    }

    public final void m() {
        int i = this.L0;
        ValueAnimator valueAnimator = this.K0;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.L0 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
