package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* loaded from: classes.dex */
public final class nlf extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final wpa c;
    public final wpa o;
    public int s0;

    public nlf(yze yzeVar) {
        super(11, yzeVar);
        this.c = new wpa(fm9.e);
        this.o = new wpa(4);
    }

    public final boolean Z1(wpa wpaVar) throws TagPayloadReader$UnsupportedFormatException {
        int iU = wpaVar.u();
        int i = (iU >> 4) & 15;
        int i2 = iU & 15;
        if (i2 != 7) {
            throw new TagPayloadReader$UnsupportedFormatException(zr6.h(i2, "Video format not supported: "));
        }
        this.s0 = i;
        return i != 5;
    }

    public final boolean a2(long j, wpa wpaVar) {
        int iU = wpaVar.u();
        byte[] bArr = wpaVar.a;
        int i = wpaVar.b;
        int i2 = i + 1;
        wpaVar.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        wpaVar.b = i + 2;
        int i4 = ((bArr[i2] & 255) << 8) | i3;
        wpaVar.b = i + 3;
        long j2 = (((bArr[r5] & 255) | i4) * 1000) + j;
        yze yzeVar = (yze) this.b;
        if (iU == 0 && !this.Y) {
            byte[] bArr2 = new byte[wpaVar.a()];
            wpa wpaVar2 = new wpa(bArr2);
            wpaVar.e(0, bArr2, wpaVar.a());
            ud0 ud0VarA = ud0.a(wpaVar2);
            this.X = ud0VarA.b;
            ny5 ny5Var = new ny5();
            ny5Var.m = ia9.l("video/avc");
            ny5Var.i = ud0VarA.l;
            ny5Var.s = ud0VarA.c;
            ny5Var.t = ud0VarA.d;
            ny5Var.w = ud0VarA.k;
            ny5Var.p = ud0VarA.a;
            yzeVar.e(ny5Var.a());
            this.Y = true;
            return false;
        }
        if (iU != 1 || !this.Y) {
            return false;
        }
        int i5 = this.s0 == 1 ? 1 : 0;
        if (!this.Z && i5 == 0) {
            return false;
        }
        wpa wpaVar3 = this.o;
        byte[] bArr3 = wpaVar3.a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i6 = 4 - this.X;
        int i7 = 0;
        while (wpaVar.a() > 0) {
            wpaVar.e(i6, wpaVar3.a, this.X);
            wpaVar3.G(0);
            int iY = wpaVar3.y();
            wpa wpaVar4 = this.c;
            wpaVar4.G(0);
            yzeVar.b(wpaVar4, 4, 0);
            yzeVar.b(wpaVar, iY, 0);
            i7 = i7 + 4 + iY;
        }
        ((yze) this.b).a(j2, i5, i7, 0, null);
        this.Z = true;
        return true;
    }
}
