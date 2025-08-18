package defpackage;

/* loaded from: classes.dex */
public abstract class a9e {
    public final /* synthetic */ int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public final Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;

    public a9e(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.j = new m2a(1);
                this.n = new djb(7);
                break;
            default:
                this.j = new m2a(0);
                this.n = new l7b(8, false);
                break;
        }
    }

    public void a(long j) {
        switch (this.a) {
            case 0:
                this.d = j;
                break;
            default:
                this.d = j;
                break;
        }
    }

    public abstract long b(wpa wpaVar);

    public abstract long c(yaf yafVar);

    public abstract boolean d(wpa wpaVar, long j, djb djbVar);

    public abstract boolean e(yaf yafVar, long j, l7b l7bVar);

    public void f(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    this.n = new l7b(8, false);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
            default:
                if (z) {
                    this.n = new djb(7);
                    this.c = 0L;
                    this.e = 0;
                } else {
                    this.e = 1;
                }
                this.b = -1L;
                this.d = 0L;
                break;
        }
    }
}
