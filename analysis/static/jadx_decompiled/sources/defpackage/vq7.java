package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.common.file.FileUtils$ParentDirNotFoundException;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class vq7 implements sff, lo7, mq1, r2a, a76, bbe {
    public static final b11 X;
    public static final b11 Y;
    public static final b11 Z;
    public static vq7 s0;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    static {
        long j = -9223372036854775807L;
        X = new b11(j, 0, 5, false);
        int i = 5;
        boolean z = false;
        Y = new b11(j, 2, i, z);
        Z = new b11(j, 3, i, z);
    }

    public /* synthetic */ vq7() {
        this.a = 2;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case 10:
                ((k8b) this.o).e = null;
                break;
            default:
                kq0.y((bm7) this.c, (lq1) this.o);
                break;
        }
    }

    @Override // defpackage.r2a
    public void b() {
        ((a95) this.b).b();
        ((th4) this.c).e = true;
    }

    @Override // defpackage.lo7
    public void c() throws IOException {
        IOException iOException;
        IOException iOException2 = (IOException) this.o;
        if (iOException2 != null) {
            throw iOException2;
        }
        eo7 eo7Var = (eo7) this.c;
        if (eo7Var != null && (iOException = eo7Var.o) != null && eo7Var.X > eo7Var.b) {
            throw iOException;
        }
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        switch (this.a) {
            case 10:
                ((k8b) this.o).e = null;
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((yw1) this.c).s((iv1) it.next());
                    }
                    list.clear();
                    break;
                }
                break;
            default:
                boolean z = th instanceof CancellationException;
                lq1 lq1Var = (lq1) this.o;
                if (!z) {
                    lq1Var.b(null);
                    break;
                } else {
                    c54.p(null, lq1Var.d(new qee(zr6.l(new StringBuilder(), (String) this.b, " cancelled."), th)));
                    break;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [ir6] */
    /* JADX WARN: Type inference failed for: r0v11, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Point] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15, types: [long] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.sff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            java.lang.Object r12 = r11.c
            java.lang.String r12 = (java.lang.String) r12
            ir6 r0 = defpackage.hm9.m
            r1 = 0
            if (r0 != 0) goto La
            goto L1f
        La:
            boolean r2 = r0.c()
            if (r2 == 0) goto L1f
            us7 r2 = defpackage.us7.X
            java.lang.Object r3 = r11.b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Fetch video. Local fetcher, path "
            java.lang.String r3 = defpackage.wg0.i(r4, r3)
            r0.d(r2, r12, r3, r1)
        L1f:
            r2 = 0
            android.media.MediaMetadataRetriever r12 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L5d
            r12.<init>()     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r0 = r11.o     // Catch: java.lang.Throwable -> L52
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r11.b     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L52
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L52
            r12.setDataSource(r0, r4)     // Catch: java.lang.Throwable -> L52
            android.graphics.Point r0 = defpackage.s36.v(r12)     // Catch: java.lang.Throwable -> L52
            int r4 = defpackage.s36.r(r12)     // Catch: java.lang.Throwable -> L4f
            long r4 = (long) r4
            long r2 = defpackage.s36.t(r12)     // Catch: java.lang.Throwable -> L4d
            defpackage.m6d.c(r12, r1)     // Catch: java.lang.Throwable -> L47
            r6 = r2
            goto L7b
        L47:
            r12 = move-exception
            r1 = r0
            r9 = r2
            r2 = r4
            r4 = r9
            goto L5f
        L4d:
            r1 = move-exception
            goto L57
        L4f:
            r1 = move-exception
            r4 = r2
            goto L57
        L52:
            r0 = move-exception
            r4 = r2
            r9 = r1
            r1 = r0
            r0 = r9
        L57:
            throw r1     // Catch: java.lang.Throwable -> L58
        L58:
            r6 = move-exception
            defpackage.m6d.c(r12, r1)     // Catch: java.lang.Throwable -> L47
            throw r6     // Catch: java.lang.Throwable -> L47
        L5d:
            r12 = move-exception
            r4 = r2
        L5f:
            java.lang.Object r0 = r11.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r11.b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Can't get video params for path "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.hm9.p(r0, r6, r12)
            r0 = r1
            r6 = r4
            r4 = r2
        L7b:
            ef5 r12 = new ef5
            java.lang.Object r11 = r11.b
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            r11 = 0
            if (r0 == 0) goto L89
            int r1 = r0.x
            r3 = r1
            goto L8a
        L89:
            r3 = r11
        L8a:
            if (r0 == 0) goto L8e
            int r11 = r0.y
        L8e:
            int r5 = (int) r4
            r2 = 3
            r1 = r12
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6, r8)
            gf5 r11 = new gf5
            java.util.List r12 = java.util.Collections.singletonList(r12)
            r11.<init>(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq7.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.r2a
    public void f(hl hlVar) {
        ((up6) this.o).e = hlVar;
    }

    @Override // defpackage.bbe
    public int g(long j) {
        long[] jArr = (long[]) this.o;
        int iB = oaf.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void h(Collection collection) {
        if (collection == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                if (((ArrayList) this.o) == null) {
                    this.o = new ArrayList();
                }
                if (!((ArrayList) this.o).contains(intentFilter)) {
                    ((ArrayList) this.o).add(intentFilter);
                }
            }
        }
    }

    @Override // defpackage.bbe
    public long i(int i) {
        fm9.f(i >= 0);
        long[] jArr = (long[]) this.o;
        fm9.f(i < jArr.length);
        return jArr[i];
    }

    public hc0 j() {
        String strConcat = ((String) this.b) == null ? " backendName" : "";
        if (((z8b) this.o) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new hc0((String) this.b, (byte[]) this.c, (z8b) this.o);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public zf8 k() {
        ArrayList<? extends Parcelable> arrayList = (ArrayList) this.o;
        Bundle bundle = (Bundle) this.b;
        if (arrayList != null) {
            bundle.putParcelableArrayList("controlFilters", arrayList);
        }
        ArrayList<String> arrayList2 = (ArrayList) this.c;
        if (arrayList2 != null) {
            bundle.putStringArrayList("groupMemberIds", arrayList2);
        }
        return new zf8(bundle);
    }

    public void l() {
        eo7 eo7Var = (eo7) this.c;
        fm9.l(eo7Var);
        eo7Var.a(false);
    }

    public kg5 m() throws FileUtils$RenameException {
        o94 o94Var = (o94) this.o;
        o94Var.e.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        File fileH = o94Var.h((String) this.b);
        try {
            oag.A((File) this.c, fileH);
            if (fileH.exists()) {
                fileH.setLastModified(jCurrentTimeMillis);
            }
            return new kg5(fileH);
        } catch (FileUtils$RenameException e) {
            Throwable cause = e.getCause();
            if (cause != null && !(cause instanceof FileUtils$ParentDirNotFoundException)) {
                boolean z = cause instanceof FileNotFoundException;
            }
            int i = o94.g;
            o94Var.d.getClass();
            throw e;
        }
    }

    public boolean n() {
        return ((IOException) this.o) != null;
    }

    public boolean o() {
        return ((eo7) this.c) != null;
    }

    @Override // defpackage.bbe
    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = (List) this.b;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = (long[]) this.c;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                h4g h4gVar = (h4g) list.get(i2);
                yz3 yz3Var = h4gVar.a;
                if (yz3Var.e == -3.4028235E38f) {
                    arrayList2.add(h4gVar);
                } else {
                    arrayList.add(yz3Var);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new ye4(29));
        while (i < arrayList2.size()) {
            yz3 yz3Var2 = ((h4g) arrayList2.get(i)).a;
            arrayList.add(new yz3(yz3Var2.a, yz3Var2.b, yz3Var2.c, yz3Var2.d, (-1) - i, 1, yz3Var2.g, yz3Var2.h, yz3Var2.i, yz3Var2.n, yz3Var2.o, yz3Var2.j, yz3Var2.k, yz3Var2.l, yz3Var2.m, yz3Var2.p, yz3Var2.q));
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        lq1Var.a(new re(27, this), ju0.k());
        ((yh6) this.o).a.set(lq1Var);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void r(eg7 eg7Var) {
        du1 du1Var = (du1) this.o;
        if (du1Var != null) {
            du1Var.run();
        }
        du1 du1Var2 = new du1((gh7) this.b, eg7Var);
        this.o = du1Var2;
        ((Handler) this.c).postAtFrontOfQueue(du1Var2);
    }

    public void s(io7 io7Var) {
        eo7 eo7Var = (eo7) this.c;
        if (eo7Var != null) {
            eo7Var.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.b;
        if (io7Var != null) {
            executorService.execute(new q57(6, io7Var));
        }
        executorService.shutdown();
    }

    public void t(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.b = str;
    }

    @Override // defpackage.bbe
    public int u() {
        return ((long[]) this.o).length;
    }

    public long v(go7 go7Var, do7 do7Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        fm9.l(looperMyLooper);
        this.o = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        eo7 eo7Var = new eo7(this, looperMyLooper, go7Var, do7Var, i, jElapsedRealtime, 1);
        fm9.k(((eo7) this.c) == null);
        this.c = eo7Var;
        eo7Var.o = null;
        ((ExecutorService) this.b).execute(eo7Var);
        return jElapsedRealtime;
    }

    public void w(f9 f9Var) throws IOException {
        File file = (File) this.c;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ky3 ky3Var = new ky3(fileOutputStream);
                ky3Var.a = 0L;
                InputStream inputStreamN = ((g05) f9Var.b).n();
                if (inputStreamN == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                ((du0) f9Var.c).c.i(inputStreamN, ky3Var);
                ky3Var.flush();
                long j = ky3Var.a;
                fileOutputStream.close();
                if (file.length() == j) {
                    return;
                }
                long length = file.length();
                StringBuilder sbK = au1.k(j, "File was not written completely. Expected: ", ", found: ");
                sbK.append(length);
                throw new n94(sbK.toString());
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            lq9 lq9Var = ((o94) this.o).d;
            int i = o94.g;
            lq9Var.getClass();
            throw e;
        }
    }

    public /* synthetic */ vq7(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ vq7(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public vq7(a4c a4cVar, d4c d4cVar) {
        this.a = 3;
        this.b = a4cVar;
        this.c = d4cVar;
        this.o = new hc3();
    }

    public vq7(Context context, String str) {
        this.a = 0;
        this.b = str;
        this.o = context;
        this.c = vq7.class.getName();
    }

    public vq7(eh7 eh7Var) {
        this.a = 11;
        this.b = new gh7(eh7Var);
        this.c = new Handler();
    }

    public vq7(nw4 nw4Var) {
        this.a = 6;
        ArrayList arrayList = (ArrayList) nw4Var.b;
        this.b = arrayList != null ? new wz(arrayList) : null;
        ide ideVar = (ide) nw4Var.c;
        this.o = ideVar == null ? new x24(3, Boolean.FALSE) : ideVar;
        this.c = (ty2) nw4Var.o;
    }

    public vq7(ArrayList arrayList) {
        this.a = 14;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            h4g h4gVar = (h4g) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = h4gVar.b;
            jArr[i2 + 1] = h4gVar.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.o = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public vq7(Context context, LocationManager locationManager) {
        this.a = 13;
        this.c = new nbe();
        this.o = context;
        this.b = locationManager;
    }

    public vq7(String str) {
        this.a = 1;
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i = oaf.a;
        this.b = Executors.newSingleThreadExecutor(new pd3(2, strConcat));
    }

    public vq7(bm7 bm7Var, lq1 lq1Var, String str) {
        this.a = 12;
        this.c = bm7Var;
        this.o = lq1Var;
        this.b = str;
    }

    public vq7(String str, String str2) {
        this.a = 8;
        Bundle bundle = new Bundle();
        this.b = bundle;
        if (str != null) {
            bundle.putString("id", str);
            if (str2 != null) {
                bundle.putString("name", str2);
                return;
            }
            throw new NullPointerException("name must not be null");
        }
        throw new NullPointerException("id must not be null");
    }
}
