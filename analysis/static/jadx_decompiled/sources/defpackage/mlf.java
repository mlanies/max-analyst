package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;

/* loaded from: classes.dex */
public final class mlf extends u2 {
    public int X;
    public boolean Y;
    public boolean Z;
    public final yaf c;
    public final yaf o;
    public int s0;

    public mlf(xze xzeVar) {
        super(10, xzeVar);
        this.c = new yaf(np8.b);
        this.o = new yaf(4);
    }

    public final boolean Z1(yaf yafVar) throws TagPayloadReader$UnsupportedFormatException {
        int iV = yafVar.v();
        int i = (iV >> 4) & 15;
        int i2 = iV & 15;
        if (i2 != 7) {
            throw new TagPayloadReader$UnsupportedFormatException(z7b.h(39, i2, "Video format not supported: "));
        }
        this.s0 = i;
        return i != 5;
    }

    public final boolean a2(long j, yaf yafVar) throws ParserException {
        int iV = yafVar.v();
        byte[] bArr = yafVar.a;
        int i = yafVar.b;
        int i2 = i + 1;
        yafVar.b = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        yafVar.b = i + 2;
        int i4 = ((bArr[i2] & 255) << 8) | i3;
        yafVar.b = i + 3;
        long j2 = (((bArr[r5] & 255) | i4) * 1000) + j;
        xze xzeVar = (xze) this.b;
        if (iV == 0 && !this.Y) {
            byte[] bArr2 = new byte[yafVar.c()];
            yaf yafVar2 = new yaf(bArr2);
            yafVar.g(0, bArr2, yafVar.c());
            td0 td0VarA = td0.a(yafVar2);
            this.X = td0VarA.b;
            my5 my5Var = new my5();
            my5Var.k = "video/avc";
            my5Var.h = td0VarA.f;
            my5Var.p = td0VarA.c;
            my5Var.q = td0VarA.d;
            my5Var.t = td0VarA.e;
            my5Var.m = td0VarA.a;
            xzeVar.d(new oy5(my5Var));
            this.Y = true;
            return false;
        }
        if (iV != 1 || !this.Y) {
            return false;
        }
        int i5 = this.s0 == 1 ? 1 : 0;
        if (!this.Z && i5 == 0) {
            return false;
        }
        yaf yafVar3 = this.o;
        byte[] bArr3 = yafVar3.a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i6 = 4 - this.X;
        int i7 = 0;
        while (yafVar.c() > 0) {
            yafVar.g(i6, yafVar3.a, this.X);
            yafVar3.H(0);
            int iY = yafVar3.y();
            yaf yafVar4 = this.c;
            yafVar4.H(0);
            xzeVar.c(4, yafVar4);
            xzeVar.c(iY, yafVar);
            i7 = i7 + 4 + iY;
        }
        ((xze) this.b).b(j2, i5, i7, 0, null);
        this.Z = true;
        return true;
    }
}
