package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class c6g extends j7 implements uq8 {
    public i7 X;
    public WeakReference Y;
    public final /* synthetic */ d6g Z;
    public final Context c;
    public final wq8 o;

    public c6g(d6g d6gVar, Context context, imc imcVar) {
        this.Z = d6gVar;
        this.c = context;
        this.X = imcVar;
        wq8 wq8Var = new wq8(context);
        wq8Var.w0 = 1;
        this.o = wq8Var;
        wq8Var.X = this;
    }

    @Override // defpackage.uq8
    public final void Q(wq8 wq8Var) {
        if (this.X == null) {
            return;
        }
        g();
        e7 e7Var = this.Z.t0.o;
        if (e7Var != null) {
            e7Var.l();
        }
    }

    @Override // defpackage.j7
    public final void a() {
        d6g d6gVar = this.Z;
        if (d6gVar.w0 != this) {
            return;
        }
        if (d6gVar.D0) {
            d6gVar.x0 = this;
            d6gVar.y0 = this.X;
        } else {
            this.X.l(this);
        }
        this.X = null;
        d6gVar.c0(false);
        ActionBarContextView actionBarContextView = d6gVar.t0;
        if (actionBarContextView.y0 == null) {
            actionBarContextView.e();
        }
        d6gVar.Y.setHideOnContentScrollEnabled(d6gVar.I0);
        d6gVar.w0 = null;
    }

    @Override // defpackage.j7
    public final View b() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.j7
    public final wq8 c() {
        return this.o;
    }

    @Override // defpackage.j7
    public final MenuInflater d() {
        return new ude(this.c);
    }

    @Override // defpackage.j7
    public final CharSequence e() {
        return this.Z.t0.getSubtitle();
    }

    @Override // defpackage.j7
    public final CharSequence f() {
        return this.Z.t0.getTitle();
    }

    @Override // defpackage.j7
    public final void g() {
        if (this.Z.w0 != this) {
            return;
        }
        wq8 wq8Var = this.o;
        wq8Var.w();
        try {
            this.X.G(this, wq8Var);
        } finally {
            wq8Var.v();
        }
    }

    @Override // defpackage.j7
    public final boolean h() {
        return this.Z.t0.G0;
    }

    @Override // defpackage.j7
    public final void i(View view) {
        this.Z.t0.setCustomView(view);
        this.Y = new WeakReference(view);
    }

    @Override // defpackage.j7
    public final void j(int i) {
        k(this.Z.o.getResources().getString(i));
    }

    @Override // defpackage.j7
    public final void k(CharSequence charSequence) {
        this.Z.t0.setSubtitle(charSequence);
    }

    @Override // defpackage.j7
    public final void l(int i) {
        m(this.Z.o.getResources().getString(i));
    }

    @Override // defpackage.j7
    public final void m(CharSequence charSequence) {
        this.Z.t0.setTitle(charSequence);
    }

    @Override // defpackage.j7
    public final void n(boolean z) {
        this.a = z;
        this.Z.t0.setTitleOptional(z);
    }

    @Override // defpackage.uq8
    public final boolean z(wq8 wq8Var, MenuItem menuItem) {
        i7 i7Var = this.X;
        if (i7Var != null) {
            return i7Var.i(this, menuItem);
        }
        return false;
    }
}
