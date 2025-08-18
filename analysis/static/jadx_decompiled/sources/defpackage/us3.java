package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class us3 extends ji0 {
    public final ContentResolver X;
    public Uri Y;
    public AssetFileDescriptor Z;
    public FileInputStream s0;
    public long t0;
    public boolean u0;

    public us3(Context context) {
        super(false);
        this.X = context.getContentResolver();
    }

    @Override // defpackage.r24
    public final long L(z24 z24Var) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uri = z24Var.a;
            this.Y = uri;
            d();
            boolean zEquals = "content".equals(z24Var.a.getScheme());
            ContentResolver contentResolver = this.X;
            if (zEquals) {
                Bundle bundle = new Bundle();
                if (maf.a >= 31) {
                    ts3.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.Z = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(strValueOf);
                throw new ContentDataSource$ContentDataSourceException(new IOException(sb.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.s0 = fileInputStream;
            long j = z24Var.f;
            if (length != -1 && j > length) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new ContentDataSource$ContentDataSourceException(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.t0 = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.t0 = jPosition;
                    if (jPosition < 0) {
                        throw new ContentDataSource$ContentDataSourceException(null, 2008);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.t0 = j2;
                if (j2 < 0) {
                    throw new ContentDataSource$ContentDataSourceException(null, 2008);
                }
            }
            long j3 = z24Var.g;
            if (j3 != -1) {
                long j4 = this.t0;
                this.t0 = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.u0 = true;
            f(z24Var);
            return j3 != -1 ? j3 : this.t0;
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new ContentDataSource$ContentDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.r24
    public final void close() {
        this.Y = null;
        try {
            try {
                FileInputStream fileInputStream = this.s0;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.s0 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.Z;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSource$ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.Z = null;
                    if (this.u0) {
                        this.u0 = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSource$ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.s0 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.Z;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.Z = null;
                    if (this.u0) {
                        this.u0 = false;
                        c();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSource$ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.Z = null;
                if (this.u0) {
                    this.u0 = false;
                    c();
                }
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
        long j = this.t0;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSource$ContentDataSourceException(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.s0;
        int i3 = maf.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.t0;
        if (j2 != -1) {
            this.t0 = j2 - i4;
        }
        b(i4);
        return i4;
    }
}
