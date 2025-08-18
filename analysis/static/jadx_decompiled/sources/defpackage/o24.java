package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class o24 extends ki0 {
    public a34 X;
    public byte[] Y;
    public int Z;
    public int s0;

    @Override // defpackage.t24
    public final long G(a34 a34Var) throws ParserException, DataSourceException {
        d();
        this.X = a34Var;
        Uri uriNormalizeScheme = a34Var.a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        fm9.e("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = oaf.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.Y = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(wg0.i("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.Y = URLDecoder.decode(str, b52.a.name()).getBytes(b52.c);
        }
        byte[] bArr = this.Y;
        long length = bArr.length;
        long j = a34Var.f;
        if (j > length) {
            this.Y = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.Z = i2;
        int length2 = bArr.length - i2;
        this.s0 = length2;
        long j2 = a34Var.g;
        if (j2 != -1) {
            this.s0 = (int) Math.min(length2, j2);
        }
        f(a34Var);
        return j2 != -1 ? j2 : this.s0;
    }

    @Override // defpackage.t24
    public final void close() {
        if (this.Y != null) {
            this.Y = null;
            c();
        }
        this.X = null;
    }

    @Override // defpackage.t24
    public final Uri getUri() {
        a34 a34Var = this.X;
        if (a34Var != null) {
            return a34Var.a;
        }
        return null;
    }

    @Override // defpackage.m24
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
        int i4 = oaf.a;
        System.arraycopy(bArr2, this.Z, bArr, i, iMin);
        this.Z += iMin;
        this.s0 -= iMin;
        b(iMin);
        return iMin;
    }
}
