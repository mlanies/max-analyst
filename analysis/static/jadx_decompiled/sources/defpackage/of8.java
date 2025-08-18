package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.mediarouter.app.MediaRouteChooserDialogFragment;
import androidx.mediarouter.app.MediaRouteControllerDialogFragment;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class of8 extends View {
    public static lf8 E0;
    public static final SparseArray F0 = new SparseArray(2);
    public static final int[] G0 = {R.attr.state_checked};
    public static final int[] H0 = {R.attr.state_checkable};
    public final int A0;
    public final int B0;
    public boolean C0;
    public boolean D0;
    public final eh8 a;
    public final mf8 b;
    public wg8 c;
    public ag8 o;
    public boolean s0;
    public int t0;
    public nf8 u0;
    public Drawable v0;
    public int w0;
    public int x0;
    public int y0;
    public final ColorStateList z0;

    public of8(Context context) {
        Drawable.ConstantState constantState;
        int i = 0;
        int i2 = qsb.mediaRouteButtonStyle;
        int i3 = lh8.a;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, lh8.f(context));
        int iH = lh8.h(contextThemeWrapper, qsb.mediaRouteTheme);
        super(iH != 0 ? new ContextThemeWrapper(contextThemeWrapper, iH) : contextThemeWrapper, null, i2);
        this.c = wg8.c;
        this.o = ag8.a;
        this.t0 = 0;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, o3c.MediaRouteButton, i2, 0);
        int[] iArr = o3c.MediaRouteButton;
        WeakHashMap weakHashMap = zmf.a;
        umf.d(this, context2, iArr, null, typedArrayObtainStyledAttributes, i2, 0);
        if (isInEditMode()) {
            this.a = null;
            this.b = null;
            this.v0 = s36.n(context2, typedArrayObtainStyledAttributes.getResourceId(o3c.MediaRouteButton_externalRouteEnabledDrawableStatic, 0));
            return;
        }
        this.a = eh8.d(context2);
        this.b = new mf8(this, i);
        eh8.b();
        dh8 dh8VarF = eh8.c().f();
        int i4 = dh8VarF.d() ^ true ? dh8VarF.h : 0;
        this.y0 = i4;
        this.x0 = i4;
        if (E0 == null) {
            E0 = new lf8(context2.getApplicationContext());
        }
        this.z0 = typedArrayObtainStyledAttributes.getColorStateList(o3c.MediaRouteButton_mediaRouteButtonTint);
        this.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o3c.MediaRouteButton_android_minWidth, 0);
        this.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(o3c.MediaRouteButton_android_minHeight, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o3c.MediaRouteButton_externalRouteEnabledDrawableStatic, 0);
        this.w0 = typedArrayObtainStyledAttributes.getResourceId(o3c.MediaRouteButton_externalRouteEnabledDrawable, 0);
        typedArrayObtainStyledAttributes.recycle();
        int i5 = this.w0;
        SparseArray sparseArray = F0;
        if (i5 != 0 && (constantState = (Drawable.ConstantState) sparseArray.get(i5)) != null) {
            setRemoteIndicatorDrawable(constantState.newDrawable());
        }
        if (this.v0 == null) {
            if (resourceId != 0) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) sparseArray.get(resourceId);
                if (constantState2 != null) {
                    setRemoteIndicatorDrawableInternal(constantState2.newDrawable());
                } else {
                    nf8 nf8Var = new nf8(this, resourceId, getContext());
                    this.u0 = nf8Var;
                    nf8Var.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
                }
            } else {
                a();
            }
        }
        e();
        setClickable(true);
    }

    private Activity getActivity() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    private c getFragmentManager() {
        Activity activity = getActivity();
        if (activity instanceof b) {
            return ((b) activity).S();
        }
        return null;
    }

    public final void a() {
        if (this.w0 > 0) {
            nf8 nf8Var = this.u0;
            if (nf8Var != null) {
                nf8Var.cancel(false);
            }
            nf8 nf8Var2 = new nf8(this, this.w0, getContext());
            this.u0 = nf8Var2;
            this.w0 = 0;
            nf8Var2.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public final void b() {
        this.a.getClass();
        eh8.b();
        dh8 dh8VarF = eh8.c().f();
        boolean z = true;
        boolean z2 = !dh8VarF.d();
        int i = z2 ? dh8VarF.h : 0;
        if (this.y0 != i) {
            this.y0 = i;
            e();
            refreshDrawableState();
        }
        if (i == 1) {
            a();
        }
        if (this.s0) {
            if (!this.C0 && !z2 && !eh8.e(this.c)) {
                z = false;
            }
            setEnabled(z);
        }
    }

    public final void c() {
        int i = this.t0;
        if (i == 0 && !this.C0 && !E0.b) {
            i = 4;
        }
        super.setVisibility(i);
        Drawable drawable = this.v0;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public final boolean d() {
        if (!this.s0) {
            return false;
        }
        eh8 eh8Var = this.a;
        eh8Var.getClass();
        eh8.b();
        eh8.c();
        c fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            throw new IllegalStateException("The activity must be a subclass of FragmentActivity");
        }
        eh8Var.getClass();
        eh8.b();
        if (eh8.c().f().d()) {
            if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteChooserDialogFragment") != null) {
                return false;
            }
            this.o.getClass();
            MediaRouteChooserDialogFragment mediaRouteChooserDialogFragment = new MediaRouteChooserDialogFragment();
            wg8 wg8Var = this.c;
            if (wg8Var == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            mediaRouteChooserDialogFragment.l1();
            if (!mediaRouteChooserDialogFragment.D1.equals(wg8Var)) {
                mediaRouteChooserDialogFragment.D1 = wg8Var;
                Bundle bundle = mediaRouteChooserDialogFragment.Z;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("selector", wg8Var.a);
                mediaRouteChooserDialogFragment.X0(bundle);
                fn fnVar = mediaRouteChooserDialogFragment.C1;
                if (fnVar != null) {
                    if (mediaRouteChooserDialogFragment.B1) {
                        ((gg8) fnVar).h(wg8Var);
                    } else {
                        ((qf8) fnVar).h(wg8Var);
                    }
                }
            }
            he0 he0Var = new he0(fragmentManager);
            he0Var.f(0, mediaRouteChooserDialogFragment, "android.support.v7.mediarouter:MediaRouteChooserDialogFragment", 1);
            he0Var.d(true);
        } else {
            if (fragmentManager.E("android.support.v7.mediarouter:MediaRouteControllerDialogFragment") != null) {
                return false;
            }
            this.o.getClass();
            MediaRouteControllerDialogFragment mediaRouteControllerDialogFragment = new MediaRouteControllerDialogFragment();
            wg8 wg8Var2 = this.c;
            if (wg8Var2 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            if (mediaRouteControllerDialogFragment.D1 == null) {
                Bundle bundle2 = mediaRouteControllerDialogFragment.Z;
                if (bundle2 != null) {
                    Bundle bundle3 = bundle2.getBundle("selector");
                    wg8 wg8Var3 = null;
                    if (bundle3 != null) {
                        wg8Var3 = new wg8(null, bundle3);
                    } else {
                        wg8 wg8Var4 = wg8.c;
                    }
                    mediaRouteControllerDialogFragment.D1 = wg8Var3;
                }
                if (mediaRouteControllerDialogFragment.D1 == null) {
                    mediaRouteControllerDialogFragment.D1 = wg8.c;
                }
            }
            if (!mediaRouteControllerDialogFragment.D1.equals(wg8Var2)) {
                mediaRouteControllerDialogFragment.D1 = wg8Var2;
                Bundle bundle4 = mediaRouteControllerDialogFragment.Z;
                if (bundle4 == null) {
                    bundle4 = new Bundle();
                }
                bundle4.putBundle("selector", wg8Var2.a);
                mediaRouteControllerDialogFragment.X0(bundle4);
                fn fnVar2 = mediaRouteControllerDialogFragment.C1;
                if (fnVar2 != null && mediaRouteControllerDialogFragment.B1) {
                    ((pg8) fnVar2).j(wg8Var2);
                }
            }
            he0 he0Var2 = new he0(fragmentManager);
            he0Var2.f(0, mediaRouteControllerDialogFragment, "android.support.v7.mediarouter:MediaRouteControllerDialogFragment", 1);
            he0Var2.d(true);
        }
        return true;
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.v0 != null) {
            this.v0.setState(getDrawableState());
            if (this.v0.getCurrent() instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) this.v0.getCurrent();
                int i = this.y0;
                if (i == 1 || this.x0 != i) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                } else if (i == 2 && !animationDrawable.isRunning()) {
                    animationDrawable.selectDrawable(animationDrawable.getNumberOfFrames() - 1);
                }
            }
            invalidate();
        }
        this.x0 = this.y0;
    }

    public final void e() {
        int i = this.y0;
        String string = getContext().getString(i != 1 ? i != 2 ? n1c.mr_cast_button_disconnected : n1c.mr_cast_button_connected : n1c.mr_cast_button_connecting);
        setContentDescription(string);
        if (!this.D0 || TextUtils.isEmpty(string)) {
            string = null;
        }
        swe.a(this, string);
    }

    public ag8 getDialogFactory() {
        return this.o;
    }

    public wg8 getRouteSelector() {
        return this.c;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.v0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.s0 = true;
        if (!this.c.c()) {
            this.a.a(this.c, this.b, 0);
        }
        b();
        lf8 lf8Var = E0;
        ArrayList arrayList = lf8Var.c;
        if (arrayList.size() == 0) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            lf8Var.a.registerReceiver(lf8Var, intentFilter);
        }
        arrayList.add(this);
    }

    @Override // android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.a == null) {
            return iArrOnCreateDrawableState;
        }
        int i2 = this.y0;
        if (i2 == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H0);
        } else if (i2 == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.s0 = false;
            if (!this.c.c()) {
                this.a.f(this.b);
            }
            lf8 lf8Var = E0;
            ArrayList arrayList = lf8Var.c;
            arrayList.remove(this);
            if (arrayList.size() == 0) {
                lf8Var.a.unregisterReceiver(lf8Var);
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.v0 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            int intrinsicWidth = this.v0.getIntrinsicWidth();
            int intrinsicHeight = this.v0.getIntrinsicHeight();
            int i = (((width - paddingLeft) - intrinsicWidth) / 2) + paddingLeft;
            int i2 = (((height - paddingTop) - intrinsicHeight) / 2) + paddingTop;
            this.v0.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.v0.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Drawable drawable = this.v0;
        int paddingBottom = 0;
        if (drawable != null) {
            paddingRight = getPaddingRight() + getPaddingLeft() + drawable.getIntrinsicWidth();
        } else {
            paddingRight = 0;
        }
        int iMax = Math.max(this.A0, paddingRight);
        Drawable drawable2 = this.v0;
        if (drawable2 != null) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + drawable2.getIntrinsicHeight();
        }
        int iMax2 = Math.max(this.B0, paddingBottom);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, iMax);
        } else if (mode != 1073741824) {
            size = iMax;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iMax2);
        } else if (mode2 != 1073741824) {
            size2 = iMax2;
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performClick() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of8.performClick():boolean");
    }

    public void setAlwaysVisible(boolean z) {
        if (z != this.C0) {
            this.C0 = z;
            c();
            b();
        }
    }

    public void setCheatSheetEnabled(boolean z) {
        if (z != this.D0) {
            this.D0 = z;
            e();
        }
    }

    public void setDialogFactory(ag8 ag8Var) {
        if (ag8Var == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        this.o = ag8Var;
    }

    public void setRemoteIndicatorDrawable(Drawable drawable) {
        this.w0 = 0;
        setRemoteIndicatorDrawableInternal(drawable);
    }

    public void setRemoteIndicatorDrawableInternal(Drawable drawable) {
        nf8 nf8Var = this.u0;
        if (nf8Var != null) {
            nf8Var.cancel(false);
        }
        Drawable drawable2 = this.v0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.v0);
        }
        if (drawable != null) {
            ColorStateList colorStateList = this.z0;
            if (colorStateList != null) {
                drawable = drawable.mutate();
                aq4.h(drawable, colorStateList);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
        }
        this.v0 = drawable;
        refreshDrawableState();
    }

    public void setRouteSelector(wg8 wg8Var) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.c.equals(wg8Var)) {
            return;
        }
        if (this.s0) {
            boolean zC = this.c.c();
            mf8 mf8Var = this.b;
            eh8 eh8Var = this.a;
            if (!zC) {
                eh8Var.f(mf8Var);
            }
            if (!wg8Var.c()) {
                eh8Var.a(wg8Var, mf8Var, 0);
            }
        }
        this.c = wg8Var;
        b();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.t0 = i;
        c();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v0;
    }
}
