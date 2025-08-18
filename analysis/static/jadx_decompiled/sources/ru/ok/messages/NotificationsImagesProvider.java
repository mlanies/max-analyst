package ru.ok.messages;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.bl4;
import defpackage.eae;
import defpackage.el4;
import defpackage.hm9;
import defpackage.hw9;
import defpackage.hz4;
import defpackage.j47;
import defpackage.kg5;
import defpackage.lg5;
import defpackage.lv6;
import defpackage.njc;
import defpackage.o84;
import defpackage.pag;
import defpackage.pjc;
import defpackage.tfg;
import defpackage.tpd;
import defpackage.vl;
import defpackage.vv6;
import defpackage.wv6;
import defpackage.ww0;
import defpackage.xv6;
import defpackage.y8a;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/messages/NotificationsImagesProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("one.me.android.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ru.ok.messages.NotificationsImagesProvider r7, defpackage.ww0 r8, defpackage.sx3 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.fw9
            if (r0 == 0) goto L16
            r0 = r10
            fw9 r0 = (defpackage.fw9) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t0 = r1
            goto L1b
        L16:
            fw9 r0 = new fw9
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            sx3 r7 = r0.Y
            ww0 r8 = r0.X
            ru.ok.messages.NotificationsImagesProvider r9 = r0.o
            defpackage.od2.a0(r10)
            r6 = r9
            r9 = r7
            r7 = r6
            goto L3e
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.od2.a0(r10)
        L3e:
            boolean r10 = defpackage.j1e.z(r9)
            if (r10 == 0) goto L66
            r7.getClass()
            java.io.File r10 = b(r8)
            if (r10 == 0) goto L55
            boolean r2 = r10.exists()
            if (r2 == 0) goto L55
            r1 = r10
            goto L67
        L55:
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r3
            r4 = 100
            java.lang.Object r10 = defpackage.j47.x(r4, r0)
            if (r10 != r1) goto L3e
            goto L67
        L66:
            r1 = 0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.NotificationsImagesProvider.a(ru.ok.messages.NotificationsImagesProvider, ww0, sx3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static File b(ww0 ww0Var) {
        kg5 kg5VarC = ((el4) ((lg5) ((bl4) lv6.g().d.get()).a.getValue())).c(ww0Var);
        if (!(kg5VarC instanceof kg5)) {
            kg5VarC = null;
        }
        if (kg5VarC != null) {
            return kg5VarC.a;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        if (eae.o0(str, "*/", false) || eae.o0(str, "image/", false)) {
            return new String[]{"image/jpeg", "image/png", "image/webp"};
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws NumberFormatException, FileNotFoundException {
        List<String> pathSegments;
        Object njcVar;
        if (!"r".equals(str)) {
            throw new SecurityException("Only read mode is supported");
        }
        if (a.match(uri) != 1 || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("Wrong uri");
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str2 = pathSegments2.get(1);
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            throw new FileNotFoundException("Failed");
        }
        String str3 = pathSegments2.get(2);
        if (str3 == null) {
            throw new FileNotFoundException("Failed");
        }
        boolean z = Boolean.parseBoolean(str3);
        Uri uriN = j47.N(str2);
        if (tfg.x(uriN, getContext(), ((y8a) vl.b()).g())) {
            hm9.p("ru.ok.messages.NotificationsImagesProvider", "openFile: failed, internal uri=" + uri, null);
            throw new SecurityException("Internal uri detected");
        }
        xv6 xv6VarD = xv6.d(uriN);
        xv6VarD.b = vv6.DISK_CACHE;
        wv6 wv6VarA = xv6VarD.a();
        o84 o84VarG = o84.g();
        o84VarG.getClass();
        tpd tpdVarD = o84VarG.d(wv6VarA.b);
        File fileB = b(tpdVarD);
        if (!pag.k(fileB) && z) {
            try {
                njcVar = (File) j47.f0(hz4.a, new hw9(this, uriN, tpdVarD, null));
            } catch (Throwable th) {
                njcVar = new njc(th);
            }
            Throwable thA = pjc.a(njcVar);
            if (thA != null) {
                hm9.p("ru.ok.messages.NotificationsImagesProvider", "fetchUriOnDiskSync: failed", thA);
                throw new FileNotFoundException("Download failed");
            }
            fileB = (File) njcVar;
        }
        if (fileB != null) {
            return ParcelFileDescriptor.open(fileB, 268435456);
        }
        hm9.n("ru.ok.messages.NotificationsImagesProvider", "openFile: no image in cache, loadFromNetwork=" + z);
        throw new FileNotFoundException("Failed");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
