package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.math.RoundingMode;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class vrf implements wrf, xrf {
    public static final int[] n = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] o = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public static final int[] p = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] q = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpStatus.SC_TEMPORARY_REDIRECT, 337, 371, HttpStatus.SC_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final /* synthetic */ int a = 0;
    public final int b;
    public final byte[] c;
    public final int d;
    public int e;
    public long f;
    public int g;
    public long h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public vrf(oa5 oa5Var, xze xzeVar, bsf bsfVar) throws ParserException {
        this.i = oa5Var;
        this.j = xzeVar;
        this.k = bsfVar;
        int i = bsfVar.b;
        int iMax = Math.max(1, i / 10);
        this.d = iMax;
        byte[] bArr = bsfVar.e;
        int length = bArr.length;
        byte b = bArr[0];
        byte b2 = bArr[1];
        int i2 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.b = i2;
        int i3 = bsfVar.a;
        int i4 = bsfVar.c;
        int i5 = (((i4 - (i3 * 4)) * 8) / (bsfVar.d * i3)) + 1;
        if (i2 != i5) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i5);
            sb.append("; got: ");
            sb.append(i2);
            throw ParserException.a(null, sb.toString());
        }
        int iG = maf.g(iMax, i2);
        this.c = new byte[iG * i4];
        this.l = new yaf(i2 * 2 * i3 * iG);
        int i6 = ((i4 * i) * 8) / i2;
        my5 my5Var = new my5();
        my5Var.k = "audio/raw";
        my5Var.f = i6;
        my5Var.g = i6;
        my5Var.l = iMax * 2 * i3;
        my5Var.x = i3;
        my5Var.y = i;
        my5Var.z = 2;
        this.m = new oy5(my5Var);
    }

    @Override // defpackage.wrf, defpackage.xrf
    public final void a(long j) {
        switch (this.a) {
            case 0:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
            default:
                this.e = 0;
                this.f = j;
                this.g = 0;
                this.h = 0L;
                break;
        }
    }

    @Override // defpackage.wrf, defpackage.xrf
    public final void b(int i, long j) {
        switch (this.a) {
            case 0:
                ((oa5) this.i).M(new csf((bsf) this.k, this.b, i, j));
                ((xze) this.j).d((oy5) this.m);
                break;
            default:
                ((pa5) this.i).J(new dsf((bsf) this.k, this.b, i, j));
                ((yze) this.j).e((qy5) this.m);
                break;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0047->B:14:0x0047 BREAK  A[LOOP:0: B:6:0x0025->B:13:0x0041], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // defpackage.xrf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(defpackage.sa4 r26, long r27) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrf.c(sa4, long):boolean");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0047->B:14:0x0047 BREAK  A[LOOP:0: B:6:0x0025->B:13:0x0041], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003e -> B:4:0x0022). Please report as a decompilation issue!!! */
    @Override // defpackage.wrf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(defpackage.ra4 r26, long r27) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vrf.d(ra4, long):boolean");
    }

    public final void e(int i) {
        Object obj = this.j;
        Object obj2 = this.k;
        switch (this.a) {
            case 0:
                long J = this.f + maf.J(this.h, 1000000L, r1.b);
                int i2 = i * 2 * ((bsf) obj2).a;
                ((xze) obj).b(J, 1, i2, this.g - i2, null);
                this.h += i;
                this.g -= i2;
                break;
            default:
                long j = this.f;
                long j2 = this.h;
                bsf bsfVar = (bsf) obj2;
                long j3 = bsfVar.b;
                int i3 = oaf.a;
                long jA0 = j + oaf.a0(j2, 1000000L, j3, RoundingMode.FLOOR);
                int i4 = i * 2 * bsfVar.a;
                ((yze) obj).a(jA0, 1, i4, this.g - i4, null);
                this.h += i;
                this.g -= i4;
                break;
        }
    }

    public vrf(pa5 pa5Var, yze yzeVar, bsf bsfVar) throws androidx.media3.common.ParserException {
        this.i = pa5Var;
        this.j = yzeVar;
        this.k = bsfVar;
        int i = bsfVar.b;
        int iMax = Math.max(1, i / 10);
        this.d = iMax;
        wpa wpaVar = new wpa(bsfVar.e);
        wpaVar.n();
        int iN = wpaVar.n();
        this.b = iN;
        int i2 = bsfVar.a;
        int i3 = bsfVar.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (bsfVar.d * i2)) + 1;
        if (iN == i4) {
            int iG = oaf.g(iMax, iN);
            this.c = new byte[iG * i3];
            this.l = new wpa(iN * 2 * i2 * iG);
            int i5 = ((i3 * i) * 8) / iN;
            ny5 ny5Var = new ny5();
            ny5Var.m = ia9.l("audio/raw");
            ny5Var.g = i5;
            ny5Var.h = i5;
            ny5Var.n = iMax * 2 * i2;
            ny5Var.A = i2;
            ny5Var.B = i;
            ny5Var.C = 2;
            this.m = new qy5(ny5Var);
            return;
        }
        throw androidx.media3.common.ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iN);
    }
}
