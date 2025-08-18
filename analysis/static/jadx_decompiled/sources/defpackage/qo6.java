package defpackage;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qo6 {
    public final y7c b;
    public int e;
    public int f;
    public int g = 4096;
    public final ArrayList a = new ArrayList();
    public vi6[] c = new vi6[8];
    public int d = 7;

    public qo6(mp6 mp6Var) {
        this.b = new y7c(mp6Var);
    }

    public final int a(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.c.length;
            while (true) {
                length--;
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.c[length].a;
                i -= i4;
                this.f -= i4;
                this.e--;
                i3++;
            }
            vi6[] vi6VarArr = this.c;
            System.arraycopy(vi6VarArr, i2 + 1, vi6VarArr, i2 + 1 + i3, this.e);
            this.d += i3;
        }
        return i3;
    }

    public final aw0 b(int i) throws IOException {
        if (i >= 0) {
            vi6[] vi6VarArr = so6.a;
            if (i <= vi6VarArr.length - 1) {
                return vi6VarArr[i].b;
            }
        }
        int length = this.d + 1 + (i - so6.a.length);
        if (length >= 0) {
            vi6[] vi6VarArr2 = this.c;
            if (length < vi6VarArr2.length) {
                return vi6VarArr2[length].b;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    public final void c(vi6 vi6Var) {
        this.a.add(vi6Var);
        int i = this.g;
        int i2 = vi6Var.a;
        if (i2 > i) {
            ys.c0(this.c, null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
            return;
        }
        a((this.f + i2) - i);
        int i3 = this.e + 1;
        vi6[] vi6VarArr = this.c;
        if (i3 > vi6VarArr.length) {
            vi6[] vi6VarArr2 = new vi6[vi6VarArr.length * 2];
            System.arraycopy(vi6VarArr, 0, vi6VarArr2, vi6VarArr.length, vi6VarArr.length);
            this.d = this.c.length - 1;
            this.c = vi6VarArr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        this.c[i4] = vi6Var;
        this.e++;
        this.f += i2;
    }

    public final aw0 d() {
        int i;
        y7c y7cVar = this.b;
        byte b = y7cVar.readByte();
        byte[] bArr = naf.a;
        int i2 = b & 255;
        int i3 = 0;
        boolean z = (b & 128) == 128;
        long jE = e(i2, 127);
        if (!z) {
            return y7cVar.e(jE);
        }
        bt0 bt0Var = new bt0();
        l2a l2aVar = cr6.c;
        l2a l2aVar2 = l2aVar;
        int i4 = 0;
        for (long j = 0; j < jE; j++) {
            byte b2 = y7cVar.readByte();
            byte[] bArr2 = naf.a;
            i3 = (i3 << 8) | (b2 & 255);
            i4 += 8;
            while (i4 >= 8) {
                int i5 = i4 - 8;
                l2aVar2 = ((l2a[]) l2aVar2.o)[(i3 >>> i5) & 255];
                if (((l2a[]) l2aVar2.o) == null) {
                    bt0Var.u0(l2aVar2.b);
                    i4 -= l2aVar2.c;
                    l2aVar2 = l2aVar;
                } else {
                    i4 = i5;
                }
            }
        }
        while (i4 > 0) {
            l2a l2aVar3 = ((l2a[]) l2aVar2.o)[(i3 << (8 - i4)) & 255];
            if (((l2a[]) l2aVar3.o) != null || (i = l2aVar3.c) > i4) {
                break;
            }
            bt0Var.u0(l2aVar3.b);
            i4 -= i;
            l2aVar2 = l2aVar;
        }
        return bt0Var.e(bt0Var.b);
    }

    public final int e(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte b = this.b.readByte();
            byte[] bArr = naf.a;
            int i5 = b & 255;
            if ((b & 128) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (b & Byte.MAX_VALUE) << i4;
            i4 += 7;
        }
    }
}
