package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.media3.database.DatabaseIOException;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class h7b implements a76, tk6, Provider, gq1 {
    public static final String[] o = {"name", "length", "last_touch_timestamp"};
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public h7b(int i) {
        this.a = i;
        switch (i) {
            case 6:
                this.b = new HashSet();
                this.c = new bkb(2);
                break;
            case 13:
                this.b = new HashMap();
                this.c = new ArrayList();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = new HashSet();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                q0e q0eVarA = r0e.a(null);
                this.b = q0eVarA;
                this.c = new w7c(q0eVarA);
                break;
            case 18:
                this.b = new CountDownLatch(1);
                this.c = new AtomicReference();
                break;
            case 21:
                this.b = new HashMap();
                break;
            default:
                this.b = new Rect();
                this.c = new Rect();
                break;
        }
    }

    public static boolean r(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            ta5.n("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        }
        if (bitmap.isMutable()) {
            return true;
        }
        ta5.n("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
        return false;
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        switch (this.a) {
            case 5:
                f17 f17Var = (f17) obj;
                e70 e70Var = (e70) this.c;
                if (!e70Var.i || e70Var.l != ((z05) this.b)) {
                    f17Var.a();
                    return;
                }
                boolean z = e70Var.o;
                f70 f70Var = e70Var.e;
                f70 f70Var2 = e70Var.d;
                if (z) {
                    c54.p(null, e70Var.p > 0);
                    if (System.nanoTime() - e70Var.p >= e70Var.f) {
                        c54.p(null, e70Var.o);
                        try {
                            f70Var2.start();
                            f70Var.stop();
                            e70Var.o = false;
                        } catch (AudioStream$AudioStreamException unused) {
                            e70Var.p = System.nanoTime();
                        }
                    }
                }
                if (!e70Var.o) {
                    f70Var = f70Var2;
                }
                if (f17Var.f.get()) {
                    throw new IllegalStateException("The buffer is submitted or canceled.");
                }
                ByteBuffer byteBuffer = f17Var.c;
                q90 q90Var = f70Var.read(byteBuffer);
                int i = q90Var.a;
                if (i > 0) {
                    if (e70Var.r) {
                        byte[] bArr = e70Var.s;
                        if (bArr == null || bArr.length < i) {
                            e70Var.s = new byte[i];
                        }
                        int iPosition = byteBuffer.position();
                        byteBuffer.put(e70Var.s, 0, i);
                        byteBuffer.limit(byteBuffer.position()).position(iPosition);
                    }
                    Executor executor = e70Var.j;
                    long j = q90Var.b;
                    if (executor != null && j - e70Var.u >= 200) {
                        e70Var.u = j;
                        l7b l7bVar = e70Var.k;
                        if (e70Var.v == 2) {
                            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
                            double dMax = 0.0d;
                            while (shortBufferAsShortBuffer.hasRemaining()) {
                                dMax = Math.max(dMax, Math.abs((int) shortBufferAsShortBuffer.get()));
                            }
                            e70Var.t = dMax / 32767.0d;
                            if (l7bVar != null) {
                                executor.execute(new c(e70Var, 11, l7bVar));
                            }
                        }
                    }
                    byteBuffer.limit(byteBuffer.position() + i);
                    long micros = TimeUnit.NANOSECONDS.toMicros(j);
                    if (f17Var.f.get()) {
                        throw new IllegalStateException("The buffer is submitted or canceled.");
                    }
                    c54.k(micros >= 0);
                    f17Var.g = micros;
                    f17Var.b();
                } else {
                    f17Var.a();
                }
                e70Var.c();
                return;
            default:
                fu1 fu1Var = (fu1) this.c;
                if (fu1Var.A0.b == 2 && fu1Var.S0 == 9) {
                    ((fu1) this.c).F(10);
                    return;
                }
                return;
        }
    }

    public uc0 b(CharSequence charSequence, Long l) {
        if (charSequence == null) {
            charSequence = "";
        }
        return oag.a(String.valueOf(new iqe(charSequence).b((Context) this.b)), l);
    }

    public iqe c(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c37.D(charSequence.toString()));
        spannableStringBuilder.setSpan(new mse(qp4.u0.b((Context) this.b).i(), new ma1(this, 1)), 0, spannableStringBuilder.length(), 17);
        return new iqe(spannableStringBuilder);
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
        fad fadVar;
        switch (this.a) {
            case 5:
                e70 e70Var = (e70) this.c;
                if (e70Var.l == ((z05) this.b) && !(th instanceof IllegalStateException)) {
                    Executor executor = e70Var.j;
                    l7b l7bVar = e70Var.k;
                    if (executor != null && l7bVar != null) {
                        executor.execute(new c(l7bVar, 8, th));
                        break;
                    }
                }
                break;
            case 9:
                if (!(th instanceof DeferrableSurface$SurfaceClosedException)) {
                    if (!(th instanceof CancellationException)) {
                        if (((fu1) this.c).S0 == 9) {
                            ((fu1) this.c).E(9, new v90(th, 4), true);
                        }
                        Objects.toString((fu1) this.c);
                        fu1 fu1Var = (fu1) this.c;
                        if (fu1Var.w0 == ((sz1) this.b)) {
                            fu1Var.D();
                            break;
                        }
                    } else {
                        ((fu1) this.c).toString();
                        break;
                    }
                } else {
                    fu1 fu1Var2 = (fu1) this.c;
                    xf4 xf4Var = ((DeferrableSurface$SurfaceClosedException) th).a;
                    Iterator it = fu1Var2.a.n().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fadVar = (fad) it.next();
                            if (fadVar.b().contains(xf4Var)) {
                            }
                        } else {
                            fadVar = null;
                        }
                    }
                    if (fadVar != null) {
                        fu1 fu1Var3 = (fu1) this.c;
                        fu1Var3.getClass();
                        zh6 zh6VarD = ju0.D();
                        dad dadVar = fadVar.f;
                        if (dadVar != null) {
                            new Throwable();
                            fu1Var3.toString();
                            zh6VarD.execute(new wt1(dadVar, 3, fadVar));
                            break;
                        }
                    }
                }
                break;
            default:
                ((un9) this.c).getClass();
                hf5 hf5Var = (hf5) this.b;
                hab habVarA = hf5Var.a();
                eab eabVar = hf5Var.b;
                habVarA.d(eabVar, "NetworkFetchProducer", th, null);
                hf5Var.a().e(eabVar, "NetworkFetchProducer", false);
                ((oj0) eabVar).h("network", "default");
                hf5Var.a.e(th);
                break;
        }
    }

    public void e(Object obj, String str) {
        HashMap map = (HashMap) this.b;
        obj.getClass();
        map.put(str, obj);
        ((ArrayList) this.c).remove(str);
    }

    public sh0 f() {
        buc bucVar = new buc();
        Context context = (Context) this.b;
        sh0 sh0Var = (sh0) this.c;
        return new sh0(3, new edc[]{bucVar, new jn(context, sh0Var), new nd2(16), new dp3(), new buc(), new y7g(context, 10, sh0Var)});
    }

    public Bitmap g(int i) {
        Object objPollFirst;
        bkb bkbVar = (bkb) this.c;
        synchronized (bkbVar) {
            qs0 qs0Var = (qs0) ((SparseArray) bkbVar.a).get(i);
            if (qs0Var == null) {
                objPollFirst = null;
            } else {
                objPollFirst = qs0Var.c.pollFirst();
                if (((qs0) bkbVar.b) != qs0Var) {
                    bkbVar.t(qs0Var);
                    qs0 qs0Var2 = (qs0) bkbVar.b;
                    if (qs0Var2 == null) {
                        bkbVar.b = qs0Var;
                        bkbVar.c = qs0Var;
                    } else {
                        qs0Var.d = qs0Var2;
                        qs0Var2.a = qs0Var;
                        bkbVar.b = qs0Var;
                    }
                }
            }
        }
        if (objPollFirst != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(objPollFirst);
            }
        }
        Bitmap bitmap = (Bitmap) objPollFirst;
        if (bitmap == null || !r(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new g99((Context) ((Provider) this.b).get(), (iz3) ((Provider) this.c).get());
    }

    public HashMap h() throws DatabaseIOException {
        try {
            ((String) this.c).getClass();
            Cursor cursorQuery = ((e34) this.b).getReadableDatabase().query((String) this.c, o, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new rw0(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @Override // defpackage.tk6
    public sk6 i() {
        return new lt2((khe) ((je7) this.b), ((v4) this.c).d(yu2.class));
    }

    public Long j(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT long_value FROM Preference where `key`=?");
        xlcVarA.f(1, str);
        ilc ilcVar = (ilc) this.b;
        ilcVar.b();
        Long lValueOf = null;
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            if (cursorO.moveToFirst() && !cursorO.isNull(0)) {
                lValueOf = Long.valueOf(cursorO.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }

    public Integer k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2 != null && bigInteger != null) {
            BigInteger bigInteger3 = (BigInteger) this.b;
            BigInteger bigInteger4 = (BigInteger) this.c;
            this.b = bigInteger;
            this.c = bigInteger2;
            if (bigInteger3 != null && bigInteger4 != null) {
                if (bigInteger3.compareTo(bigInteger) <= 0 && bigInteger4.compareTo(bigInteger2) <= 0) {
                    BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger3);
                    BigInteger bigIntegerSubtract2 = bigInteger2.subtract(bigInteger4);
                    if (bigIntegerSubtract.compareTo(BigInteger.ZERO) <= 0) {
                        return null;
                    }
                    int iFloatValue = (int) ((bigIntegerSubtract2.floatValue() * 100) / bigIntegerSubtract.floatValue());
                    j37 j37Var = new j37(0, 100, 1);
                    if (j37Var.isEmpty()) {
                        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + j37Var + '.');
                    }
                    Integer num = 0;
                    if (iFloatValue < num.intValue()) {
                        Integer num2 = 0;
                        iFloatValue = num2.intValue();
                    } else {
                        int i = j37Var.b;
                        if (iFloatValue > Integer.valueOf(i).intValue()) {
                            iFloatValue = Integer.valueOf(i).intValue();
                        }
                    }
                    return Integer.valueOf(iFloatValue);
                }
                this.b = null;
                this.c = null;
            }
        }
        return null;
    }

    public synchronized Map l() {
        try {
            if (((Map) this.c) == null) {
                this.c = Collections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.c;
    }

    @Override // defpackage.gq1
    public void m(b8c b8cVar, yic yicVar) {
        ((ry1) this.b).resumeWith(yicVar);
    }

    public void n(String str) {
        djb djbVar;
        boolean z;
        if (str == null || w9e.C0(str)) {
            return;
        }
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("commands");
            if (jSONObjectOptJSONObject == null || (djbVar = (djb) this.c) == null) {
                return;
            }
            long jOptLong = jSONObjectOptJSONObject.optLong("globalShutdownMs");
            Long lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("featureShutdownMs"));
            String str2 = (String) this.b;
            if (str2 == null) {
                lValueOf = null;
            }
            jSONObjectOptJSONObject.optLong("tagShutdownMs");
            SharedPreferences.Editor editorEdit = djbVar.h().edit();
            boolean z2 = true;
            if (jOptLong > 0) {
                editorEdit.putLong("system.shutdown.until.ts", System.currentTimeMillis() + jOptLong);
                z = true;
            } else {
                z = false;
            }
            if (str2 == null || lValueOf == null || lValueOf.longValue() <= 0) {
                z2 = z;
            } else {
                editorEdit.putLong(zr6.i("system.", str2, ".shutdown.until.ts"), lValueOf.longValue() + System.currentTimeMillis());
            }
            if (z2) {
                editorEdit.apply();
            }
        } catch (Exception unused) {
        }
    }

    public void o(long j) throws DatabaseIOException {
        e34 e34Var = (e34) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (hcf.a(e34Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = e34Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    hcf.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void p(g7b g7bVar) {
        ilc ilcVar = (ilc) this.b;
        ilcVar.b();
        ilcVar.c();
        try {
            ((sh) this.c).C(g7bVar);
            ilcVar.r();
        } finally {
            ilcVar.l();
        }
    }

    @Override // defpackage.gq1
    public void q(b8c b8cVar, IOException iOException) {
        ry1 ry1Var = (ry1) this.b;
        if (ry1Var.isCancelled()) {
            return;
        }
        IOException iOException2 = (IOException) this.c;
        if (iOException2 != null) {
            iOException2.initCause(iOException);
        }
        if (iOException2 != null) {
            iOException = iOException2;
        }
        ry1Var.resumeWith(new njc(iOException));
    }

    public void s(Exception exc, boolean z) {
        this.c = null;
        HashSet hashSet = (HashSet) this.b;
        zw6 zw6VarJ = zw6.j(hashSet);
        hashSet.clear();
        ls5 ls5VarL = zw6VarJ.listIterator(0);
        while (ls5VarL.hasNext()) {
            w94 w94Var = (w94) ls5VarL.next();
            w94Var.getClass();
            w94Var.j(exc, z ? 1 : 3);
        }
    }

    public void t(InputStream inputStream, int i) {
        rq8 rq8Var;
        f46.I();
        un9 un9Var = (un9) this.c;
        y7g y7gVar = (y7g) un9Var.b;
        if (i > 0) {
            y7gVar.getClass();
            rq8Var = new rq8((pq8) y7gVar.b, i);
        } else {
            y7gVar.getClass();
            rq8Var = new rq8((pq8) y7gVar.b);
        }
        ja6 ja6Var = (ja6) un9Var.c;
        byte[] bArr = (byte[]) ja6Var.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                hf5 hf5Var = (hf5) this.b;
                if (i2 < 0) {
                    ((mr0) un9Var.d).P(hf5Var);
                    un9Var.c(rq8Var, hf5Var);
                    ja6Var.e(bArr);
                    rq8Var.close();
                    f46.I();
                    return;
                }
                if (i2 > 0) {
                    rq8Var.write(bArr, 0, i2);
                    un9Var.d(rq8Var, hf5Var);
                    hf5Var.a.i(i > 0 ? rq8Var.c / i : 1.0f - ((float) Math.exp((-r4) / 50000.0d)));
                }
            } catch (Throwable th) {
                ja6Var.e(bArr);
                rq8Var.close();
                throw th;
            }
        }
    }

    public Object u() {
        Object obj;
        bkb bkbVar = (bkb) this.c;
        synchronized (bkbVar) {
            qs0 qs0Var = (qs0) bkbVar.c;
            if (qs0Var == null) {
                obj = null;
            } else {
                Object objPollLast = qs0Var.c.pollLast();
                if (qs0Var.c.isEmpty()) {
                    bkbVar.t(qs0Var);
                    ((SparseArray) bkbVar.a).remove(qs0Var.b);
                }
                obj = objPollLast;
            }
        }
        if (obj != null) {
            synchronized (this) {
                ((HashSet) this.b).remove(obj);
            }
        }
        return obj;
    }

    public void v(Set set) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((e34) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void w(w4d w4dVar, ey3 ey3Var, om8 om8Var) throws JSONException {
        String str;
        rod rodVar = (rod) ((k56) this.c).invoke();
        if (rodVar == null) {
            om8Var.invoke(new IllegalStateException("Signaling is not ready or released"));
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", "get-participant-list-chunk");
        jSONObject.put(NewHtcHomeBadger.COUNT, 0);
        int i = kc6.$EnumSwitchMapping$0[au1.s(1)];
        if (i == 1) {
            str = "GRID";
        } else if (i == 2) {
            str = "SIDE";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ADMIN";
        }
        jSONObject.put("listType", str);
        zad zadVar = (zad) w4dVar.b;
        if (zadVar instanceof yad) {
            jSONObject.put("roomId", ((yad) zadVar).a);
        }
        rodVar.j(jSONObject, new dy0(this, w4dVar, om8Var, ey3Var), new nt(this, om8Var, 5));
    }

    public void x(long j, String str, long j2) throws DatabaseIOException, SQLException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((e34) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public xy y() throws IOException {
        File file = (File) this.b;
        if (file.exists()) {
            File file2 = (File) this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                String strValueOf = String.valueOf(file);
                String strValueOf2 = String.valueOf(file2);
                new StringBuilder(strValueOf2.length() + strValueOf.length() + 37);
            }
        }
        try {
            return new xy(file, 0);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(strValueOf3.length() + 16);
                sb.append("Couldn't create ");
                sb.append(strValueOf3);
                throw new IOException(sb.toString(), e);
            }
            try {
                return new xy(file, 0);
            } catch (FileNotFoundException e2) {
                String strValueOf4 = String.valueOf(file);
                StringBuilder sb2 = new StringBuilder(strValueOf4.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(strValueOf4);
                throw new IOException(sb2.toString(), e2);
            }
        }
    }

    public void z(int i) {
        q0e q0eVar = (q0e) this.b;
        uy8 uy8Var = (uy8) q0eVar.getValue();
        if (i == 4) {
            if ((uy8Var != null ? uy8Var.a : 0) != 2) {
                return;
            }
        }
        if (i == 0) {
            i = (uy8Var != null ? uy8Var.a : 0) == 2 ? 3 : 2;
        }
        q0eVar.m(null, new uy8(i));
    }

    public /* synthetic */ h7b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ h7b(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ h7b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ h7b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public h7b(va8 va8Var) {
        this.a = 12;
        this.b = (String) va8Var.c;
        this.c = (djb) va8Var.b;
    }

    public h7b(int i, int i2, ColorSpace colorSpace) {
        this.a = 22;
        this.b = colorSpace;
        this.c = (i == -1 || i2 == -1) ? null : new kpa(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public h7b(WorkDatabase workDatabase) {
        this.a = 0;
        this.b = workDatabase;
        this.c = new sh(workDatabase, 16);
    }

    public h7b(Context context, int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.b = context;
                this.c = tu0.r(3, new x5(28, this));
                break;
            case 16:
                this.b = context;
                sh0 sh0Var = new sh0(0, (byte) 0);
                this.c = sh0Var;
                sh0Var.z(context.getApplicationInfo().sourceDir);
                break;
            default:
                this.b = context.getApplicationContext();
                this.c = "ActivityThemer";
                break;
        }
    }

    public h7b(File file) {
        this.a = 4;
        this.b = file;
        this.c = new File(String.valueOf(file.getPath()).concat(".bak"));
    }

    public h7b(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 14;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
}
