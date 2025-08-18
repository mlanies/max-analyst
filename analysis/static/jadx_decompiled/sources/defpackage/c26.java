package defpackage;

/* loaded from: classes.dex */
public final class c26 {
    public final xze a;
    public zze d;
    public hd4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final pze b = new pze(0);
    public final yaf c = new yaf(3, false);
    public final yaf j = new yaf(1);
    public final yaf k = new yaf(3, false);

    public c26(xze xzeVar, zze zzeVar, hd4 hd4Var) {
        this.a = xzeVar;
        this.d = zzeVar;
        this.e = hd4Var;
        this.d = zzeVar;
        this.e = hd4Var;
        xzeVar.d(zzeVar.a.f);
        d();
    }

    public final nze a() {
        if (!this.l) {
            return null;
        }
        pze pzeVar = this.b;
        hd4 hd4Var = (hd4) pzeVar.o;
        int i = maf.a;
        int i2 = hd4Var.a;
        nze nzeVar = (nze) pzeVar.p;
        if (nzeVar == null) {
            nze[] nzeVarArr = this.d.a.k;
            nzeVar = nzeVarArr == null ? null : nzeVarArr[i2];
        }
        if (nzeVar == null || !nzeVar.a) {
            return null;
        }
        return nzeVar;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.f;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i, int i2) {
        yaf yafVar;
        nze nzeVarA = a();
        if (nzeVarA == null) {
            return 0;
        }
        pze pzeVar = this.b;
        int length = nzeVarA.d;
        if (length != 0) {
            yafVar = (yaf) pzeVar.q;
        } else {
            int i3 = maf.a;
            byte[] bArr = nzeVarA.e;
            int length2 = bArr.length;
            yaf yafVar2 = this.k;
            yafVar2.F(length2, bArr);
            length = bArr.length;
            yafVar = yafVar2;
        }
        boolean z = pzeVar.j && pzeVar.k[this.f];
        boolean z2 = z || i2 != 0;
        yaf yafVar3 = this.j;
        yafVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        yafVar3.H(0);
        xze xzeVar = this.a;
        xzeVar.c(1, yafVar3);
        xzeVar.c(length, yafVar);
        if (!z2) {
            return length + 1;
        }
        yaf yafVar4 = this.c;
        if (!z) {
            yafVar4.E(8);
            byte[] bArr2 = yafVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            xzeVar.c(8, yafVar4);
            return length + 9;
        }
        yaf yafVar5 = (yaf) pzeVar.q;
        int iA = yafVar5.A();
        yafVar5.I(-2);
        int i4 = (iA * 6) + 2;
        if (i2 != 0) {
            yafVar4.E(i4);
            byte[] bArr3 = yafVar4.a;
            yafVar5.g(0, bArr3, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            yafVar4 = yafVar5;
        }
        xzeVar.c(i4, yafVar4);
        return length + 1 + i4;
    }

    public final void d() {
        pze pzeVar = this.b;
        pzeVar.c = 0;
        pzeVar.m = 0L;
        pzeVar.n = false;
        pzeVar.j = false;
        pzeVar.l = false;
        pzeVar.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
