package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class ela extends LinearLayout implements b5d {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final ArrayList c;
    public AnimatorSet o;
    public int s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;

    public ela(Context context) {
        super(context, null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(xoc.O0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().e);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        i4f.y.b(appCompatTextView, du4.b);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setMode(b7a.o);
        oneMeButton.setSize(c7a.b);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setId(xoc.C0);
        oneMeButton.d(Integer.valueOf(woc.p0), true);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(tu0.G(4 * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(marginLayoutParams);
        this.b = oneMeButton;
        this.c = new ArrayList();
        this.s0 = 1;
        this.t0 = tu0.r(3, new s4a(9));
        this.u0 = tu0.r(3, new s4a(10));
        this.v0 = tu0.r(3, new xda(context, 10));
        setElevation(fk4.d().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(oneMeButton);
        addView(appCompatTextView);
    }

    public static void d(ela elaVar, m56 m56Var, zka zkaVar) {
        elaVar.getPopupWindow().dismiss();
        m56Var.invoke(Integer.valueOf(zkaVar.a));
    }

    private final LinearInterpolator getAppearInterpolator() {
        return (LinearInterpolator) this.t0.getValue();
    }

    private final LinearInterpolator getDisappearInterpolator() {
        return (LinearInterpolator) this.u0.getValue();
    }

    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.v0.getValue();
    }

    @Override // defpackage.b5d
    public final void a() {
        this.s0 = 1;
        e(false);
    }

    @Override // defpackage.b5d
    public final boolean b() {
        return this.s0 == 2;
    }

    @Override // defpackage.b5d
    public final void c(String str, List list, k56 k56Var, m56 m56Var) {
        Collection<zka> collectionSingletonList;
        PopupWindow popupWindow;
        char c;
        OneMeButton oneMeButton;
        setSelectionTitle(str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List listY0 = x53.y0(list, 5);
        int size = list.size() - 5;
        if (size <= 0) {
            collectionSingletonList = nz4.a;
        } else if (size == 1) {
            collectionSingletonList = Collections.singletonList(x53.o0(list));
        } else {
            ArrayList arrayList2 = new ArrayList(size);
            if (list instanceof RandomAccess) {
                int size2 = list.size();
                for (int i = 5; i < size2; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                ListIterator listIterator = list.listIterator(5);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collectionSingletonList = arrayList2;
        }
        boolean z = false;
        if (!collectionSingletonList.isEmpty()) {
            h6b h6bVar = new h6b(getContext(), false);
            h6bVar.setId(xoc.L0);
            for (zka zkaVar : collectionSingletonList) {
                g6b g6bVar = new g6b(h6bVar.getContext(), z);
                g6bVar.c(g6bVar, new eqe(zkaVar.b), null, true, true);
                g6bVar.b(Integer.valueOf(zkaVar.c), Integer.valueOf(lsb.global_icon_primary));
                tu0.K(g6bVar, 300L, new bz0(this, m56Var, zkaVar, 2));
                h6bVar.addView(g6bVar, -1, -2);
                z = false;
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(h6bVar);
        } else {
            popupWindow = null;
        }
        int i2 = 0;
        for (Object obj : listY0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                y53.R();
                throw null;
            }
            zka zkaVar2 = (zka) obj;
            z6a z6aVar = z6a.o;
            c7a c7aVar = c7a.b;
            b7a b7aVar = b7a.o;
            if (i2 == 4 && (!collectionSingletonList.isEmpty())) {
                oneMeButton = new OneMeButton(getContext(), null);
                oneMeButton.setMode(b7aVar);
                oneMeButton.setSize(c7aVar);
                oneMeButton.setAppearance(z6aVar);
                oneMeButton.setId(xoc.K0);
                oneMeButton.d(Integer.valueOf(jub.ic_more_vertical_filled_16), true);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(marginLayoutParams);
                tu0.K(oneMeButton, 300L, new xx5(22, popupWindow));
                c = 65534;
            } else {
                OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
                oneMeButton2.setMode(b7aVar);
                oneMeButton2.setSize(c7aVar);
                oneMeButton2.setAppearance(z6aVar);
                oneMeButton2.setId(xoc.D0);
                oneMeButton2.d(Integer.valueOf(zkaVar2.c), true);
                c = 65534;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMarginStart(tu0.G(8 * fk4.d().getDisplayMetrics().density));
                oneMeButton2.setLayoutParams(marginLayoutParams2);
                tu0.K(oneMeButton2, 300L, new vu5(m56Var, 22, zkaVar2));
                oneMeButton = oneMeButton2;
            }
            arrayList.add(oneMeButton);
            f46.C(oneMeButton, tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(52 * fk4.d().getDisplayMetrics().density));
            addView(oneMeButton);
            i2 = i3;
        }
        if (this.s0 == 2) {
            return;
        }
        this.s0 = 2;
        setCloseListener(new zja(this, 1, k56Var));
        e(true);
    }

    public final void e(boolean z) {
        AnimatorSet animatorSet = this.o;
        if (animatorSet != null) {
            ju0.i(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float alpha = getAlpha();
        float f = z ? 1.0f : 0.0f;
        long jAbs = 200;
        if (alpha != 0.0f && alpha != 1.0f) {
            jAbs = (long) (Math.abs(alpha - f) * 200);
        }
        animatorSet2.setDuration(jAbs);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<ela, Float>) View.ALPHA, alpha, f);
        objectAnimatorOfFloat.setInterpolator(z ? getAppearInterpolator() : getDisappearInterpolator());
        objectAnimatorOfFloat.addListener(new vi2(this, alpha, z));
        boolean z2 = !z;
        final float f2 = z2 ? 1.0f : 0.0f;
        final LinearInterpolator appearInterpolator = z2 ? getAppearInterpolator() : getDisappearInterpolator();
        animatorSet2.playTogether(x53.u0(l6d.i0(new r1f(l6d.Z(new at(7, (ViewGroup) getParent()), new wz7(14, this)), new m56() { // from class: dla
            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                View view = (View) obj;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), f2);
                objectAnimatorOfFloat2.setInterpolator(appearInterpolator);
                return objectAnimatorOfFloat2;
            }
        })), objectAnimatorOfFloat));
        animatorSet2.start();
        this.o = animatorSet2;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
            }
        }
        return true;
    }

    public final void setCloseListener(k56 k56Var) {
        tu0.K(this.b, 300L, new m6(17, k56Var));
    }

    public final void setSelectionTitle(String str) {
        this.a.setText(str);
    }
}
