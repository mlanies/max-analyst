package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Logger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.apache.http.HttpHost;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public final class zn0 extends AsyncTask {
    public final Context a;
    public Uri b;
    public final Uri c;
    public final int d;
    public final int e;
    public final qqd f;

    public zn0(Context context, Uri uri, Uri uri2, int i, int i2, qqd qqdVar) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = qqdVar;
    }

    public final void a(Uri uri, Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        Uri uri3 = this.c;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            inputStreamOpenInputStream = this.a.getContentResolver().openInputStream(uri);
            try {
                fileOutputStream = new FileOutputStream(new File(uri2.getPath()));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            if (inputStreamOpenInputStream == null) {
                throw new NullPointerException("InputStream for given input Uri is null");
            }
            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i <= 0) {
                    a14.j(fileOutputStream);
                    a14.j(inputStreamOpenInputStream);
                    this.b = uri3;
                    return;
                }
                fileOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            a14.j(fileOutputStream2);
            a14.j(inputStreamOpenInputStream);
            this.b = uri3;
            throw th;
        }
    }

    public final void b(Uri uri, Uri uri2) throws Throwable {
        yic yicVarF;
        ux uxVar;
        Uri uri3 = this.c;
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        u2a u2aVar = new u2a();
        a8g a8gVar = u2aVar.a;
        fu0 fu0Var = null;
        try {
            l84 l84Var = new l84();
            l84Var.S(uri.toString());
            yicVarF = u2aVar.b(l84Var.r()).f();
            i8c i8cVar = yicVarF.Z;
            try {
                fu0 fu0VarS = i8cVar.S();
                try {
                    OutputStream outputStreamOpenOutputStream = this.a.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Logger logger = x2a.a;
                    uxVar = new ux(outputStreamOpenOutputStream, 1, new oue());
                    try {
                        fu0VarS.K(uxVar);
                        a14.j(fu0VarS);
                        a14.j(uxVar);
                        a14.j(i8cVar);
                        a8gVar.d();
                        this.b = uri3;
                    } catch (Throwable th) {
                        th = th;
                        fu0Var = fu0VarS;
                        a14.j(fu0Var);
                        a14.j(uxVar);
                        if (yicVarF != null) {
                            a14.j(yicVarF.Z);
                        }
                        a8gVar.d();
                        this.b = uri3;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    uxVar = null;
                }
            } catch (Throwable th3) {
                th = th3;
                uxVar = null;
            }
        } catch (Throwable th4) {
            th = th4;
            yicVarF = null;
            uxVar = null;
        }
    }

    public final String c() {
        Context context = this.a;
        Uri uri = null;
        if (z7.c(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return null;
        }
        Uri uri2 = this.b;
        if (!DocumentsContract.isDocumentUri(context, uri2)) {
            if ("content".equalsIgnoreCase(uri2.getScheme())) {
                return "com.google.android.apps.photos.content".equals(uri2.getAuthority()) ? uri2.getLastPathSegment() : f8.f(context, uri2, null, null);
            }
            if ("file".equalsIgnoreCase(uri2.getScheme())) {
                return uri2.getPath();
            }
            return null;
        }
        if ("com.android.externalstorage.documents".equals(uri2.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri2).split(":");
            if (!"primary".equalsIgnoreCase(strArrSplit[0])) {
                return null;
            }
            return Environment.getExternalStorageDirectory() + "/" + strArrSplit[1];
        }
        if ("com.android.providers.downloads.documents".equals(uri2.getAuthority())) {
            String documentId = DocumentsContract.getDocumentId(uri2);
            if (TextUtils.isEmpty(documentId)) {
                return null;
            }
            try {
                return f8.f(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
            } catch (NumberFormatException e) {
                e.getMessage();
                return null;
            }
        }
        if (!"com.android.providers.media.documents".equals(uri2.getAuthority())) {
            return null;
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri2).split(":");
        String str = strArrSplit2[0];
        if ("image".equals(str)) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(str)) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(str)) {
            uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        return f8.f(context, uri, "_id=?", new String[]{strArrSplit2[1]});
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yn0 d() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn0.d():yn0");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return d();
    }

    public final void e() throws Throwable {
        String scheme = this.b.getScheme();
        boolean zEquals = HttpHost.DEFAULT_SCHEME_NAME.equals(scheme);
        Uri uri = this.c;
        if (zEquals || "https".equals(scheme)) {
            b(this.b, uri);
            return;
        }
        if (!"content".equals(scheme)) {
            if (!TextUtils.isEmpty(scheme)) {
                if (!"file".equals(scheme)) {
                    throw new IllegalArgumentException(wg0.i("Invalid Uri scheme", scheme));
                }
                return;
            } else {
                File file = new File(this.b.getPath());
                if (!file.exists()) {
                    throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Invalid uri %s", this.b));
                }
                this.b = Uri.fromFile(file);
                return;
            }
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.getContentResolver().openFileDescriptor(this.b, "r");
        try {
            if (!parcelFileDescriptorOpenFileDescriptor.getFileDescriptor().valid()) {
                String strC = c();
                File file2 = new File(strC);
                if (TextUtils.isEmpty(strC) || !file2.exists()) {
                    try {
                        a(this.b, uri);
                    } catch (IOException | NullPointerException e) {
                        throw e;
                    }
                } else {
                    this.b = Uri.fromFile(file2);
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        } catch (Throwable th) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        yn0 yn0Var = (yn0) obj;
        Exception exc = yn0Var.b;
        qqd qqdVar = this.f;
        if (exc != null) {
            ((d1f) qqdVar.b).getClass();
            return;
        }
        this.b.getPath();
        Uri uri = this.c;
        String path = uri == null ? null : uri.getPath();
        d1f d1fVar = (d1f) qqdVar.b;
        d1fVar.getClass();
        d1fVar.A0 = path;
        d1fVar.x0 = true;
        d1fVar.setImageBitmap(yn0Var.a);
    }
}
