package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class ae0 implements la5 {
    public final /* synthetic */ int a;
    public final wpa b;
    public final krd c;

    public ae0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/heif");
                break;
            case 2:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/webp");
                break;
            default:
                this.b = new wpa(4);
                this.c = new krd(-1, -1, "image/avif");
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        switch (this.a) {
            case 0:
                this.c.S(pa5Var);
                break;
            case 1:
                this.c.S(pa5Var);
                break;
            default:
                this.c.S(pa5Var);
                break;
        }
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.c.d(j, j2);
                break;
            case 1:
                this.c.d(j, j2);
                break;
            default:
                this.c.d(j, j2);
                break;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        switch (this.a) {
        }
        return this.c.g(na5Var, lh4Var);
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) throws EOFException, InterruptedIOException {
        switch (this.a) {
            case 0:
                ((sa4) na5Var).b(4, false);
                sa4 sa4Var = (sa4) na5Var;
                wpa wpaVar = this.b;
                wpaVar.D(4);
                sa4Var.q(wpaVar.a, 0, 4, false);
                if (wpaVar.w() == 1718909296) {
                    wpaVar.D(4);
                    sa4Var.q(wpaVar.a, 0, 4, false);
                    if (wpaVar.w() == 1635150182) {
                    }
                }
                break;
            case 1:
                ((sa4) na5Var).b(4, false);
                sa4 sa4Var2 = (sa4) na5Var;
                wpa wpaVar2 = this.b;
                wpaVar2.D(4);
                sa4Var2.q(wpaVar2.a, 0, 4, false);
                if (wpaVar2.w() == 1718909296) {
                    wpaVar2.D(4);
                    sa4Var2.q(wpaVar2.a, 0, 4, false);
                    if (wpaVar2.w() == 1751476579) {
                    }
                }
                break;
            default:
                wpa wpaVar3 = this.b;
                wpaVar3.D(4);
                ((sa4) na5Var).q(wpaVar3.a, 0, 4, false);
                if (wpaVar3.w() == 1380533830) {
                    sa4 sa4Var3 = (sa4) na5Var;
                    sa4Var3.b(4, false);
                    wpaVar3.D(4);
                    sa4Var3.q(wpaVar3.a, 0, 4, false);
                    if (wpaVar3.w() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.la5
    public final void release() {
        int i = this.a;
    }
}
