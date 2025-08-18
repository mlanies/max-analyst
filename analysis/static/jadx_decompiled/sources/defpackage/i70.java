package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class i70 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(yaf yafVar) {
        if (this.c) {
            yafVar.I(1);
        } else {
            int iV = yafVar.v();
            int i = (iV >> 4) & 15;
            this.X = i;
            xze xzeVar = (xze) this.b;
            if (i == 2) {
                int i2 = Y[(iV >> 2) & 3];
                my5 my5Var = new my5();
                my5Var.k = "audio/mpeg";
                my5Var.x = 1;
                my5Var.y = i2;
                xzeVar.d(my5Var.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                my5 my5Var2 = new my5();
                my5Var2.k = str;
                my5Var2.x = 1;
                my5Var2.y = 8000;
                xzeVar.d(my5Var2.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException(z7b.h(39, this.X, "Audio format not supported: "));
            }
            this.c = true;
        }
        return true;
    }

    public final boolean a2(long j, yaf yafVar) {
        int i = this.X;
        xze xzeVar = (xze) this.b;
        if (i == 2) {
            int iC = yafVar.c();
            xzeVar.c(iC, yafVar);
            ((xze) this.b).b(j, 1, iC, 0, null);
            return true;
        }
        int iV = yafVar.v();
        if (iV != 0 || this.o) {
            if (this.X == 10 && iV != 1) {
                return false;
            }
            int iC2 = yafVar.c();
            xzeVar.c(iC2, yafVar);
            ((xze) this.b).b(j, 1, iC2, 0, null);
            return true;
        }
        int iC3 = yafVar.c();
        byte[] bArr = new byte[iC3];
        yafVar.g(0, bArr, iC3);
        e eVarJ = z7.J(new s02(bArr, iC3, 1, (byte) 0), false);
        my5 my5Var = new my5();
        my5Var.k = "audio/mp4a-latm";
        my5Var.h = eVarJ.c;
        my5Var.x = eVarJ.b;
        my5Var.y = eVarJ.a;
        my5Var.m = Collections.singletonList(bArr);
        xzeVar.d(new oy5(my5Var));
        this.o = true;
        return false;
    }
}
