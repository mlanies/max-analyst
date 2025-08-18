package defpackage;

/* loaded from: classes.dex */
public final class d26 {
    public final yze a;
    public a0f d;
    public id4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean l;
    public final pze b = new pze(1);
    public final wpa c = new wpa();
    public final wpa j = new wpa(1);
    public final wpa k = new wpa();

    public d26(yze yzeVar, a0f a0fVar, id4 id4Var) {
        this.a = yzeVar;
        this.d = a0fVar;
        this.e = id4Var;
        this.d = a0fVar;
        this.e = id4Var;
        yzeVar.e(a0fVar.a.f);
        d();
    }

    public final oze a() {
        if (!this.l) {
            return null;
        }
        pze pzeVar = this.b;
        id4 id4Var = (id4) pzeVar.o;
        int i = oaf.a;
        int i2 = id4Var.a;
        oze ozeVar = (oze) pzeVar.p;
        if (ozeVar == null) {
            oze[] ozeVarArr = this.d.a.k;
            ozeVar = ozeVarArr == null ? null : ozeVarArr[i2];
        }
        if (ozeVar == null || !ozeVar.a) {
            return null;
        }
        return ozeVar;
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
        wpa wpaVar;
        oze ozeVarA = a();
        if (ozeVarA == null) {
            return 0;
        }
        pze pzeVar = this.b;
        int length = ozeVarA.d;
        if (length != 0) {
            wpaVar = (wpa) pzeVar.q;
        } else {
            int i3 = oaf.a;
            byte[] bArr = ozeVarA.e;
            int length2 = bArr.length;
            wpa wpaVar2 = this.k;
            wpaVar2.E(length2, bArr);
            length = bArr.length;
            wpaVar = wpaVar2;
        }
        boolean z = pzeVar.j && pzeVar.k[this.f];
        boolean z2 = z || i2 != 0;
        wpa wpaVar3 = this.j;
        wpaVar3.a[0] = (byte) ((z2 ? 128 : 0) | length);
        wpaVar3.G(0);
        yze yzeVar = this.a;
        yzeVar.b(wpaVar3, 1, 1);
        yzeVar.b(wpaVar, length, 1);
        if (!z2) {
            return length + 1;
        }
        wpa wpaVar4 = this.c;
        if (!z) {
            wpaVar4.D(8);
            byte[] bArr2 = wpaVar4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i2 & 255);
            bArr2[4] = (byte) ((i >> 24) & 255);
            bArr2[5] = (byte) ((i >> 16) & 255);
            bArr2[6] = (byte) ((i >> 8) & 255);
            bArr2[7] = (byte) (i & 255);
            yzeVar.b(wpaVar4, 8, 1);
            return length + 9;
        }
        wpa wpaVar5 = (wpa) pzeVar.q;
        int iA = wpaVar5.A();
        wpaVar5.H(-2);
        int i4 = (iA * 6) + 2;
        if (i2 != 0) {
            wpaVar4.D(i4);
            byte[] bArr3 = wpaVar4.a;
            wpaVar5.e(0, bArr3, i4);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & 255);
            bArr3[3] = (byte) (i5 & 255);
        } else {
            wpaVar4 = wpaVar5;
        }
        yzeVar.b(wpaVar4, i4, 1);
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
