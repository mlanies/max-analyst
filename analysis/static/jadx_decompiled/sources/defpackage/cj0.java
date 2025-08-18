package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public abstract class cj0 implements af8 {
    public final Context a;
    public final zi5 b;
    public final y7d c;
    public final yx4 d;
    public final adb e;
    public final Handler f = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();

    public cj0(Context context, yx4 yx4Var, zi5 zi5Var, y7d y7dVar, f6a f6aVar, o45 o45Var) {
        this.a = context;
        this.d = yx4Var;
        this.b = zi5Var;
        this.c = y7dVar;
        this.e = new adb(context, f6aVar, o45Var);
    }

    public final String a(String str, String str2) throws Throwable {
        int iLastIndexOf;
        InputStream inputStreamOpenInputStream;
        Context context = this.a;
        int i = tfg.c;
        InputStream inputStream = null;
        absolutePath = null;
        String absolutePath = null;
        String strSubstring = (!oag.t(str2) && (iLastIndexOf = str2.lastIndexOf(".")) >= 0) ? str2.substring(iLastIndexOf + 1) : null;
        String strReplaceAll = oag.t(str) ? null : str.replaceAll(":", "_").replaceAll("//", "_").replaceAll("/", "_");
        hm9.m("tfg", "copyFromUri: generate file name from uri: uri = %s, generated name = %s", str, strReplaceAll);
        File fileO = ((kk5) this.b).o(strReplaceAll, strSubstring);
        hm9.m("tfg", "copyFromUri fromUriString = %s, copy = %s", str, fileO.getAbsolutePath());
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
            try {
                try {
                    s5c.I(inputStreamOpenInputStream, fileO);
                    absolutePath = fileO.getAbsolutePath();
                } catch (Exception e) {
                    e = e;
                    hm9.q("tfg", "copyFromUri: failed to copy for uri %s, e: %s", str, e.toString());
                    if (fileO.exists()) {
                        fileO.delete();
                    }
                    s5c.n(inputStreamOpenInputStream);
                    return absolutePath;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                s5c.n(inputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            s5c.n(inputStream);
            throw th;
        }
        s5c.n(inputStreamOpenInputStream);
        return absolutePath;
    }

    public final void b(File file, File file2) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(file.toString());
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 0);
        if (frameAtTime != null) {
            j47.i0(file2.toString(), frameAtTime, this.c);
            frameAtTime.recycle();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable th) {
                hm9.p("cj0", "fail to release", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x013f A[EXC_TOP_SPLITTER, PHI: r4 r14
      0x013f: PHI (r4v7 android.database.Cursor) = (r4v6 android.database.Cursor), (r4v9 android.database.Cursor) binds: [B:65:0x0160, B:55:0x013d] A[DONT_GENERATE, DONT_INLINE]
      0x013f: PHI (r14v4 ??) = (r14v23 ??), (r14v24 ??) binds: [B:65:0x0160, B:55:0x013d] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bd A[EXC_TOP_SPLITTER, PHI: r14
      0x01bd: PHI (r14v14 android.os.ParcelFileDescriptor) = (r14v13 android.os.ParcelFileDescriptor), (r14v19 android.os.ParcelFileDescriptor) binds: [B:101:0x01d8, B:93:0x01bb] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a2 A[Catch: all -> 0x018e, Exception -> 0x0192, TRY_LEAVE, TryCatch #5 {Exception -> 0x0192, blocks: (B:80:0x0189, B:86:0x0196, B:88:0x01a2, B:92:0x01b6), top: B:125:0x0189 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b6 A[Catch: all -> 0x018e, Exception -> 0x0192, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0192, blocks: (B:80:0x0189, B:86:0x0196, B:88:0x01a2, B:92:0x01b6), top: B:125:0x0189 }] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10, types: [it3] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.it3 c(java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj0.c(java.lang.String):it3");
    }

    public final xjf d(String str) throws Throwable {
        String absolutePath;
        em5 em5VarU = s36.u(this.a, Uri.parse(str));
        y7d y7dVar = this.c;
        Bitmap bitmap = (Bitmap) em5VarU.e;
        if (bitmap != null) {
            absolutePath = new File(((kk5) this.b).m(), String.valueOf(System.currentTimeMillis())).getAbsolutePath();
            j47.i0(absolutePath, bitmap, y7dVar);
            bitmap.recycle();
        } else {
            absolutePath = null;
        }
        String str2 = absolutePath;
        Point point = (Point) em5VarU.f;
        int iIntValue = point.x;
        if (iIntValue == 0) {
            iIntValue = ((Number) ((kpa) ((qyc) y7dVar).m.getValue()).a).intValue();
        }
        int i = iIntValue;
        int iIntValue2 = point.y;
        if (iIntValue2 == 0) {
            iIntValue2 = ((Number) ((kpa) ((qyc) y7dVar).m.getValue()).b).intValue();
        }
        return new xjf(em5VarU.c, str2, i, iIntValue2);
    }
}
