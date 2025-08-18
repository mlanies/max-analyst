package defpackage;

/* loaded from: classes2.dex */
public abstract class ol {
    public final long a;
    public dle b;
    public pl c;

    public ol(long j) {
        this.a = j;
    }

    public abstract dle i();

    public final pk j() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.a();
    }

    public final f5a k() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (f5a) plVar.f.getValue();
    }

    public final av0 l() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.b();
    }

    public final p82 m() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.c();
    }

    public final el3 n() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (el3) plVar.k.getValue();
    }

    public final js7 o() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (js7) plVar.R.getValue();
    }

    public final au8 p() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.d();
    }

    public final xb9 q() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (xb9) plVar.m.getValue();
    }

    public final m7b r() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return (m7b) plVar.c.getValue();
    }

    public final dle s() {
        if (this.b == null) {
            this.b = i();
        }
        return this.b;
    }

    public final eoe t() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.e();
    }

    public String toString() {
        return getClass().getSimpleName() + "/requestId: " + this.a;
    }
}
