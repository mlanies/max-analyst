package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class uxd extends j7 implements uq8 {
    public i7 X;
    public WeakReference Y;
    public boolean Z;
    public Context c;
    public ActionBarContextView o;
    public wq8 s0;

    @Override // defpackage.uq8
    public final void Q(wq8 wq8Var) {
        g();
        e7 e7Var = this.o.o;
        if (e7Var != null) {
            e7Var.l();
        }
    }

    @Override // defpackage.j7
    public final void a() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.X.l(this);
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
        return this.s0;
    }

    @Override // defpackage.j7
    public final MenuInflater d() {
        return new ude(this.o.getContext());
    }

    @Override // defpackage.j7
    public final CharSequence e() {
        return this.o.getSubtitle();
    }

    @Override // defpackage.j7
    public final CharSequence f() {
        return this.o.getTitle();
    }

    @Override // defpackage.j7
    public final void g() {
        this.X.G(this, this.s0);
    }

    @Override // defpackage.j7
    public final boolean h() {
        return this.o.G0;
    }

    @Override // defpackage.j7
    public final void i(View view) {
        this.o.setCustomView(view);
        this.Y = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.j7
    public final void j(int i) {
        k(this.c.getString(i));
    }

    @Override // defpackage.j7
    public final void k(CharSequence charSequence) {
        this.o.setSubtitle(charSequence);
    }

    @Override // defpackage.j7
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.j7
    public final void m(CharSequence charSequence) {
        this.o.setTitle(charSequence);
    }

    @Override // defpackage.j7
    public final void n(boolean z) {
        this.a = z;
        this.o.setTitleOptional(z);
    }

    @Override // defpackage.uq8
    public final boolean z(wq8 wq8Var, MenuItem menuItem) {
        return this.X.i(this, menuItem);
    }
}
