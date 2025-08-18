package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.sdk.transfer.domain.UploadException;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.commons.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* loaded from: classes2.dex */
public final /* synthetic */ class u00 implements grd, t31, wu, qj3, ehe, mq1, StatsObserver, f5c, sbe, lag, hje, lde, s0a, u98, km7, ri8, vu, ree, eqc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u00(si8 si8Var, y9d y9dVar, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 17;
        this.b = si8Var;
        this.c = bundle;
        this.o = resultReceiver;
    }

    @Override // defpackage.ehe
    public Object a() {
        kd4 kd4Var = (kd4) this.b;
        gqc gqcVar = (gqc) kd4Var.d;
        gqcVar.getClass();
        hc0 hc0Var = (hc0) this.c;
        z8b z8bVar = hc0Var.c;
        ja0 ja0Var = (ja0) this.o;
        String str = ja0Var.a;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(z8bVar);
        }
        ((Long) gqcVar.o(new u00(gqcVar, ja0Var, hc0Var, 26))).getClass();
        kd4Var.a.a(hc0Var, 1, false);
        return null;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                u82 u82Var = (u82) obj;
                ((p82) this.b).getClass();
                Set set = (Set) this.c;
                w82 w82VarA = p82.H(u82Var, set).a();
                w82VarA.o = (d92) this.o;
                p82.a0(u82Var, set, w82VarA.a());
                break;
            default:
                zp6 zp6Var = (zp6) obj;
                oke okeVar = (oke) this.b;
                okeVar.getClass();
                boolean z = zp6Var.a;
                wd6 wd6Var = (wd6) this.o;
                if (!z) {
                    okeVar.v0 = (int) zp6Var.b;
                    long jNanoTime = System.nanoTime();
                    long j = okeVar.w0;
                    if (j == 0 || Math.abs(jNanoTime - j) > 1000000000) {
                        okeVar.w0 = jNanoTime;
                        if (wd6Var != null) {
                            int i = okeVar.v0;
                            hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
                            ((LoadEmojiFontWorker) wd6Var.b).state = new sn7(i);
                            break;
                        }
                    }
                } else {
                    je7 je7Var = okeVar.c;
                    jp jpVar = ((p7b) ((m7b) je7Var.getValue())).c;
                    ((p7b) ((m7b) je7Var.getValue())).b.getClass();
                    jpVar.m("app.extra.downloaded.emoji.font.url", "");
                    okeVar.d((File) this.c, wd6Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo131apply(Object obj) {
        String str;
        int i;
        int i2;
        long jInsert;
        rs7 rs7Var;
        String str2 = "bytes";
        Object obj2 = null;
        int i3 = 6;
        int i4 = 5;
        int i5 = 4;
        int i6 = 3;
        rs7 rs7Var2 = rs7.CACHE_FULL;
        int i7 = 2;
        Object obj3 = this.o;
        Object obj4 = this.c;
        int i8 = 0;
        Object obj5 = this.b;
        int i9 = 1;
        switch (this.a) {
            case 25:
                Cursor cursor = (Cursor) obj;
                gqc gqcVar = (gqc) obj5;
                gqcVar.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    int i10 = cursor.getInt(7) != 0 ? i9 : 0;
                    ai3 ai3Var = new ai3();
                    ai3Var.Y = new HashMap();
                    String string = cursor.getString(i9);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    ai3Var.a = string;
                    ai3Var.o = Long.valueOf(cursor.getLong(i7));
                    ai3Var.X = Long.valueOf(cursor.getLong(3));
                    if (i10 != 0) {
                        String string2 = cursor.getString(4);
                        ai3Var.c = new i05(string2 == null ? gqc.Y : new i15(string2), cursor.getBlob(5));
                        str = str2;
                        i = i9;
                        i2 = 6;
                    } else {
                        String string3 = cursor.getString(4);
                        i15 i15Var = string3 == null ? gqc.Y : new i15(string3);
                        Cursor cursorQuery = gqcVar.m().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i11 = 0;
                            int length2 = 0;
                            while (i11 < arrayList.size()) {
                                byte[] bArr2 = (byte[]) arrayList.get(i11);
                                String str3 = str2;
                                ArrayList arrayList2 = arrayList;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i11++;
                                arrayList = arrayList2;
                                str2 = str3;
                            }
                            str = str2;
                            i = 1;
                            cursorQuery.close();
                            ai3Var.c = new i05(i15Var, bArr);
                            i2 = 6;
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(i2)) {
                        ai3Var.b = Integer.valueOf(cursor.getInt(i2));
                    }
                    ((List) obj4).add(new fb0(j, (hc0) obj3, ai3Var.c()));
                    i9 = i;
                    str2 = str;
                    obj2 = null;
                    i7 = 2;
                }
                return obj2;
            case 26:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                gqc gqcVar2 = (gqc) obj5;
                long jSimpleQueryForLong = gqcVar2.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * gqcVar2.m().compileStatement("PRAGMA page_count").simpleQueryForLong();
                ka0 ka0Var = gqcVar2.o;
                ja0 ja0Var = (ja0) obj4;
                if (jSimpleQueryForLong >= ka0Var.a) {
                    gqcVar2.U(1L, rs7Var2, ja0Var.a);
                    return -1L;
                }
                hc0 hc0Var = (hc0) obj3;
                Long lN = gqc.n(sQLiteDatabase, hc0Var);
                if (lN != null) {
                    jInsert = lN.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", hc0Var.a);
                    contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(d9b.a(hc0Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = hc0Var.b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                byte[] bArr4 = ja0Var.c.b;
                int length3 = bArr4.length;
                int i12 = ka0Var.e;
                boolean z = length3 <= i12;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", ja0Var.a);
                contentValues2.put("timestamp_ms", Long.valueOf(ja0Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(ja0Var.e));
                contentValues2.put("payload_encoding", ja0Var.c.a.a);
                contentValues2.put("code", ja0Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put(ApiProtocol.PARAM_PAYLOAD, z ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(bArr4.length / i12);
                    for (int i13 = 1; i13 <= iCeil; i13++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i13 - 1) * i12, Math.min(i13 * i12, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(ja0Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                Cursor cursor2 = (Cursor) obj;
                gqc gqcVar3 = (gqc) obj5;
                gqcVar3.getClass();
                while (true) {
                    Map map = (Map) obj4;
                    if (cursor2.moveToNext()) {
                        String string4 = cursor2.getString(i8);
                        int i14 = cursor2.getInt(1);
                        rs7 rs7Var3 = rs7.REASON_UNKNOWN;
                        if (i14 != 0) {
                            if (i14 == 1) {
                                rs7Var3 = rs7.MESSAGE_TOO_OLD;
                            } else if (i14 == 2) {
                                rs7Var = rs7Var2;
                            } else if (i14 == i6) {
                                rs7Var3 = rs7.PAYLOAD_TOO_BIG;
                            } else if (i14 == i5) {
                                rs7Var3 = rs7.MAX_RETRIES_REACHED;
                            } else if (i14 == i4) {
                                rs7Var3 = rs7.INVALID_PAYLOD;
                            } else if (i14 == i3) {
                                rs7Var3 = rs7.SERVER_ERROR;
                            } else {
                                j1e.m("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i14));
                            }
                            rs7Var = rs7Var3;
                        } else {
                            rs7Var = rs7Var3;
                        }
                        long j2 = cursor2.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new ss7(j2, rs7Var));
                        i3 = 6;
                        i4 = 5;
                        i5 = 4;
                        i6 = 3;
                        i8 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            m5d m5dVar = (m5d) obj3;
                            if (!it.hasNext()) {
                                long jA = gqcVar3.b.a();
                                SQLiteDatabase sQLiteDatabaseM = gqcVar3.m();
                                sQLiteDatabaseM.beginTransaction();
                                try {
                                    aue aueVar = (aue) gqc.n0(sQLiteDatabaseM.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new c10(jA, 26));
                                    sQLiteDatabaseM.setTransactionSuccessful();
                                    sQLiteDatabaseM.endTransaction();
                                    m5dVar.c = aueVar;
                                    m5dVar.X = new xd6(new r8e(gqcVar3.m().compileStatement("PRAGMA page_size").simpleQueryForLong() * gqcVar3.m().compileStatement("PRAGMA page_count").simpleQueryForLong(), ka0.f.a));
                                    m5dVar.b = (String) gqcVar3.X.get();
                                    return new p33((aue) m5dVar.c, Collections.unmodifiableList((ArrayList) m5dVar.o), (xd6) m5dVar.X, (String) m5dVar.b);
                                } catch (Throwable th2) {
                                    sQLiteDatabaseM.endTransaction();
                                    throw th2;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i15 = xs7.c;
                            new ArrayList();
                            ((ArrayList) m5dVar.o).add(new xs7((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
        }
    }

    @Override // defpackage.ri8
    public void b(oh8 oh8Var) {
        Bundle bundle = (Bundle) this.c;
        si8 si8Var = (si8) this.b;
        if (bundle == null) {
            si8Var.getClass();
            Bundle bundle2 = Bundle.EMPTY;
        }
        ew6 ew6VarM = si8Var.f.m(oh8Var);
        ResultReceiver resultReceiver = (ResultReceiver) this.o;
        if (resultReceiver != null) {
            ew6VarM.d(new vs5(ew6VarM, 21, resultReceiver), nk4.a);
        }
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        w98 w98Var = (w98) this.b;
        w98Var.getClass();
        qr6Var.p0(w98Var.c, i, ((y9d) this.c).b(), (Bundle) this.o);
    }

    @Override // defpackage.lag
    public void d(Throwable th) {
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.b;
        frgContactAvatar.getClass();
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
        zoomableDraweeView.setZoomEnabled(false);
        frgContactAvatar.I1 = true;
        if (th != null && th.getMessage() != null && th.getMessage().contains("404")) {
            zoomableDraweeView.setVisibility(8);
            ((SlideOutLayout) this.o).findViewById(xxb.frg_unknown_attach__deleted_view).setVisibility(0);
        } else if (((lqf) ((zp) ((y8a) vl.b()).getAccessor().c(zp.class))).c()) {
            vl vlVar = vl.o;
            a14.N(1, vlVar, vlVar.getString(jpc.G));
        }
    }

    @Override // defpackage.s0a
    public void e(ez9 ez9Var) {
        vy7 vy7Var = (vy7) this.b;
        vy7Var.getClass();
        vy7.a();
        if (!ez9Var.h()) {
            Map map = vy7Var.a;
            i08 i08Var = (i08) this.c;
            sy7 sy7VarB = (sy7) map.get(i08Var);
            if (sy7VarB == null) {
                sy7VarB = vy7Var.b((Context) this.o, i08Var, false, false);
            }
            ez9Var.d(sy7VarB.b);
        }
        ez9Var.b();
    }

    public void f() {
        k8b k8bVar;
        AtomicReference atomicReference = ((q8b) ((sy4) this.b).b).u0;
        while (true) {
            k8bVar = (k8b) this.c;
            if (atomicReference.compareAndSet(k8bVar, null)) {
                k8bVar.b(p8b.a);
                break;
            } else if (atomicReference.get() != k8bVar) {
                break;
            }
        }
        b76 b76Var = k8bVar.e;
        if (b76Var != null) {
            b76Var.cancel(false);
            k8bVar.e = null;
        }
        ((ax1) this.o).f().l(k8bVar);
    }

    @Override // defpackage.ree
    public void g(cc0 cc0Var) {
        pu9 pu9Var;
        sy4 sy4Var = (sy4) this.b;
        sy4Var.getClass();
        Objects.toString(cc0Var);
        boolean z = ((ax1) this.c).p().g() == 0;
        q8b q8bVar = (q8b) sy4Var.b;
        l8b l8bVar = q8bVar.o;
        Size size = ((see) this.o).b;
        l8bVar.getClass();
        Objects.toString(cc0Var);
        Objects.toString(size);
        l8bVar.b = cc0Var.a;
        l8bVar.c = cc0Var.b;
        int i = cc0Var.c;
        l8bVar.e = i;
        l8bVar.a = size;
        l8bVar.f = z;
        l8bVar.g = cc0Var.d;
        l8bVar.d = cc0Var.e;
        if (i == -1 || ((pu9Var = q8bVar.b) != null && (pu9Var instanceof wee))) {
            q8bVar.s0 = true;
        } else {
            q8bVar.s0 = false;
        }
        q8bVar.b();
    }

    @Override // defpackage.lde
    public Object get() {
        nr7 nr7Var = (nr7) this.b;
        nr7Var.getClass();
        return new ak6((me6) ((je7) this.c).getValue(), nr7Var, (Context) this.o);
    }

    @Override // defpackage.hje
    public void h(eje ejeVar, int i) {
        ed7 ed7Var = (ed7) this.b;
        int selectedTabPosition = ed7Var.getSelectedTabPosition();
        View view = ejeVar.e;
        dd7 dd7Var = view instanceof dd7 ? (dd7) view : null;
        fd7 fd7Var = (fd7) this.c;
        if (i > y53.L((List) fd7Var.a)) {
            hm9.m0(fd7.class.getName(), "Keyboard media tabs position wrong, pos:" + i + "|size:" + ((List) fd7Var.a).size(), new Object[0]);
            return;
        }
        bd7 bd7Var = (bd7) ((List) fd7Var.a).get(i);
        Context context = ((ViewPager2) this.o).getContext();
        y5a y5aVar = new y5a(String.valueOf(bd7Var.c), i == selectedTabPosition ? 1 : 2, 56, context.getString(bd7Var.a));
        if (dd7Var != null) {
            dd7Var.setTabItem(y5aVar);
            return;
        }
        dd7 dd7Var2 = new dd7(ed7Var.getContext());
        dd7Var2.setTabItem(y5aVar);
        ejeVar.e = dd7Var2;
        gje gjeVar = ejeVar.g;
        if (gjeVar != null) {
            gjeVar.e();
        }
    }

    @Override // defpackage.t31
    public void i(m7 m7Var) {
        u31 u31Var = (u31) this.b;
        u31Var.getClass();
        o11 o11Var = ((j11) this.c).M0;
        if (o11Var != null) {
            a51 a51Var = (a51) ((List) this.o).get(m7Var.getId());
            bc7[] bc7VarArr = CallBottomPanelWidget.s0;
            ((CallBottomPanelWidget) ((sy4) o11Var).b).n0().r().l(a51Var.b());
        }
        cu3 cu3Var = u31Var.a;
        if (cu3Var != null) {
            cu3Var.dismiss();
        }
        u31Var.a = null;
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((n3b) obj).q(((m4b) ((ai3) this.b).a).c.a, ((m4b) ((ai3) this.c).a).c.a, ((Integer) this.o).intValue());
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                y00 y00Var = (y00) obj3;
                y00Var.getClass();
                Locale locale = Locale.ENGLISH;
                String strI = zr6.i("preview_", ((l20) obj2).r, "_.png");
                kk5 kk5Var = (kk5) y00Var.c;
                kk5Var.getClass();
                File fileG = kk5.g(kk5Var.b(), "previewVideoCache");
                if (!pag.k(fileG)) {
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.onError(new IllegalStateException("Preview cache directory not exist or can't read"));
                    return;
                }
                File file = new File(fileG, strI);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    Uri uriFromFile = Uri.fromFile(file);
                    iv6 iv6VarO = s36.o();
                    iv6VarO.getClass();
                    z16 z16Var = new z16(7, uriFromFile);
                    iv6VarO.f.n(z16Var);
                    iv6VarO.g.n(z16Var);
                    iv6VarO.f(wv6.a(uriFromFile), null);
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.a(file);
                    return;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 20:
                Context context = ((bn0) obj3).a;
                int iF = a14.f(context);
                Bitmap bitmap2 = new zn0(context, (Uri) obj2, null, iF, iF, null).d().a;
                if (bitmap2 == null) {
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.onError(new IllegalStateException("bitmap not decoded"));
                    return;
                }
                Bitmap bitmap3 = new zn0(context, (Uri) obj, null, iF, iF, null).d().a;
                if (bitmap3 == null) {
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.onError(new IllegalStateException("overlayBitmap not decoded"));
                    return;
                }
                int i = c37.h;
                Canvas canvas = new Canvas(bitmap2);
                float width = bitmap2.getWidth() / bitmap3.getWidth();
                canvas.scale(width, width);
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                kk5 kk5VarH = ((y8a) vl.b()).h();
                kk5VarH.getClass();
                File fileO = kk5VarH.o(null, "jpg");
                String absolutePath = fileO.getAbsolutePath();
                ph4 ph4Var = j47.X;
                j47.h0(absolutePath, bitmap2, 100, Bitmap.CompressFormat.JPEG);
                String absolutePath2 = fileO.getAbsolutePath();
                bitmap2.recycle();
                if (nqdVar.h()) {
                    return;
                }
                nqdVar.a(Uri.fromFile(new File(absolutePath2)));
                return;
            default:
                c7f c7fVar = (c7f) obj3;
                c7fVar.getClass();
                v6f v6fVar = (v6f) obj2;
                hm9.m("c7f", "copyFromUri: started for uri=%s", v6fVar.a.a);
                d7f d7fVar = v6fVar.a;
                it3 it3Var = (it3) obj;
                String strA = ((cj0) ((af8) c7fVar.g.g.getValue())).a(d7fVar.a, it3Var.c);
                if (!kj6.h(strA)) {
                    if (nqdVar.h()) {
                        return;
                    }
                    nqdVar.onError(new UploadException("failed to copy file"));
                    return;
                }
                hm9.m("c7f", "copyFromUri: finished for uri=%s", d7fVar.a);
                if (nqdVar.h()) {
                    return;
                }
                u6f u6fVarB = v6fVar.b();
                u6fVarB.b = strA;
                u6fVarB.c = it3Var.c;
                u6fVarB.f = it3Var.b;
                nqdVar.a(new v6f(u6fVarB));
                return;
        }
    }

    @Override // defpackage.sbe
    public ukg k(Object obj) {
        String string;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        t8e t8eVar = (t8e) this.o;
        String str2 = (String) obj;
        re6 re6VarC = FirebaseMessaging.c(firebaseMessaging.b);
        String strD = firebaseMessaging.d();
        String strG = firebaseMessaging.h.g();
        synchronized (re6VarC) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = t8e.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.KEY_TOKEN, str2);
                jSONObject.put("appVersion", strG);
                jSONObject.put("timestamp", jCurrentTimeMillis);
                string = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                string = null;
            }
            if (string != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) re6VarC.b).edit();
                editorEdit.putString(re6.m0(strD, str), string);
                editorEdit.commit();
            }
        }
        if (t8eVar == null || !str2.equals(t8eVar.a)) {
            fl5 fl5Var = firebaseMessaging.a;
            fl5Var.a();
            if ("[DEFAULT]".equals(fl5Var.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    fl5Var.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str2);
                new imc(firebaseMessaging.b, 1).Y(intent);
            }
        }
        return j1e.r(str2);
    }

    @Override // org.webrtc.StatsObserver
    public void onComplete(StatsReport[] statsReportArr) {
        kk4 kk4Var = (kk4) this.b;
        kk4Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        kk4Var.a.post(new vq1(kk4Var, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), (bg1) this.c, (y1e) this.o, 4));
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 5:
                ce4 ce4Var = (ce4) this.b;
                ce4Var.getClass();
                ce4Var.e(new yg3(ce4Var, (eu4) this.c, (Map) this.o, lq1Var, 2), new kc(5));
                return "Init GlRenderer";
            case 6:
                bm7 bm7Var = (bm7) this.b;
                dd4 dd4Var = new dd4(4, (oq1) bm7Var);
                Executor executor = (Executor) this.c;
                lq1Var.a(dd4Var, executor);
                ar0 ar0Var = new ar0();
                ar0Var.a = false;
                ar0Var.b = lq1Var;
                kq0.a(bm7Var, ar0Var, executor);
                return "surfaceList[" + ((Collection) this.o) + "]";
            case 7:
            default:
                ((k8b) this.b).getClass();
                yw1 yw1Var = (yw1) this.c;
                pt1 pt1Var = new pt1(lq1Var, yw1Var);
                ((List) this.o).add(pt1Var);
                yw1Var.n(ju0.k(), pt1Var);
                return "waitForCaptureResult";
            case 8:
                vs4 vs4Var = (vs4) this.b;
                vs4Var.getClass();
                vs4Var.e(new yg3(vs4Var, (eu4) this.c, (Map) this.o, lq1Var, 4), new kc(5));
                return "Init GlRenderer";
        }
    }

    public /* synthetic */ u00(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01b7 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, CameraAccessException -> 0x02ba, blocks: (B:10:0x008f, B:16:0x009e, B:17:0x00b2, B:21:0x00b8, B:22:0x00be, B:24:0x00c4, B:25:0x00d9, B:26:0x0133, B:28:0x0139, B:29:0x014f, B:31:0x0161, B:33:0x0165, B:34:0x0173, B:35:0x018d, B:37:0x0193, B:39:0x01a1, B:41:0x01a9, B:45:0x01b7, B:47:0x01c9, B:50:0x01e1, B:51:0x01ed, B:53:0x0211, B:61:0x0234, B:57:0x0219, B:59:0x021f, B:60:0x022a, B:62:0x0242, B:63:0x0263, B:65:0x0269, B:66:0x0279, B:71:0x02a9, B:72:0x02b0, B:73:0x02b8, B:69:0x0297, B:76:0x02bb, B:77:0x02c1, B:79:0x02c3, B:80:0x02d8), top: B:84:0x008f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c3 A[Catch: all -> 0x00b5, TryCatch #0 {all -> 0x00b5, CameraAccessException -> 0x02ba, blocks: (B:10:0x008f, B:16:0x009e, B:17:0x00b2, B:21:0x00b8, B:22:0x00be, B:24:0x00c4, B:25:0x00d9, B:26:0x0133, B:28:0x0139, B:29:0x014f, B:31:0x0161, B:33:0x0165, B:34:0x0173, B:35:0x018d, B:37:0x0193, B:39:0x01a1, B:41:0x01a9, B:45:0x01b7, B:47:0x01c9, B:50:0x01e1, B:51:0x01ed, B:53:0x0211, B:61:0x0234, B:57:0x0219, B:59:0x021f, B:60:0x022a, B:62:0x0242, B:63:0x0263, B:65:0x0269, B:66:0x0279, B:71:0x02a9, B:72:0x02b0, B:73:0x02b8, B:69:0x0297, B:76:0x02bb, B:77:0x02c1, B:79:0x02c3, B:80:0x02d8), top: B:84:0x008f }] */
    @Override // defpackage.wu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bm7 apply(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.apply(java.lang.Object):bm7");
    }
}
