package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class r6c extends dle implements l7c {
    public m56 X;
    public w5c Y;
    public boolean Z;
    public boolean o;

    public r6c() {
        super(new ww9(28));
        this.o = true;
    }

    @Override // defpackage.l7c
    public final void f(ix8 ix8Var, boolean z) {
        ((b6c) Q()).setOnChipClickListener(this.X);
        w5c w5cVar = this.Y;
        if (w5cVar != null) {
            ((b6c) Q()).setChipObserver(w5cVar);
        }
        ((b6c) Q()).setStackFromEnd(this.Z);
        ((b6c) Q()).setIncoming(this.o);
        ((b6c) Q()).f(ix8Var, z);
        t();
    }

    @Override // defpackage.l7c
    public final void k(is0 is0Var, boolean z) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            b6c b6cVar = (b6c) Q();
            b6cVar.getClass();
            int i = 0;
            while (i < b6cVar.getChildCount()) {
                int i2 = i + 1;
                View childAt = b6cVar.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                z5c z5cVar = (z5c) childAt;
                ls0 ls0Var = is0Var.d;
                bs0 bs0Var = is0Var.a;
                if (z) {
                    gs0 gs0Var = bs0Var.c;
                    z5cVar.s0 = gs0Var.a;
                    z5cVar.t0 = gs0Var.b;
                    ms0 ms0Var = ls0Var.a;
                    z5cVar.u0 = ms0Var.a;
                    z5cVar.v0 = ms0Var.b;
                } else {
                    gs0 gs0Var2 = bs0Var.c;
                    z5cVar.s0 = gs0Var2.c;
                    z5cVar.t0 = gs0Var2.d;
                    ms0 ms0Var2 = ls0Var.a;
                    z5cVar.u0 = ms0Var2.c;
                    z5cVar.v0 = ms0Var2.d;
                }
                z5cVar.invalidate();
                i = i2;
            }
        }
    }

    @Override // defpackage.l7c
    public final void q(boolean z) {
        je7 je7Var = (je7) this.c;
        if (je7Var.a()) {
            ((b6c) Q()).f(null, z);
        }
    }

    @Override // defpackage.l7c
    public final void setChipObserver(w5c w5cVar) {
        if (((je7) this.c).a()) {
            ((b6c) Q()).setChipObserver(w5cVar);
        } else {
            this.Y = w5cVar;
        }
    }

    @Override // defpackage.l7c
    public final void setIsIncoming(boolean z) {
        this.o = z;
    }

    @Override // defpackage.l7c
    public final void setOnClickListener(m56 m56Var) {
        this.X = m56Var;
    }

    @Override // defpackage.l7c
    public final void setStackFromEnd(boolean z) {
        this.Z = z;
    }
}
