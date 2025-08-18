package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.f16;
import defpackage.he0;
import defpackage.m3c;
import defpackage.pxb;
import defpackage.x6g;
import defpackage.zmf;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Le5f;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/a;", "F", "getFragment", "()Landroidx/fragment/app/a;", "fragment_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean o;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.o = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3c.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(m3c.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.b.contains(view)) {
            this.a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(pxb.fragment_container_view_tag);
        if ((tag instanceof a ? (a) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        x6g x6gVarF = x6g.f(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        x6g x6gVarF2 = onApplyWindowInsetsListener != null ? x6g.f(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : zmf.f(this, x6gVarF);
        if (!x6gVarF2.a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                zmf.b(getChildAt(i), x6gVarF2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.o) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.o) {
            ArrayList arrayList = this.a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.b.remove(view);
        if (this.a.remove(view)) {
            this.o = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends a> F getFragment() {
        b bVar;
        a aVar;
        c cVarS;
        View view = this;
        while (true) {
            bVar = null;
            if (view == null) {
                aVar = null;
                break;
            }
            Object tag = view.getTag(pxb.fragment_container_view_tag);
            aVar = tag instanceof a ? (a) tag : null;
            if (aVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (aVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof b) {
                    bVar = (b) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (bVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            cVarS = bVar.S();
        } else {
            if (!aVar.o0()) {
                throw new IllegalStateException("The Fragment " + aVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            cVarS = aVar.c0();
        }
        return (F) cVarS.D(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            a(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.o = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, c cVar) {
        View view;
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.o = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m3c.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(m3c.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(m3c.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        a aVarD = cVar.D(id);
        if (classAttribute != null && aVarD == null) {
            if (id == -1) {
                throw new IllegalStateException(zr6.i("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            f16 f16VarJ = cVar.J();
            context.getClassLoader();
            a aVarA = f16VarJ.a(classAttribute);
            aVarA.J0 = id;
            aVarA.K0 = id;
            aVarA.L0 = string;
            aVarA.F0 = cVar;
            aVarA.G0 = cVar.w;
            aVarA.F0(attributeSet, null);
            he0 he0Var = new he0(cVar);
            he0Var.o = true;
            aVarA.T0 = this;
            aVarA.B0 = true;
            he0Var.f(getId(), aVarA, string, 1);
            if (!he0Var.g) {
                he0Var.q.B(he0Var, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = cVar.c.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            a aVar = eVar.c;
            if (aVar.K0 == getId() && (view = aVar.U0) != null && view.getParent() == null) {
                aVar.T0 = this;
                eVar.b();
                eVar.k();
            }
        }
    }
}
