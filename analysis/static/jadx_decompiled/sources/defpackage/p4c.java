package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class p4c implements qj3, ru0, b66, eqc, pj3, bvc, b7b {
    public final /* synthetic */ int a;

    public /* synthetic */ p4c(int i) {
        this.a = i;
    }

    @Override // defpackage.bvc
    public void a() {
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                int i = RangeSeekBarView.Q0;
                hm9.p("ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView", "TimeLineView error occurred", (Throwable) obj);
                break;
            case 8:
                hm9.p("k9c", "clearRecentSearch: failed", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hm9.p("cqc", "async failed", (Throwable) obj);
                break;
            case 13:
                w4d w4dVar = cqc.a;
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Throwable th = (Throwable) obj;
                hm9.p("nd7", th.getMessage(), th);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((zqc) obj).b.release();
                break;
            case 18:
                ((arc) obj).b.release();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((j10) obj).k = -1.0f;
                break;
            case 25:
                j10 j10Var = (j10) obj;
                j10Var.i = d20.X;
                j10Var.k = -1.0f;
                break;
            case 27:
                hm9.p("o2e", "putSticker: failed", (Throwable) obj);
                break;
            default:
                hm9.p("o2e", "storeSections: failed", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        Object j3eVar;
        int i = 2;
        switch (this.a) {
            case 2:
                return Long.valueOf(((uj3) obj).n());
            case 3:
                return new q9c((e52) obj, null);
            case 4:
                return qy9.j(((e52) obj).j());
            case 5:
                return new q9c(null, (uj3) obj);
            case 6:
                return qy9.j(((e52) obj).j());
            case 7:
                q9c q9cVar = (q9c) obj;
                e52 e52Var = q9cVar.a;
                uj3 uj3Var = q9cVar.b;
                return uj3Var != null ? new kzc(4, null, Collections.emptyList(), null, uj3Var, null, 0L, null) : e52Var.I() ? new kzc(2, null, Collections.emptyList(), e52Var, null, null, 0L, null) : new kzc(1, null, Collections.emptyList(), e52Var, null, null, 0L, null);
            case 8:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
            case 25:
            default:
                return (d2e) ((Map.Entry) obj).getValue();
            case 9:
                e9c e9cVar = (e9c) obj;
                int iOrdinal = e9cVar.b.ordinal();
                if (iOrdinal == 1) {
                    return new by4(e9cVar.f.a);
                }
                if (iOrdinal == 2) {
                    j3eVar = new j3e(e9cVar.e.a, e9cVar.d);
                } else {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return new oi(e9cVar.d);
                        }
                        Locale locale = Locale.ENGLISH;
                        hm9.o("l9c", "Unknown recentDb type " + e9cVar.c);
                        return new oi();
                    }
                    try {
                        j3eVar = new vc6(b.n(Protos.Attaches.Attach.Photo.parseFrom((byte[]) e9cVar.g.c)), e9cVar.d);
                    } catch (InvalidProtocolBufferNanoException e) {
                        hm9.p("l9c", "Can't parse gif", e);
                        return new oi();
                    }
                }
                return j3eVar;
            case 10:
                return ((OneMeRoomDatabase) obj).M();
            case 11:
                d9c d9cVar = (d9c) obj;
                d9cVar.getClass();
                return new sa3(i, new ia4(11, d9cVar));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        vq7 vq7VarA = hc0.a();
                        vq7VarA.t(cursorRawQuery.getString(1));
                        vq7VarA.o = d9b.b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        vq7VarA.c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(vq7VarA.j());
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 16:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 20:
                return ((jl3) obj).a();
            case 26:
                return Long.valueOf(((d2e) obj).a);
        }
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        su0 oj6Var;
        su0 xsaVar;
        switch (this.a) {
            case 1:
                int i = bundle.getInt(Integer.toString(0, 36), -1);
                if (i != 0) {
                    if (i == 1) {
                        np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 1);
                        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
                        if (f == -1.0f) {
                            oj6Var = new xsa();
                        } else {
                            xsaVar = new xsa(f);
                        }
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalArgumentException(z7b.h(31, i, "Unknown RatingType: "));
                            }
                            np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 3);
                            return bundle.getBoolean(Integer.toString(1, 36), false) ? new kte(bundle.getBoolean(Integer.toString(2, 36), false)) : new kte();
                        }
                        np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                        int i2 = bundle.getInt(Integer.toString(1, 36), 5);
                        float f2 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                        if (f2 != -1.0f) {
                            return new zxd(i2, f2);
                        }
                        xsaVar = new zxd(i2);
                    }
                    return xsaVar;
                }
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                if (bundle.getBoolean(Integer.toString(1, 36), false)) {
                    return new oj6(bundle.getBoolean(Integer.toString(2, 36), false));
                }
                oj6Var = new oj6();
                return oj6Var;
            default:
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 2);
                int i3 = bundle.getInt(Integer.toString(1, 36), 5);
                float f3 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
                return f3 == -1.0f ? new zxd(i3) : new zxd(i3, f3);
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 21:
                return !oag.t((String) obj);
            default:
                g20 g20Var = ((l20) obj).a;
                return g20Var == g20.c || g20Var == g20.o;
        }
    }
}
