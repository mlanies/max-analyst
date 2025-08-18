package defpackage;

import android.view.View;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes2.dex */
public final class dk implements l78, m78 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object o;

    public /* synthetic */ dk() {
        this.a = 3;
    }

    @Override // defpackage.m78
    public boolean I() {
        if (this.b) {
            ((fh8) this.o).getClass();
            return false;
        }
        m78 m78Var = (m78) this.Z;
        m78Var.getClass();
        return m78Var.I();
    }

    public kua a() {
        kua kuaVar = new kua();
        kuaVar.a = (CharSequence) this.o;
        kuaVar.b = (IconCompat) this.X;
        kuaVar.c = (String) this.Y;
        kuaVar.d = (String) this.Z;
        kuaVar.e = this.b;
        kuaVar.f = this.c;
        return kuaVar;
    }

    @Override // defpackage.l78
    public b3b d() {
        l78 l78Var = (l78) this.Z;
        return l78Var != null ? l78Var.d() : (b3b) ((fh8) this.o).Y;
    }

    @Override // defpackage.m78
    public void f(c3b c3bVar) {
        m78 m78Var = (m78) this.Z;
        if (m78Var != null) {
            m78Var.f(c3bVar);
            c3bVar = ((m78) this.Z).mo1d();
        }
        ((fh8) this.o).f(c3bVar);
    }

    @Override // defpackage.l78, defpackage.m78
    public long t() {
        switch (this.a) {
            case 1:
                if (this.b) {
                    return ((fh8) this.o).t();
                }
                l78 l78Var = (l78) this.Z;
                l78Var.getClass();
                return l78Var.t();
            default:
                if (this.b) {
                    return ((fh8) this.o).t();
                }
                m78 m78Var = (m78) this.Z;
                m78Var.getClass();
                return m78Var.t();
        }
    }

    @Override // defpackage.l78
    public void u(b3b b3bVar) {
        l78 l78Var = (l78) this.Z;
        if (l78Var != null) {
            l78Var.u(b3bVar);
            b3bVar = ((l78) this.Z).d();
        }
        ((fh8) this.o).u(b3bVar);
    }

    public dk(View view, bk bkVar, l lVar) {
        this.a = 0;
        this.o = view;
        this.X = bkVar;
        this.Y = lVar;
        view.addOnAttachStateChangeListener(new ck(0, this));
    }

    @Override // defpackage.m78
    /* renamed from: d, reason: collision with other method in class */
    public c3b mo1d() {
        m78 m78Var = (m78) this.Z;
        if (m78Var != null) {
            return m78Var.mo1d();
        }
        return (c3b) ((fh8) this.o).Y;
    }

    public dk(f85 f85Var, rhe rheVar) {
        this.a = 1;
        this.X = f85Var;
        this.o = new fh8(rheVar);
        this.b = true;
    }

    public dk(gc4 gc4Var, she sheVar) {
        this.a = 2;
        this.X = gc4Var;
        this.o = new fh8(sheVar);
        this.b = true;
    }
}
