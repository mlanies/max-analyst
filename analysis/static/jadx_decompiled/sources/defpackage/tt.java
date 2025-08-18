package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class tt extends ji0 {
    public final AssetManager X;
    public Uri Y;
    public InputStream Z;
    public long s0;
    public boolean t0;

    public tt(Context context) {
        super(false);
        this.X = context.getAssets();
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws IOException {
        try {
            Uri uri = z24Var.a;
            long j = z24Var.f;
            this.Y = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            d();
            InputStream inputStreamOpen = this.X.open(path, 1);
            this.Z = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSource$AssetDataSourceException(null, 2008);
            }
            long j2 = z24Var.g;
            if (j2 != -1) {
                this.s0 = j2;
            } else {
                long jAvailable = this.Z.available();
                this.s0 = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.s0 = -1L;
                }
            }
            this.t0 = true;
            f(z24Var);
            return this.s0;
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSource$AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.r24
    public final void close() {
        this.Y = null;
        try {
            try {
                InputStream inputStream = this.Z;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        } finally {
            this.Z = null;
            if (this.t0) {
                this.t0 = false;
                c();
            }
        }
    }

    @Override // defpackage.r24
    public final Uri getUri() {
        return this.Y;
    }

    @Override // defpackage.l24
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSource$AssetDataSourceException(e, 2000);
            }
        }
        InputStream inputStream = this.Z;
        int i3 = maf.a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.s0;
        if (j2 != -1) {
            this.s0 = j2 - i4;
        }
        b(i4);
        return i4;
    }
}
