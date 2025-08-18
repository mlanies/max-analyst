package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class j70 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(wpa wpaVar) {
        if (this.c) {
            wpaVar.H(1);
        } else {
            int iU = wpaVar.u();
            int i = (iU >> 4) & 15;
            this.X = i;
            yze yzeVar = (yze) this.b;
            if (i == 2) {
                int i2 = Y[(iU >> 2) & 3];
                ny5 ny5Var = new ny5();
                ny5Var.m = ia9.l("audio/mpeg");
                ny5Var.A = 1;
                ny5Var.B = i2;
                yzeVar.e(ny5Var.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                ny5 ny5Var2 = new ny5();
                ny5Var2.m = ia9.l(str);
                ny5Var2.A = 1;
                ny5Var2.B = 8000;
                yzeVar.e(ny5Var2.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.X);
            }
            this.c = true;
        }
        return true;
    }

    public final boolean a2(long j, wpa wpaVar) {
        int i = this.X;
        yze yzeVar = (yze) this.b;
        if (i == 2) {
            int iA = wpaVar.a();
            yzeVar.b(wpaVar, iA, 0);
            ((yze) this.b).a(j, 1, iA, 0, null);
            return true;
        }
        int iU = wpaVar.u();
        if (iU != 0 || this.o) {
            if (this.X == 10 && iU != 1) {
                return false;
            }
            int iA2 = wpaVar.a();
            yzeVar.b(wpaVar, iA2, 0);
            ((yze) this.b).a(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = wpaVar.a();
        byte[] bArr = new byte[iA3];
        wpaVar.e(0, bArr, iA3);
        e eVarS = kp.s(new s02(bArr, iA3, 2, (byte) 0), false);
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("audio/mp4a-latm");
        ny5Var.i = eVarS.c;
        ny5Var.A = eVarS.b;
        ny5Var.B = eVarS.a;
        ny5Var.p = Collections.singletonList(bArr);
        yzeVar.e(new qy5(ny5Var));
        this.o = true;
        return false;
    }
}
