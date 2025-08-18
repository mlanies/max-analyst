package defpackage;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.database.DatabaseIOException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class m5d implements ox0, sya, o05, v3d, gq1 {
    public static final String[] Y = {"id", "key", "metadata"};
    public Object X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ m5d(int i) {
        this.a = i;
    }

    public static void u(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = rh4.o(str, ": EGL error: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbO.toString());
    }

    public h99 A(String str) {
        if (!((ConcurrentHashMap) this.X).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.X).containsKey(str)) {
                        try {
                            InputStream inputStreamA = ((o99) this.b).a(str);
                            ((p99) this.c).getClass();
                            Iterator it = p99.a(inputStreamA).iterator();
                            while (it.hasNext()) {
                                ((h99) this.o).e((ova) it.next());
                            }
                            ((ConcurrentHashMap) this.X).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e) {
                            throw new IllegalStateException("Failed to read file " + str, e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (h99) this.o;
    }

    public cd6 B(oh8 oh8Var) {
        ah3 ah3Var;
        synchronized (this.b) {
            ah3Var = (ah3) ((us) this.o).get(oh8Var);
        }
        if (ah3Var != null) {
            return ah3Var.b;
        }
        return null;
    }

    public void C(SQLiteDatabase sQLiteDatabase) throws SQLException {
        String str = (String) this.b;
        str.getClass();
        hcf.b(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.X;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.X) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(long r27, java.lang.String r29, defpackage.kv0 r30, defpackage.fv0 r31, kotlin.coroutines.Continuation r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m5d.D(long, java.lang.String, kv0, fv0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean E(oh8 oh8Var) {
        boolean z;
        synchronized (this.b) {
            z = ((us) this.o).get(oh8Var) != null;
        }
        return z;
    }

    public boolean F(String str) {
        String str2 = (String) this.b;
        if (str2 == null) {
            this.b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = (String) this.o;
        if (str3 == null) {
            this.o = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (((HashSet) this.X) == null) {
            HashSet hashSet = new HashSet(16);
            this.X = hashSet;
            hashSet.add((String) this.b);
            ((HashSet) this.X).add((String) this.o);
        }
        return !((HashSet) this.X).add(str);
    }

    public boolean G(oh8 oh8Var, int i) {
        ah3 ah3Var;
        synchronized (this.b) {
            ah3Var = (ah3) ((us) this.o).get(oh8Var);
        }
        ii8 ii8Var = (ii8) ((WeakReference) this.X).get();
        return ah3Var != null && ah3Var.e.a(i) && ii8Var != null && ii8Var.s.s().a(i);
    }

    public boolean H(oh8 oh8Var, int i) {
        ah3 ah3Var;
        synchronized (this.b) {
            ah3Var = (ah3) ((us) this.o).get(oh8Var);
        }
        return ah3Var != null && ah3Var.d.a(i);
    }

    public boolean I(oh8 oh8Var, y9d y9dVar) {
        ah3 ah3Var;
        synchronized (this.b) {
            ah3Var = (ah3) ((us) this.o).get(oh8Var);
        }
        if (ah3Var != null) {
            z9d z9dVar = ah3Var.d;
            z9dVar.getClass();
            y9dVar.getClass();
            if (z9dVar.a.contains(y9dVar)) {
                return true;
            }
        }
        return false;
    }

    public void J(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.o = new iof(1, this);
        ViewPager2 viewPager2 = (ViewPager2) this.X;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    public void K() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) this.o);
            EGL14.eglDestroyContext((EGLDisplay) this.b, (EGLContext) this.c);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.b);
        }
        ((Surface) this.X).release();
        this.b = EGL14.EGL_NO_DISPLAY;
        this.c = EGL14.EGL_NO_CONTEXT;
        this.o = EGL14.EGL_NO_SURFACE;
        this.X = null;
    }

    public void L(oh8 oh8Var) {
        synchronized (this.b) {
            try {
                ah3 ah3Var = (ah3) ((us) this.o).remove(oh8Var);
                if (ah3Var == null) {
                    return;
                }
                ((us) this.c).remove(ah3Var.a);
                ah3Var.b.k();
                ii8 ii8Var = (ii8) ((WeakReference) this.X).get();
                if (ii8Var == null || ii8Var.i()) {
                    return;
                }
                oaf.W(ii8Var.l, new wg3(ii8Var, oh8Var, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void M() {
        int iJ;
        int i = R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = (ViewPager2) this.X;
        zmf.h(viewPager2, R.id.accessibilityActionPageLeft);
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, R.id.accessibilityActionPageRight);
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, R.id.accessibilityActionPageUp);
        zmf.e(viewPager2, 0);
        zmf.h(viewPager2, R.id.accessibilityActionPageDown);
        zmf.e(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iJ = viewPager2.getAdapter().j()) == 0 || !viewPager2.F0) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        oof oofVar = (oof) this.c;
        nof nofVar = (nof) this.b;
        if (orientation != 0) {
            if (viewPager2.o < iJ - 1) {
                zmf.i(viewPager2, new f4(R.id.accessibilityActionPageDown), nofVar);
            }
            if (viewPager2.o > 0) {
                zmf.i(viewPager2, new f4(R.id.accessibilityActionPageUp), oofVar);
                return;
            }
            return;
        }
        boolean z = viewPager2.u0.H() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.o < iJ - 1) {
            zmf.i(viewPager2, new f4(i2), nofVar);
        }
        if (viewPager2.o > 0) {
            zmf.i(viewPager2, new f4(i), oofVar);
        }
    }

    @Override // defpackage.ox0
    public void a(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((e34) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                C(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    r(writableDatabase, (mx0) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.o).clear();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.o05
    public void b(EncodeException encodeException) {
        if (((adc) this.X).W == null) {
            ((tj3) this.c).accept(encodeException);
        }
    }

    @Override // defpackage.ox0
    public void c(mx0 mx0Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.o;
        int i = mx0Var.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    @Override // defpackage.o05
    public void d() {
        ((lq1) this.b).b(null);
    }

    @Override // defpackage.ox0
    public void e(mx0 mx0Var) {
        ((SparseArray) this.o).put(mx0Var.a, mx0Var);
    }

    @Override // defpackage.ox0
    public boolean f() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((e34) this.c).getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            return hcf.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.sya
    public mn5 g(long j) {
        Object next;
        Iterator it = ((Set) ((AtomicReference) ((x3c) this.b).Y).get()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((gza) next).a == j) {
                break;
            }
        }
        gza gzaVar = (gza) next;
        lz4 lz4Var = lz4.a;
        if (gzaVar == null) {
            return lz4Var;
        }
        int iOrdinal = gzaVar.b.ordinal();
        if (iOrdinal == 0) {
            return ((sya) this.X).g(j);
        }
        if (iOrdinal != 1) {
            return lz4Var;
        }
        return od2.M(new t03(((ds3) ((je7) this.c).getValue()).c(((hyc) ((q33) ((je7) this.o).getValue())).t() ^ j), 11), new eza(j, null));
    }

    @Override // defpackage.ox0
    public void h(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.o;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((e34) this.c).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    mx0 mx0Var = (mx0) sparseArray.valueAt(i);
                    if (mx0Var == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.X;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        r(writableDatabase, mx0Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ox0
    public void i(long j) {
        String hexString = Long.toHexString(j);
        this.b = hexString;
        this.X = wg0.i("ExoPlayerCacheIndex", hexString);
    }

    @Override // defpackage.o05
    public void j(d05 d05Var) throws Exception {
        adc adcVar = (adc) this.X;
        if (adcVar.f0 == 3) {
            d05Var.close();
            throw new AssertionError("Audio is not enabled but audio encoded data is being produced.");
        }
        MediaMuxer mediaMuxer = adcVar.C;
        nb0 nb0Var = (nb0) this.o;
        if (mediaMuxer == null) {
            if (!adcVar.r) {
                adcVar.V.f(new et0(d05Var));
                if (adcVar.U != null) {
                    adcVar.C(nb0Var);
                }
            }
            d05Var.close();
            return;
        }
        try {
            adcVar.J(d05Var, nb0Var);
            d05Var.close();
        } catch (Throwable th) {
            try {
                d05Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ox0
    public void k(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        e34 e34Var = (e34) this.c;
        fm9.k(((SparseArray) this.o).size() == 0);
        try {
            SQLiteDatabase readableDatabase = e34Var.getReadableDatabase();
            String str = (String) this.b;
            str.getClass();
            if (hcf.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = e34Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = e34Var.getReadableDatabase();
            String str2 = (String) this.X;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, Y, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new mx0(i, string, bwf.c(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.ox0
    public void l() throws DatabaseIOException {
        e34 e34Var = (e34) this.c;
        String str = (String) this.b;
        str.getClass();
        try {
            String strConcat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = e34Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = hcf.a;
                try {
                    if (oaf.f0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + strConcat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.gq1
    public void m(b8c b8cVar, yic yicVar) {
        ble bleVar = (ble) this.X;
        h7b h7bVar = (h7b) this.c;
        ((w2a) this.b).e = SystemClock.elapsedRealtime();
        i8c i8cVar = yicVar.Z;
        try {
            try {
                try {
                    if (yicVar.m()) {
                        long jN = i8cVar.n();
                        if (jN < 0) {
                            jN = 0;
                        }
                        h7bVar.t(i8cVar.m(), (int) jN);
                        i8cVar.close();
                        return;
                    }
                    ad adVarB = ((y8a) vl.b()).b();
                    int i = yicVar.o;
                    if (!adVarB.a().c()) {
                        adVarB.g("HTTP_ERROR", String.valueOf(i));
                    }
                    IOException iOException = new IOException("Unexpected HTTP code " + yicVar);
                    bleVar.getClass();
                    if (b8cVar.x0) {
                        ((un9) h7bVar.c).getClass();
                        hf5 hf5Var = (hf5) h7bVar.b;
                        hf5Var.a().k(hf5Var.b, "NetworkFetchProducer");
                        hf5Var.a.c();
                    } else {
                        h7bVar.d(iOException);
                    }
                    if (i8cVar != null) {
                        try {
                            i8cVar.close();
                        } catch (Exception e) {
                            ta5.k(e);
                        }
                    }
                } catch (Exception e2) {
                    bleVar.getClass();
                    if (b8cVar.x0) {
                        ((un9) h7bVar.c).getClass();
                        hf5 hf5Var2 = (hf5) h7bVar.b;
                        hf5Var2.a().k(hf5Var2.b, "NetworkFetchProducer");
                        hf5Var2.a.c();
                    } else {
                        h7bVar.d(e2);
                    }
                    if (i8cVar != null) {
                        i8cVar.close();
                    }
                }
            } catch (Throwable th) {
                if (i8cVar != null) {
                    try {
                        i8cVar.close();
                    } catch (Exception e3) {
                        ta5.k(e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            ta5.k(e4);
        }
    }

    @Override // defpackage.o05
    public void n(q64 q64Var) {
        ((adc) this.X).I = q64Var;
    }

    public void o(nt9 nt9Var) {
        IconCompat iconCompatA = nt9Var.a();
        Notification.Action.Builder builderA = wu9.a(iconCompatA != null ? cs6.d(iconCompatA, null) : null, nt9Var.i, nt9Var.j);
        vfc[] vfcVarArr = nt9Var.c;
        if (vfcVarArr != null) {
            RemoteInput[] remoteInputArr = new RemoteInput[vfcVarArr.length];
            for (int i = 0; i < vfcVarArr.length; i++) {
                remoteInputArr[i] = vfc.a(vfcVarArr[i]);
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                uu9.c(builderA, remoteInput);
            }
        }
        Bundle bundle = nt9Var.a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z = nt9Var.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z);
        int i2 = Build.VERSION.SDK_INT;
        xu9.a(builderA, z);
        int i3 = nt9Var.f;
        bundle2.putInt("android.support.action.semanticAction", i3);
        zu9.b(builderA, i3);
        av9.c(builderA, nt9Var.g);
        if (i2 >= 31) {
            bv9.a(builderA, nt9Var.k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", nt9Var.e);
        uu9.b(builderA, bundle2);
        uu9.a((Notification.Builder) this.c, uu9.d(builderA));
    }

    public void p(Object obj, oh8 oh8Var, z9d z9dVar, k3b k3bVar) {
        synchronized (this.b) {
            try {
                oh8 oh8VarZ = z(obj);
                if (oh8VarZ == null) {
                    ((us) this.c).put(obj, oh8Var);
                    ((us) this.o).put(oh8Var, new ah3(obj, new cd6(), z9dVar, k3bVar));
                } else {
                    ah3 ah3Var = (ah3) ((us) this.o).get(oh8VarZ);
                    fm9.l(ah3Var);
                    ah3Var.d = z9dVar;
                    ah3Var.e = k3bVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gq1
    public void q(b8c b8cVar, IOException iOException) {
        ad adVarB = ((y8a) vl.b()).b();
        if (!adVarB.a().c()) {
            adVarB.g("HTTP_ERROR", iOException.getClass().getSimpleName());
        }
        if (iOException.getMessage() == null || iOException.getMessage().toLowerCase().equals("canceled")) {
            hm9.r("OkHttpNetworkFetchProducer", iOException, "onFailure for request %s", (mhc) this.o);
        }
        ble bleVar = (ble) this.X;
        h7b h7bVar = (h7b) this.c;
        bleVar.getClass();
        if (!b8cVar.x0) {
            h7bVar.d(iOException);
            return;
        }
        ((un9) h7bVar.c).getClass();
        hf5 hf5Var = (hf5) h7bVar.b;
        hf5Var.a().k(hf5Var.b, "NetworkFetchProducer");
        hf5Var.a.c();
    }

    public void r(SQLiteDatabase sQLiteDatabase, mx0 mx0Var) throws SQLException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bwf.d(mx0Var.e, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(mx0Var.a));
        contentValues.put("key", mx0Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.X;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public void s(oh8 oh8Var, int i, zg3 zg3Var) {
        synchronized (this.b) {
            try {
                ah3 ah3Var = (ah3) ((us) this.o).get(oh8Var);
                if (ah3Var != null) {
                    k3b k3bVar = ah3Var.g;
                    k3bVar.getClass();
                    rm5 rm5Var = new rm5(1);
                    rm5Var.b(k3bVar.a);
                    rm5Var.a(i);
                    ah3Var.g = new k3b(rm5Var.e());
                    ah3Var.c.add(zg3Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a8g t() {
        try {
            return new a8g(this);
        } finally {
            o43.S((o43) this.o);
            this.o = null;
            o43.U((ArrayList) this.X);
            this.X = null;
        }
    }

    public String toString() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "Pack{incomingAudio=" + ((List) this.b) + ", incomingVideo=" + ((List) this.c) + ", outgoingAudio=" + ((List) this.o) + ", outgoingVideo=" + ((List) this.X) + '}';
            default:
                return super.toString();
        }
    }

    public void v(ah3 ah3Var) {
        ii8 ii8Var = (ii8) ((WeakReference) this.X).get();
        if (ii8Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            zg3 zg3Var = (zg3) ah3Var.c.poll();
            if (zg3Var == null) {
                ah3Var.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            oaf.W(ii8Var.l, new vs5(ii8Var, z(ah3Var.a), new vq1(this, zg3Var, atomicBoolean2, ah3Var, atomicBoolean, 2), 19));
            atomicBoolean2.set(false);
        }
    }

    public void w(final oh8 oh8Var) {
        synchronized (this.b) {
            try {
                ah3 ah3Var = (ah3) ((us) this.o).get(oh8Var);
                if (ah3Var == null) {
                    return;
                }
                final k3b k3bVar = ah3Var.g;
                ah3Var.g = k3b.b;
                ah3Var.c.add(new zg3(oh8Var, k3bVar) { // from class: xg3
                    public final /* synthetic */ oh8 b;

                    @Override // defpackage.zg3
                    public final bm7 run() {
                        ii8 ii8Var = (ii8) ((WeakReference) this.a.X).get();
                        if (ii8Var != null) {
                            ii8Var.p(this.b);
                        }
                        return ew6.b;
                    }
                });
                if (ah3Var.f) {
                    return;
                }
                ah3Var.f = true;
                v(ah3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k3b x(oh8 oh8Var) {
        synchronized (this.b) {
            try {
                ah3 ah3Var = (ah3) ((us) this.o).get(oh8Var);
                if (ah3Var == null) {
                    return null;
                }
                return ah3Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zw6 y() {
        zw6 zw6VarJ;
        synchronized (this.b) {
            zw6VarJ = zw6.j(((us) this.c).values());
        }
        return zw6VarJ;
    }

    public oh8 z(Object obj) {
        oh8 oh8Var;
        synchronized (this.b) {
            oh8Var = (oh8) ((us) this.c).get(obj);
        }
        return oh8Var;
    }

    public /* synthetic */ m5d(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    public /* synthetic */ m5d(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public /* synthetic */ m5d(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public m5d(kq7 kq7Var) {
        this.a = 17;
        this.X = kq7Var;
        this.c = new Handler(Looper.getMainLooper());
        this.o = new gwe(8, this);
    }

    public m5d(x3c x3cVar, xs2 xs2Var, je7 je7Var, je7 je7Var2) {
        this.a = 11;
        this.b = x3cVar;
        this.X = xs2Var;
        this.c = je7Var;
        this.o = je7Var2;
    }

    public m5d(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = 0;
        this.b = m5d.class.getName();
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
    }

    public m5d(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = 5;
        this.c = je7Var;
        this.o = je7Var2;
        this.X = je7Var3;
        this.b = je7Var4;
    }

    public m5d(o99 o99Var, p99 p99Var, qc3 qc3Var) {
        this.a = 4;
        this.b = o99Var;
        this.c = p99Var;
        this.o = qc3Var;
        this.X = new ConcurrentHashMap();
    }

    public m5d(ii8 ii8Var) {
        this.a = 7;
        this.c = new us();
        this.o = new us();
        this.b = new Object();
        this.X = new WeakReference(ii8Var);
    }

    public m5d(bu9 bu9Var) {
        int i;
        Bundle bundle;
        Bundle[] bundleArr;
        ArrayList arrayList;
        nt9 nt9VarP;
        m5d m5dVar = this;
        m5dVar.a = 10;
        new ArrayList();
        m5dVar.X = new Bundle();
        m5dVar.o = bu9Var;
        Context context = bu9Var.a;
        m5dVar.b = context;
        Notification.Builder builderA = yu9.a(context, bu9Var.z);
        m5dVar.c = builderA;
        Notification notification = bu9Var.F;
        Bundle[] bundleArr2 = null;
        int i2 = 2;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(bu9Var.e).setContentText(bu9Var.f).setContentInfo(null).setContentIntent(bu9Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(bu9Var.h, (notification.flags & 128) != 0).setNumber(bu9Var.j).setProgress(bu9Var.o, bu9Var.p, bu9Var.q);
        IconCompat iconCompat = bu9Var.i;
        wu9.b(builderA, iconCompat == null ? null : cs6.d(iconCompat, context));
        builderA.setSubText(null).setUsesChronometer(bu9Var.m).setPriority(bu9Var.k);
        pu9 pu9Var = bu9Var.n;
        if (pu9Var instanceof gu9) {
            gu9 gu9Var = (gu9) pu9Var;
            int i3 = uub.ic_call_decline;
            PendingIntent pendingIntent = gu9Var.h;
            if (pendingIntent == null) {
                nt9VarP = gu9Var.p(i3, r0c.call_notification_hang_up_action, ctb.call_notification_decline_color, gu9Var.i);
            } else {
                nt9VarP = gu9Var.p(i3, r0c.call_notification_decline_action, ctb.call_notification_decline_color, pendingIntent);
            }
            int i4 = uub.ic_call_answer;
            PendingIntent pendingIntent2 = gu9Var.g;
            nt9 nt9VarP2 = pendingIntent2 == null ? null : gu9Var.p(i4, r0c.call_notification_answer_action, ctb.call_notification_answer_color, pendingIntent2);
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(nt9VarP);
            ArrayList arrayList3 = ((bu9) gu9Var.b).b;
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    nt9 nt9Var = (nt9) it.next();
                    if (nt9Var.g) {
                        arrayList2.add(nt9Var);
                    } else if (!nt9Var.a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList2.add(nt9Var);
                        i2--;
                    }
                    if (nt9VarP2 != null && i2 == 1) {
                        arrayList2.add(nt9VarP2);
                        i2--;
                    }
                }
            }
            if (nt9VarP2 != null && i2 >= 1) {
                arrayList2.add(nt9VarP2);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                m5dVar.o((nt9) it2.next());
            }
        } else {
            Iterator it3 = bu9Var.b.iterator();
            while (it3.hasNext()) {
                m5dVar.o((nt9) it3.next());
            }
        }
        Bundle bundle2 = bu9Var.w;
        if (bundle2 != null) {
            ((Bundle) m5dVar.X).putAll(bundle2);
        }
        ((Notification.Builder) m5dVar.c).setShowWhen(bu9Var.l);
        uu9.i((Notification.Builder) m5dVar.c, bu9Var.u);
        uu9.g((Notification.Builder) m5dVar.c, bu9Var.r);
        uu9.j((Notification.Builder) m5dVar.c, bu9Var.t);
        uu9.h((Notification.Builder) m5dVar.c, bu9Var.s);
        vu9.b((Notification.Builder) m5dVar.c, bu9Var.v);
        vu9.c((Notification.Builder) m5dVar.c, bu9Var.x);
        vu9.f((Notification.Builder) m5dVar.c, bu9Var.y);
        vu9.d((Notification.Builder) m5dVar.c, null);
        vu9.e((Notification.Builder) m5dVar.c, notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = bu9Var.G;
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                vu9.a((Notification.Builder) m5dVar.c, (String) it4.next());
            }
        }
        ArrayList arrayList5 = bu9Var.d;
        if (arrayList5.size() > 0) {
            if (bu9Var.w == null) {
                bu9Var.w = new Bundle();
            }
            Bundle bundle3 = bu9Var.w.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList5.size()) {
                String string = Integer.toString(i5);
                nt9 nt9Var2 = (nt9) arrayList5.get(i5);
                Bundle bundle6 = new Bundle();
                IconCompat iconCompatA = nt9Var2.a();
                bundle6.putInt("icon", iconCompatA != null ? iconCompatA.e() : 0);
                bundle6.putCharSequence("title", nt9Var2.i);
                bundle6.putParcelable("actionIntent", nt9Var2.j);
                Bundle bundle7 = nt9Var2.a;
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", nt9Var2.d);
                bundle6.putBundle("extras", bundle);
                vfc[] vfcVarArr = nt9Var2.c;
                if (vfcVarArr == null) {
                    arrayList = arrayList5;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[vfcVarArr.length];
                    int i6 = 0;
                    while (i6 < vfcVarArr.length) {
                        vfc vfcVar = vfcVarArr[i6];
                        ArrayList arrayList6 = arrayList5;
                        Bundle bundle8 = new Bundle();
                        vfc[] vfcVarArr2 = vfcVarArr;
                        bundle8.putString("resultKey", vfcVar.a);
                        bundle8.putCharSequence("label", vfcVar.b);
                        bundle8.putCharSequenceArray("choices", vfcVar.c);
                        bundle8.putBoolean("allowFreeFormInput", vfcVar.d);
                        bundle8.putBundle("extras", vfcVar.f);
                        Set set = vfcVar.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList7 = new ArrayList<>(set.size());
                            Iterator it5 = set.iterator();
                            while (it5.hasNext()) {
                                arrayList7.add((String) it5.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList7);
                        }
                        bundleArr[i6] = bundle8;
                        i6++;
                        arrayList5 = arrayList6;
                        vfcVarArr = vfcVarArr2;
                    }
                    arrayList = arrayList5;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", nt9Var2.e);
                bundle6.putInt("semanticAction", nt9Var2.f);
                bundle5.putBundle(string, bundle6);
                i5++;
                bundleArr2 = null;
                arrayList5 = arrayList;
            }
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (bu9Var.w == null) {
                bu9Var.w = new Bundle();
            }
            bu9Var.w.putBundle("android.car.EXTENSIONS", bundle3);
            m5dVar = this;
            ((Bundle) m5dVar.X).putBundle("android.car.EXTENSIONS", bundle4);
        }
        ((Notification.Builder) m5dVar.c).setExtras(bu9Var.w);
        xu9.e((Notification.Builder) m5dVar.c, null);
        yu9.b((Notification.Builder) m5dVar.c, bu9Var.A);
        yu9.e((Notification.Builder) m5dVar.c, null);
        yu9.f((Notification.Builder) m5dVar.c, bu9Var.B);
        yu9.g((Notification.Builder) m5dVar.c, 0L);
        yu9.d((Notification.Builder) m5dVar.c, bu9Var.C);
        if (!TextUtils.isEmpty(bu9Var.z)) {
            ((Notification.Builder) m5dVar.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it6 = bu9Var.c.iterator();
        while (it6.hasNext()) {
            kua kuaVar = (kua) it6.next();
            Notification.Builder builder = (Notification.Builder) m5dVar.c;
            kuaVar.getClass();
            zu9.a(builder, jua.b(kuaVar));
        }
        int i7 = Build.VERSION.SDK_INT;
        av9.a((Notification.Builder) m5dVar.c, bu9Var.E);
        av9.b((Notification.Builder) m5dVar.c, null);
        if (i7 < 31 || (i = bu9Var.D) == 0) {
            return;
        }
        bv9.b((Notification.Builder) m5dVar.c, i);
    }

    public m5d() {
        this.a = 6;
        this.c = null;
        this.o = new ArrayList();
        this.X = null;
        this.b = "";
    }

    public m5d(e34 e34Var) {
        this.a = 1;
        this.c = e34Var;
        this.o = new SparseArray();
    }

    public m5d(ViewPager2 viewPager2) {
        this.a = 16;
        this.X = viewPager2;
        this.b = new nof(this);
        this.c = new oof(this);
    }
}
