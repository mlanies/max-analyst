package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class uq4 extends ImageView {
    public static boolean u0 = false;
    public final jt a;
    public float b;
    public sq4 c;
    public boolean o;
    public boolean s0;
    public Object t0;

    public uq4(Context context) {
        super(context);
        this.a = new jt(0);
        this.b = 0.0f;
        this.o = false;
        this.s0 = false;
        this.t0 = null;
        h(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        u0 = z;
    }

    public void g() {
        invalidate();
    }

    public float getAspectRatio() {
        return this.b;
    }

    public mq4 getController() {
        return this.c.X;
    }

    public Object getExtraData() {
        return this.t0;
    }

    public rq4 getHierarchy() {
        rq4 rq4Var = this.c.o;
        rq4Var.getClass();
        return rq4Var;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.e();
    }

    public final void h(Context context) {
        try {
            f46.I();
            if (this.o) {
                f46.I();
                return;
            }
            boolean z = true;
            this.o = true;
            this.c = new sq4(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                f46.I();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!u0 || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.s0 = z;
            f46.I();
        } catch (Throwable th) {
            f46.I();
            throw th;
        }
    }

    public final void i() {
        Drawable drawable;
        if (!this.s0 || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        this.c.g();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i();
        this.c.h();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        i();
        this.c.g();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        jt jtVar = this.a;
        jtVar.b = i;
        jtVar.c = i2;
        float f = this.b;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f > 0.0f && layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 == 0 || i3 == -2) {
                jtVar.c = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(jtVar.b) - paddingRight) / f) + paddingBottom), jtVar.c), 1073741824);
            } else {
                int i4 = layoutParams.width;
                if (i4 == 0 || i4 == -2) {
                    jtVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(jtVar.c) - paddingBottom) * f) + paddingRight), jtVar.b), 1073741824);
                }
            }
        }
        super.onMeasure(jtVar.b, jtVar.c);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        i();
        this.c.h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        sa6 sa6Var;
        sq4 sq4Var = this.c;
        if (sq4Var.f()) {
            k0 k0Var = (k0) sq4Var.X;
            k0Var.getClass();
            boolean zI = ta5.a.i(2);
            Class cls = k0.x;
            if (zI) {
                ta5.f(cls, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(k0Var)), k0Var.j, motionEvent);
            }
            ta6 ta6Var = k0Var.e;
            if (ta6Var != null && (ta6Var.c || k0Var.q())) {
                ta6 ta6Var2 = k0Var.e;
                ta6Var2.getClass();
                int action = motionEvent.getAction();
                if (action != 0) {
                    float f = ta6Var2.b;
                    if (action == 1) {
                        ta6Var2.c = false;
                        if (Math.abs(motionEvent.getX() - ta6Var2.f) > f || Math.abs(motionEvent.getY() - ta6Var2.g) > f) {
                            ta6Var2.d = false;
                        }
                        if (ta6Var2.d && motionEvent.getEventTime() - ta6Var2.e <= ViewConfiguration.getLongPressTimeout() && (sa6Var = ta6Var2.a) != null) {
                            k0 k0Var2 = (k0) sa6Var;
                            if (ta5.a.i(2)) {
                                ta5.e(cls, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(k0Var2)), k0Var2.j);
                            }
                            if (k0Var2.q()) {
                                k0Var2.d.c++;
                                la6 la6Var = k0Var2.h;
                                la6Var.f.o(la6Var.a);
                                la6Var.g();
                                k0Var2.r();
                            }
                        }
                        ta6Var2.d = false;
                    } else if (action != 2) {
                        if (action == 3) {
                            ta6Var2.c = false;
                            ta6Var2.d = false;
                        }
                    } else if (Math.abs(motionEvent.getX() - ta6Var2.f) > f || Math.abs(motionEvent.getY() - ta6Var2.g) > f) {
                        ta6Var2.d = false;
                    }
                } else {
                    ta6Var2.c = true;
                    ta6Var2.d = true;
                    ta6Var2.e = motionEvent.getEventTime();
                    ta6Var2.f = motionEvent.getX();
                    ta6Var2.g = motionEvent.getY();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        i();
    }

    public void setAspectRatio(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    public void setController(mq4 mq4Var) {
        this.c.i(mq4Var);
        super.setImageDrawable(this.c.e());
    }

    public void setExtraData(Object obj) {
        this.t0 = obj;
    }

    public void setHierarchy(rq4 rq4Var) {
        this.c.j(rq4Var);
        super.setImageDrawable(this.c.e());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        h(getContext());
        this.c.i(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        h(getContext());
        this.c.i(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        h(getContext());
        this.c.i(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        h(getContext());
        this.c.i(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.s0 = z;
    }

    @Override // android.view.View
    public final String toString() {
        nw4 nw4VarR0 = j47.r0(this);
        sq4 sq4Var = this.c;
        nw4VarR0.e(sq4Var != null ? sq4Var.toString() : "<no holder set>", "holder");
        return nw4VarR0.toString();
    }

    public uq4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new jt(0);
        this.b = 0.0f;
        this.o = false;
        this.s0 = false;
        this.t0 = null;
        h(context);
    }

    public uq4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new jt(0);
        this.b = 0.0f;
        this.o = false;
        this.s0 = false;
        this.t0 = null;
        h(context);
    }
}
