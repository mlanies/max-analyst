package defpackage;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class s4g implements ka5 {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final sue b;
    public oa5 d;
    public int f;
    public final yaf c = new yaf(3, false);
    public byte[] e = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];

    public s4g(String str, sue sueVar) {
        this.a = str;
        this.b = sueVar;
    }

    public final xze a(long j) {
        xze xzeVarB = this.d.B(0, 3);
        my5 my5Var = new my5();
        my5Var.k = "text/vtt";
        my5Var.c = this.a;
        my5Var.o = j;
        xzeVarB.d(my5Var.a());
        this.d.w();
        return xzeVarB;
    }

    @Override // defpackage.ka5
    public final void d(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.ka5
    public final void g(oa5 oa5Var) {
        this.d = oa5Var;
        oa5Var.M(new pm5(-9223372036854775807L));
    }

    @Override // defpackage.ka5
    public final boolean h(ma5 ma5Var) {
        ra4 ra4Var = (ra4) ma5Var;
        ra4Var.q(this.e, 0, 6, false);
        byte[] bArr = this.e;
        yaf yafVar = this.c;
        yafVar.F(6, bArr);
        if (u4g.a(yafVar)) {
            return true;
        }
        ra4Var.q(this.e, 6, 3, false);
        yafVar.F(9, this.e);
        return u4g.a(yafVar);
    }

    @Override // defpackage.ka5
    public final int i(ma5 ma5Var, lh4 lh4Var) throws ParserException, EOFException, InterruptedIOException {
        String strI;
        this.d.getClass();
        int i = (int) ((ra4) ma5Var).c;
        int i2 = this.f;
        byte[] bArr = this.e;
        if (i2 == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i3 = this.f;
        int i4 = ((ra4) ma5Var).read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.f + i4;
            this.f = i5;
            if (i == -1 || i5 != i) {
                return 0;
            }
        }
        yaf yafVar = new yaf(this.e);
        u4g.d(yafVar);
        String strI2 = yafVar.i();
        long j = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strI2)) {
                while (true) {
                    String strI3 = yafVar.i();
                    if (strI3 == null) {
                        break;
                    }
                    if (u4g.a.matcher(strI3).matches()) {
                        do {
                            strI = yafVar.i();
                            if (strI != null) {
                            }
                        } while (!strI.isEmpty());
                    } else {
                        Matcher matcher2 = p4g.a.matcher(strI3);
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
                long jC2 = u4g.c(strGroup);
                long jB = this.b.b(((((j + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                xze xzeVarA = a(jB - jC2);
                byte[] bArr3 = this.e;
                int i6 = this.f;
                yaf yafVar2 = this.c;
                yafVar2.F(i6, bArr3);
                xzeVarA.c(this.f, yafVar2);
                xzeVarA.b(jB, 1, this.f, 0, null);
                return -1;
            }
            if (strI2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = g.matcher(strI2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, strI2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strI2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher4 = h.matcher(strI2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, strI2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strI2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = u4g.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strI2 = yafVar.i();
        }
    }

    @Override // defpackage.ka5
    public final void release() {
    }
}
