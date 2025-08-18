package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class ug5 extends ji0 {
    public RandomAccessFile X;
    public Uri Y;
    public long Z;
    public boolean s0;

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws IOException {
        Uri uri = z24Var.a;
        long j = z24Var.f;
        this.Y = uri;
        d();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.X = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = z24Var.g;
                if (length == -1) {
                    length = this.X.length() - j;
                }
                this.Z = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(null, null, 2008);
                }
                this.s0 = true;
                f(z24Var);
                return this.Z;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, (maf.a < 21 || !qg5.b(e2.getCause())) ? 2005 : 2006);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbK = k7d.k("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbK.append(fragment);
            throw new FileDataSource$FileDataSourceException(sbK.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }

    @Override // defpackage.r24
    public final void close() {
        this.Y = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.X;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } finally {
            this.X = null;
            if (this.s0) {
                this.s0 = false;
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
        long j = this.Z;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.X;
            int i3 = maf.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.Z -= i4;
                b(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }
}
