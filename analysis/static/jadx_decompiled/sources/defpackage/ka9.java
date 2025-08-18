package defpackage;

import org.apache.http.entity.ContentLengthStrategy;

/* loaded from: classes2.dex */
public final class ka9 implements pn7 {
    public final n64 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public int g;

    public ka9(ve veVar) {
        String name = ka9.class.getName();
        this.a = new n64(1);
        this.b = veVar.a * 1000;
        this.c = veVar.b * 1000;
        this.d = veVar.c * 1000;
        this.e = veVar.d * 1000;
        this.f = veVar.e;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, toString(), null);
        }
    }

    @Override // defpackage.pn7
    public final boolean a() {
        return false;
    }

    @Override // defpackage.pn7
    public final boolean b(long j) {
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        return c == 2 || (c == 1 && !(this.a.a() >= this.g));
    }

    @Override // defpackage.pn7
    public final void c(j4b j4bVar) {
        this.g = 0;
        n64 n64Var = this.a;
        synchronized (n64Var) {
            if (n64Var.b) {
                n64Var.c(0);
            }
        }
    }

    @Override // defpackage.pn7
    public final void d(j4b j4bVar) {
        this.g = 0;
        n64 n64Var = this.a;
        synchronized (n64Var) {
            if (n64Var.b) {
                n64Var.c(0);
            }
        }
    }

    @Override // defpackage.pn7
    public final boolean e(long j, boolean z) {
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    @Override // defpackage.pn7
    public final long f() {
        return 0L;
    }

    @Override // defpackage.pn7
    public final void g(j4b j4bVar) {
        this.g = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pn7
    public final void h(j4b j4bVar, vj0[] vj0VarArr, n85[] n85VarArr) {
        int i;
        int i2;
        this.g = 0;
        int length = vj0VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            n85 n85Var = n85VarArr[i3];
            if (n85Var != null) {
                qy5 qy5VarJ = n85Var.j();
                int i4 = this.g;
                int i5 = qy5VarJ.o;
                if (i5 == -1) {
                    int i6 = vj0VarArr[i3].b;
                    i = 65536;
                    switch (i6) {
                        case ContentLengthStrategy.CHUNKED /* -2 */:
                            i = 0;
                            break;
                        case -1:
                        default:
                            throw new IllegalArgumentException(zr6.h(i6, "Unexpected type of the track="));
                        case 0:
                            i2 = 5373952;
                            i = i2;
                            break;
                        case 1:
                        case 3:
                            break;
                        case 2:
                            i2 = 5242880;
                            i = i2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i = 131072;
                            break;
                    }
                } else {
                    i = this.f * i5;
                }
                this.g = i4 + i;
            }
        }
        this.a.c(this.g);
    }

    @Override // defpackage.pn7
    public final n64 j() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinSizeLoadControl(\n        minBufferUs=");
        sb.append(this.b);
        sb.append("\n        maxBufferUs=");
        sb.append(this.c);
        sb.append("\n        playbackBufferUs=");
        sb.append(this.d);
        sb.append("\n        playbackBufferAfterRebufferUs=");
        sb.append(this.e);
        sb.append("\n        formatMaxInputSizeScaleUpFactor=");
        return zr6.j(sb, this.f, "\n        )\n        ");
    }
}
