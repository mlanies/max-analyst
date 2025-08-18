package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class l5c extends ji0 {
    public final Resources X;
    public final String Y;
    public Uri Z;
    public AssetFileDescriptor s0;
    public FileInputStream t0;
    public long u0;
    public boolean v0;

    public l5c(Context context) {
        super(false);
        this.X = context.getResources();
        this.Y = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.r24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long L(defpackage.z24 r20) throws com.google.android.exoplayer2.upstream.DataSourceException, android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5c.L(z24):long");
    }

    @Override // defpackage.r24
    public final void close() {
        this.Z = null;
        try {
            try {
                FileInputStream fileInputStream = this.t0;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.t0 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.s0;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.s0 = null;
                    if (this.v0) {
                        this.v0 = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.t0 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.s0;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.s0 = null;
                    if (this.v0) {
                        this.v0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.s0 = null;
                if (this.v0) {
                    this.v0 = false;
                    c();
                }
            }
        }
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.Z;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.u0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.t0;
        int i3 = maf.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.u0 == -1) {
                return -1;
            }
            throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.u0;
        if (j2 != -1) {
            this.u0 = j2 - i4;
        }
        b(i4);
        return i4;
    }
}
