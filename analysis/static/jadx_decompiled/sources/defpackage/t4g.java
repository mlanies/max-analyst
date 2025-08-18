package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class t4g implements la5 {
    public static final Pattern t0 = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern u0 = Pattern.compile("MPEGTS:(-?\\d+)");
    public final boolean X;
    public pa5 Y;
    public final String a;
    public final tue b;
    public final mbe o;
    public int s0;
    public final wpa c = new wpa();
    public byte[] Z = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    public t4g(String str, tue tueVar, b46 b46Var, boolean z) {
        this.a = str;
        this.b = tueVar;
        this.o = b46Var;
        this.X = z;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.Y = this.X ? new k8g(pa5Var, this.o) : pa5Var;
        pa5Var.J(new wd0(-9223372036854775807L));
    }

    public final yze a(long j) {
        yze yzeVarMo6B = this.Y.mo6B(0, 3);
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("text/vtt");
        ny5Var.d = this.a;
        ny5Var.r = j;
        yzeVarMo6B.e(ny5Var.a());
        this.Y.w();
        return yzeVarMo6B;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        String strH;
        this.Y.getClass();
        int i = (int) ((sa4) na5Var).c;
        int i2 = this.s0;
        byte[] bArr = this.Z;
        if (i2 == bArr.length) {
            this.Z = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.Z;
        int i3 = this.s0;
        int i4 = ((sa4) na5Var).read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.s0 + i4;
            this.s0 = i5;
            if (i == -1 || i5 != i) {
                return 0;
            }
        }
        wpa wpaVar = new wpa(this.Z);
        v4g.d(wpaVar);
        String strH2 = wpaVar.h(b52.c);
        long j = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strH2)) {
                while (true) {
                    String strH3 = wpaVar.h(b52.c);
                    if (strH3 == null) {
                        break;
                    }
                    if (v4g.a.matcher(strH3).matches()) {
                        do {
                            strH = wpaVar.h(b52.c);
                            if (strH != null) {
                            }
                        } while (!strH.isEmpty());
                    } else {
                        Matcher matcher2 = q4g.a.matcher(strH3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = v4g.c(strGroup);
                long jB = this.b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                yze yzeVarA = a(jB - jC2);
                byte[] bArr3 = this.Z;
                int i6 = this.s0;
                wpa wpaVar2 = this.c;
                wpaVar2.E(i6, bArr3);
                yzeVarA.b(wpaVar2, this.s0, 0);
                yzeVarA.a(jB, 1, this.s0, 0, null);
                return -1;
            }
            if (strH2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = t0.matcher(strH2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strH2));
                }
                Matcher matcher4 = u0.matcher(strH2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strH2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = v4g.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strH2 = wpaVar.h(b52.c);
        }
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        sa4 sa4Var = (sa4) na5Var;
        sa4Var.q(this.Z, 0, 6, false);
        byte[] bArr = this.Z;
        wpa wpaVar = this.c;
        wpaVar.E(6, bArr);
        if (v4g.a(wpaVar)) {
            return true;
        }
        sa4Var.q(this.Z, 6, 3, false);
        wpaVar.E(9, this.Z);
        return v4g.a(wpaVar);
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
