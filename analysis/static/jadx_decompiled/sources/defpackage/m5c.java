package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class m5c extends ki0 {
    public final Context X;
    public a34 Y;
    public AssetFileDescriptor Z;
    public FileInputStream s0;
    public long t0;
    public boolean u0;

    public m5c(Context context) {
        super(false);
        this.X = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.t24
    public final long G(a34 a34Var) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.Y = a34Var;
        d();
        Uri uriNormalizeScheme = a34Var.a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.X;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSource$RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(rh4.j(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSource$RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSource$RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.Z = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.Z.getFileDescriptor());
            this.s0 = fileInputStream;
            long j = a34Var.f;
            try {
                if (length != -1 && j > length) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.Z.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.t0 = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.t0 = size;
                        if (size < 0) {
                            throw new RawResourceDataSource$RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.t0 = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = a34Var.g;
                if (j3 != -1) {
                    long j4 = this.t0;
                    this.t0 = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.u0 = true;
                f(a34Var);
                return j3 != -1 ? j3 : this.t0;
            } catch (RawResourceDataSource$RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSource$RawResourceDataSourceException(null, e4, 2005);
        }
    }

    @Override // defpackage.t24
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
                        throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.Z = null;
                    if (this.u0) {
                        this.u0 = false;
                        c();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e2, 2000);
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
                    throw new RawResourceDataSource$RawResourceDataSourceException(null, e3, 2000);
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

    @Override // defpackage.t24
    public final Uri getUri() {
        a34 a34Var = this.Y;
        if (a34Var != null) {
            return a34Var.a;
        }
        return null;
    }

    @Override // defpackage.m24
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
                throw new RawResourceDataSource$RawResourceDataSourceException(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.s0;
        int i3 = oaf.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.t0 == -1) {
                return -1;
            }
            throw new RawResourceDataSource$RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.t0;
        if (j2 != -1) {
            this.t0 = j2 - i4;
        }
        b(i4);
        return i4;
    }
}
