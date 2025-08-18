package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class n24 extends ji0 {
    public z24 X;
    public byte[] Y;
    public int Z;
    public int s0;

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws DataSourceException, ParserException {
        d();
        this.X = z24Var;
        Uri uri = z24Var.a;
        String scheme = uri.getScheme();
        boolean zEquals = "data".equals(scheme);
        String strValueOf = String.valueOf(scheme);
        np8.c(strValueOf.length() != 0 ? "Unsupported scheme: ".concat(strValueOf) : new String("Unsupported scheme: "), zEquals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = maf.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            String strValueOf2 = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(strValueOf2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(strValueOf2);
            throw new ParserException(sb.toString(), null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.Y = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                String strValueOf3 = String.valueOf(str);
                throw new ParserException(strValueOf3.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(strValueOf3) : new String("Error while parsing Base64 encoded string: "), e, true, 0);
            }
        } else {
            this.Y = URLDecoder.decode(str, b52.a.name()).getBytes(b52.c);
        }
        byte[] bArr = this.Y;
        long length = bArr.length;
        long j = z24Var.f;
        if (j > length) {
            this.Y = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.Z = i2;
        int length2 = bArr.length - i2;
        this.s0 = length2;
        long j2 = z24Var.g;
        if (j2 != -1) {
            this.s0 = (int) Math.min(length2, j2);
        }
        f(z24Var);
        return j2 != -1 ? j2 : this.s0;
    }

    @Override // defpackage.r24
    public final void close() {
        if (this.Y != null) {
            this.Y = null;
            c();
        }
        this.X = null;
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        z24 z24Var = this.X;
        if (z24Var != null) {
            return z24Var.a;
        }
        return null;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.s0;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.Y;
        int i4 = maf.a;
        System.arraycopy(bArr2, this.Z, bArr, i, iMin);
        this.Z += iMin;
        this.s0 -= iMin;
        b(iMin);
        return iMin;
    }
}
