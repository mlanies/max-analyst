package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.media.trim.FrgTrimVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class x72 implements qj3, lde, km7, mq1, grd, u98, eqc, ehe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ x72(xs5 xs5Var, bw4 bw4Var) {
        this.a = 5;
        this.b = xs5Var;
        this.o = bw4Var;
        this.c = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
    }

    @Override // defpackage.ehe
    public Object a() {
        t8f t8fVar = (t8f) this.b;
        long jA = t8fVar.g.a() + this.c;
        gqc gqcVar = (gqc) t8fVar.c;
        gqcVar.getClass();
        gqcVar.o(new lt1(jA, (hc0) this.o, 9));
        return null;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        e08 e08Var;
        Object obj2 = this.o;
        long j = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                u82 u82Var = (u82) obj;
                p82 p82Var = (p82) obj3;
                p82Var.getClass();
                u82Var.f0 = (uaa) obj2;
                u82Var.g0 = j;
                u82Var.h0 = ((p7b) p82Var.n).a.n();
                break;
            case 1:
                u82 u82Var2 = (u82) obj;
                p82 p82Var2 = (p82) obj3;
                p82Var2.getClass();
                cu8 cu8Var = (cu8) obj2;
                if (cu8Var != null) {
                    cu8 cu8VarJ = ((au8) p82Var2.s.get()).j(j, u82Var2.k0);
                    if (cu8VarJ == null || cu8Var.o > cu8VarJ.o) {
                        u82Var2.k0 = cu8Var.c;
                        break;
                    }
                } else {
                    u82Var2.k0 = 0L;
                    break;
                }
                break;
            case 2:
            default:
                List list = (List) obj;
                fk9 fk9Var = (fk9) obj3;
                fk9Var.getClass();
                hm9.m("fk9", "Update track for message %d: track length = %d", Long.valueOf(j), Integer.valueOf(list.size()));
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    e08 e08Var2 = (e08) obj2;
                    if (!it.hasNext()) {
                        fk9Var.o.put(Long.valueOf(j), arrayList);
                        ((el9) ((kk9) fk9Var.b)).C(arrayList, e08Var2.k);
                        ir7 ir7Var = fk9Var.C0;
                        if (ir7Var.o != -1 && (e08Var = (e08) fk9Var.c.get(Long.valueOf(ir7Var.h))) != null) {
                            fk9Var.H0.e(e08Var);
                            break;
                        }
                    } else {
                        ep3 ep3Var = (ep3) it.next();
                        d08 d08Var = new d08(ep3Var.c);
                        d08Var.b = ep3Var.a;
                        d08Var.j = ep3Var.b;
                        d08Var.k = e08Var2.k;
                        d08Var.c = j;
                        d08Var.l = ep3Var.d;
                        arrayList.add(new e08(d08Var));
                    }
                }
                break;
            case 3:
                hl3 hl3Var = (hl3) obj;
                hl3Var.b = (String) obj3;
                hl3Var.c = (String) obj2;
                hl3Var.e = j;
                break;
        }
    }

    @Override // defpackage.eqc, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) throws SQLException {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        rs7 rs7Var = (rs7) this.o;
        String string = Integer.toString(rs7Var.a);
        String str = (String) this.b;
        boolean zBooleanValue = ((Boolean) gqc.n0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string}), new p4c(16))).booleanValue();
        long j = this.c;
        int i = rs7Var.a;
        if (zBooleanValue) {
            sQLiteDatabase.execSQL(ey8.i(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        w98 w98Var = (w98) this.b;
        w98Var.getClass();
        qr6Var.i(w98Var.c, i, ((tb8) this.o).d(true), this.c);
    }

    @Override // defpackage.lde
    public Object get() {
        p82 p82Var = (p82) this.b;
        long j = this.c;
        e52 e52VarC = p82Var.C(j);
        if (e52VarC == null) {
            hm9.n("p82", "changeChatField: chat with id = " + j + " not found");
            return null;
        }
        ((sj3) this.o).accept(e52VarC);
        l92 l92VarA = p82Var.A(j);
        k92 k92Var = e52VarC.b;
        p82Var.U(j, l92VarA != null ? new l92(l92VarA.b, k92Var) : new l92(j, k92Var));
        p82Var.f0(null, new w72(p82Var, j, e52VarC, false));
        ((k24) ((c34) p82Var.l.get())).b.h(e52VarC.a, k92Var);
        return e52VarC;
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((gd) obj).e0((fd) this.b, this.o, this.c);
    }

    @Override // defpackage.grd
    public void j(nqd nqdVar) throws Throwable {
        boolean z;
        int i;
        Bitmap frameAtTime;
        FrgTrimVideo frgTrimVideo = (FrgTrimVideo) this.b;
        ed3 ed3Var = (ed3) frgTrimVideo.p1.b;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(vl.o, Uri.parse((String) this.o));
        try {
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            z = true;
        } catch (Exception e) {
            hm9.p("ru.ok.messages.media.trim.FrgTrimVideo", "Can't extract video rotation", e);
            z = false;
            i = 0;
        }
        long j = this.c;
        if (z) {
            ti4 ti4VarF = ((y8a) ed3Var).f();
            Context contextD0 = frgTrimVideo.d0();
            ti4VarF.getClass();
            Size sizeI = ti4.i(contextD0);
            if (i == 0 || i == 180) {
                sizeI = new Size(sizeI.getHeight(), sizeI.getWidth());
            }
            frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j * 1000, 1, sizeI.getWidth(), sizeI.getHeight());
        } else {
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j * 1000, 1);
        }
        kk5 kk5VarH = ((y8a) ed3Var).h();
        kk5VarH.getClass();
        String path = kk5VarH.o(null, null).getPath();
        ph4 ph4Var = j47.X;
        j47.h0(path, frameAtTime, 90, Bitmap.CompressFormat.JPEG);
        nqdVar.a(path);
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 5:
                xs5 xs5Var = (xs5) this.b;
                xs5Var.getClass();
                xs5Var.b.execute(new ss5(xs5Var, lq1Var, (bw4) this.o, this.c, 0));
                return "startFocusAndMetering";
            default:
                bm7 bm7Var = (bm7) this.b;
                kq0.y(bm7Var, lq1Var);
                if (!bm7Var.isDone()) {
                    long j = this.c;
                    bm7Var.d(new e76(((ScheduledExecutorService) this.o).schedule(new d76(lq1Var, bm7Var, j), j, TimeUnit.MILLISECONDS), 0), ju0.k());
                }
                return "TimeoutFuture[" + bm7Var + "]";
        }
    }

    public /* synthetic */ x72(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = j;
        this.o = obj2;
    }

    public /* synthetic */ x72(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.b = obj;
        this.o = obj2;
        this.c = j;
    }
}
