package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class hr0 extends cr0 {
    public final Boolean a;
    public final x6g b;
    public Window c;
    public boolean d;

    public hr0(View view, x6g x6gVar) {
        ColorStateList colorStateListG;
        this.b = x6gVar;
        q18 q18Var = BottomSheetBehavior.C(view).i;
        if (q18Var != null) {
            colorStateListG = q18Var.a.c;
        } else {
            WeakHashMap weakHashMap = zmf.a;
            colorStateListG = omf.g(view);
        }
        if (colorStateListG != null) {
            this.a = Boolean.valueOf(mr0.J(colorStateListG.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListR = oag.r(view.getBackground());
        Integer numValueOf = colorStateListR != null ? Integer.valueOf(colorStateListR.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(mr0.J(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.cr0
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.cr0
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.cr0
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        x6g x6gVar = this.b;
        if (top < x6gVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                new a7g(window, window.getDecorView()).b(bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), x6gVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                new a7g(window2, window2.getDecorView()).b(this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            this.d = new a7g(window, window.getDecorView()).a.m();
        }
    }
}
