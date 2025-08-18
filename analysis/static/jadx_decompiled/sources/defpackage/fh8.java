package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class fh8 implements l78, m78 {
    public final Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public long o;

    public fh8(q57 q57Var) {
        this.a = 0;
        this.X = new Handler(Looper.getMainLooper());
        this.Y = q57Var;
    }

    public void a(long j) {
        switch (this.a) {
            case 2:
                this.c = j;
                if (this.b) {
                    ((rhe) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    break;
                }
                break;
            default:
                this.c = j;
                if (this.b) {
                    ((she) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    break;
                }
                break;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    ((rhe) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    break;
                }
                break;
            default:
                if (!this.b) {
                    ((she) this.X).getClass();
                    this.o = SystemClock.elapsedRealtime();
                    this.b = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.l78
    public b3b d() {
        return (b3b) this.Y;
    }

    @Override // defpackage.m78
    public void f(c3b c3bVar) {
        if (this.b) {
            a(t());
        }
        this.Y = c3bVar;
    }

    @Override // defpackage.l78, defpackage.m78
    public long t() {
        switch (this.a) {
            case 2:
                long j = this.c;
                if (!this.b) {
                    return j;
                }
                ((rhe) this.X).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.o;
                return j + (((b3b) this.Y).a == 1.0f ? maf.D(jElapsedRealtime) : jElapsedRealtime * r6.c);
            default:
                long j2 = this.c;
                if (!this.b) {
                    return j2;
                }
                ((she) this.X).getClass();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - this.o;
                return j2 + (((c3b) this.Y).a == 1.0f ? oaf.S(jElapsedRealtime2) : jElapsedRealtime2 * r6.c);
        }
    }

    @Override // defpackage.l78
    public void u(b3b b3bVar) {
        if (this.b) {
            a(t());
        }
        this.Y = b3bVar;
    }

    @Override // defpackage.m78
    /* renamed from: d */
    public c3b mo1d() {
        return (c3b) this.Y;
    }

    public fh8(rhe rheVar) {
        this.a = 2;
        this.X = rheVar;
        this.Y = b3b.o;
    }

    public fh8(she sheVar) {
        this.a = 3;
        this.X = sheVar;
        this.Y = c3b.d;
    }

    public fh8(boolean z, long j, long j2, m56 m56Var, m56 m56Var2) {
        this.a = 1;
        this.b = z;
        this.c = j;
        this.o = j2;
        this.X = m56Var;
        this.Y = m56Var2;
    }
}
