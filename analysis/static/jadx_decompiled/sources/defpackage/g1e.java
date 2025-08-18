package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public class g1e {
    public final View a;
    public final x27 b;
    public final m56 c;
    public final int d;
    public x6g e;
    public int f;
    public boolean g;
    public final Rect h;
    public final Rect i;

    public /* synthetic */ g1e(View view, x27 x27Var, m56 m56Var) {
        this(view, x27Var, m56Var, 7);
    }

    public final void a(v27 v27Var, yq0 yq0Var) {
        int iMax = Math.max(v27Var.d, this.f);
        int iS = au1.s(yq0Var.a);
        if (iS != 0) {
            View view = this.a;
            if (iS == 1) {
                view.setTranslationY(-iMax);
                return;
            }
            if (iS == 2) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), this.h.bottom + iMax);
                return;
            }
            if (iS == 3) {
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
                return;
            }
            if (iS != 4) {
                throw new NoWhenBranchMatchedException();
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = this.i.bottom + iMax;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void b(x6g x6gVar, yq0 yq0Var) {
        a(x6gVar.a.f(this.d), yq0Var);
    }

    public void c(x6g x6gVar) {
        x27 x27Var = this.b;
        int i = x27Var.a;
        if (i != 0) {
            v27 v27VarF = x6gVar.a.f(this.d);
            int iS = au1.s(i);
            if (iS != 0) {
                int i2 = v27VarF.b;
                View view = this.a;
                if (iS == 1) {
                    view.setTranslationY(i2);
                } else if (iS == 2) {
                    view.setPadding(view.getPaddingLeft(), this.h.top + i2, view.getPaddingRight(), view.getPaddingBottom());
                } else if (iS == 3) {
                    view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), view.getPaddingBottom());
                } else {
                    if (iS != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = this.i.top + i2;
                    view.setLayoutParams(marginLayoutParams);
                }
            }
        }
        yq0 yq0Var = x27Var.b;
        if (yq0Var != null) {
            b(x6gVar, yq0Var);
        }
        m56 m56Var = this.c;
        if (m56Var != null) {
            m56Var.invoke(x6gVar);
        }
    }

    public x6g d(x6g x6gVar) {
        return x6gVar;
    }

    public void e() {
        this.g = false;
    }

    public g1e(View view, x27 x27Var, m56 m56Var, int i) {
        this.a = view;
        this.b = x27Var;
        this.c = m56Var;
        this.d = i;
        bqc bqcVar = new bqc(13, this);
        this.h = new Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        this.i = marginLayoutParams != null ? new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin) : new Rect(0, 0, 0, 0);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(view, bqcVar);
        if (view.isAttachedToWindow()) {
            mmf.c(view);
            y27.a.a(this);
        }
        view.addOnAttachStateChangeListener(new ck(10, this));
    }
}
