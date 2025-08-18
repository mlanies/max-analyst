package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class rz9 implements f2a, zl4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final long b;
    public zl4 c;
    public long o;

    public /* synthetic */ rz9(Object obj, long j, int i) {
        this.a = i;
        this.Y = obj;
        this.b = j;
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    ((b38) this.Y).b();
                    break;
                }
                break;
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).onError(new NoSuchElementException());
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                if (dm4.f(this.c, zl4Var)) {
                    this.c = zl4Var;
                    ((b38) this.Y).c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.c, zl4Var)) {
                    this.c = zl4Var;
                    ((erd) this.Y).c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    long j = this.o;
                    if (j != this.b) {
                        this.o = j + 1;
                        break;
                    } else {
                        this.X = true;
                        this.c.g();
                        ((b38) this.Y).a(obj);
                        break;
                    }
                }
                break;
            default:
                if (!this.X) {
                    long j2 = this.o;
                    if (j2 != this.b) {
                        this.o = j2 + 1;
                        break;
                    } else {
                        this.X = true;
                        this.c.g();
                        ((erd) this.Y).a(obj);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.c.g();
                break;
            default:
                this.c.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.c.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    ((b38) this.Y).onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                if (!this.X) {
                    this.X = true;
                    ((erd) this.Y).onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }
}
