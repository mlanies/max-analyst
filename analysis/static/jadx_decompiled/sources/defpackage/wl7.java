package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public class wl7 implements und {
    public AdapterView.OnItemClickListener A0;
    public AdapterView.OnItemSelectedListener B0;
    public final Handler G0;
    public Rect I0;
    public boolean J0;
    public final ln K0;
    public int Y;
    public int Z;
    public final Context a;
    public ListAdapter b;
    public es4 c;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public g04 y0;
    public View z0;
    public final int o = -2;
    public int X = -2;
    public final int s0 = 1002;
    public int w0 = 0;
    public final int x0 = Integer.MAX_VALUE;
    public final ul7 C0 = new ul7(this, 1);
    public final yb5 D0 = new yb5(1, this);
    public final vl7 E0 = new vl7(this);
    public final ul7 F0 = new ul7(this, 0);
    public final Rect H0 = new Rect();

    public wl7(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.G0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3c.ListPopupWindow, i, i2);
        this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p3c.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p3c.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.Z = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.t0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        ln lnVar = new ln(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p3c.PopupWindow, i, i2);
        if (typedArrayObtainStyledAttributes2.hasValue(p3c.PopupWindow_overlapAnchor)) {
            i6b.c(lnVar, typedArrayObtainStyledAttributes2.getBoolean(p3c.PopupWindow_overlapAnchor, false));
        }
        int i3 = p3c.PopupWindow_android_popupBackground;
        lnVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(i3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i3, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(i3) : s36.n(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.K0 = lnVar;
        lnVar.setInputMethodMode(1);
    }

    @Override // defpackage.und
    public final boolean a() {
        return this.K0.isShowing();
    }

    public final Drawable b() {
        return this.K0.getBackground();
    }

    public final int c() {
        return this.Y;
    }

    public final void d(int i) {
        this.Y = i;
    }

    @Override // defpackage.und
    public final void dismiss() {
        ln lnVar = this.K0;
        lnVar.dismiss();
        lnVar.setContentView(null);
        this.c = null;
        this.G0.removeCallbacks(this.C0);
    }

    @Override // defpackage.und
    public final void f() {
        int i;
        int paddingBottom;
        es4 es4Var;
        es4 es4Var2 = this.c;
        ln lnVar = this.K0;
        Context context = this.a;
        if (es4Var2 == null) {
            es4 es4VarQ = q(context, !this.J0);
            this.c = es4VarQ;
            es4VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.A0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new rl7(0, this));
            this.c.setOnScrollListener(this.E0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.B0;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            lnVar.setContentView(this.c);
        }
        Drawable background = lnVar.getBackground();
        Rect rect = this.H0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.t0) {
                this.Z = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int iA = sl7.a(lnVar, this.z0, this.Z, lnVar.getInputMethodMode() == 2);
        int i3 = this.o;
        if (i3 == -1) {
            paddingBottom = iA + i;
        } else {
            int i4 = this.X;
            int iA2 = this.c.a(i4 != -2 ? i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = this.K0.getInputMethodMode() == 2;
        i6b.d(lnVar, this.s0);
        if (lnVar.isShowing()) {
            if (this.z0.isAttachedToWindow()) {
                int width = this.X;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.z0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    if (z) {
                        lnVar.setWidth(this.X == -1 ? -1 : 0);
                        lnVar.setHeight(0);
                    } else {
                        lnVar.setWidth(this.X == -1 ? -1 : 0);
                        lnVar.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                lnVar.setOutsideTouchable(true);
                View view = this.z0;
                int i5 = this.Y;
                int i6 = this.Z;
                if (width < 0) {
                    width = -1;
                }
                lnVar.update(view, i5, i6, width, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int width2 = this.X;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.z0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        lnVar.setWidth(width2);
        lnVar.setHeight(i3);
        tl7.b(lnVar, true);
        lnVar.setOutsideTouchable(true);
        lnVar.setTouchInterceptor(this.D0);
        if (this.v0) {
            i6b.c(lnVar, this.u0);
        }
        tl7.a(lnVar, this.I0);
        lnVar.showAsDropDown(this.z0, this.Y, this.Z, this.w0);
        this.c.setSelection(-1);
        if ((!this.J0 || this.c.isInTouchMode()) && (es4Var = this.c) != null) {
            es4Var.setListSelectionHidden(true);
            es4Var.requestLayout();
        }
        if (this.J0) {
            return;
        }
        this.G0.post(this.F0);
    }

    public final void i(Drawable drawable) {
        this.K0.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.und
    public final es4 j() {
        return this.c;
    }

    public final void l(int i) {
        this.Z = i;
        this.t0 = true;
    }

    public final int o() {
        if (this.t0) {
            return this.Z;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        g04 g04Var = this.y0;
        if (g04Var == null) {
            this.y0 = new g04(1, this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(g04Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y0);
        }
        es4 es4Var = this.c;
        if (es4Var != null) {
            es4Var.setAdapter(this.b);
        }
    }

    public es4 q(Context context, boolean z) {
        return new es4(context, z);
    }

    public final void r(int i) {
        Drawable background = this.K0.getBackground();
        if (background == null) {
            this.X = i;
            return;
        }
        Rect rect = this.H0;
        background.getPadding(rect);
        this.X = rect.left + rect.right + i;
    }
}
