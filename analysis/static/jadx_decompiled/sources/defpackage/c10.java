package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class c10 implements qj3, b7b, b66, pj3, eqc {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ c10() {
        this.a = 19;
        this.b = 0L;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        long j = this.b;
        switch (this.a) {
            case 0:
                tpa.L((j10) obj, d20.o, j);
                break;
            case 1:
                u82 u82Var = (u82) obj;
                u82Var.L = j;
                u82Var.M = false;
                break;
            case 2:
                u82 u82Var2 = (u82) obj;
                b92 b92Var = u82Var2.p;
                if (b92Var == null) {
                    b92Var = b92.h;
                }
                a92 a92VarA = b92Var.a();
                a92VarA.a = j;
                u82Var2.p = new b92(a92VarA);
                break;
            case 3:
                u82 u82Var3 = (u82) obj;
                b92 b92Var2 = u82Var3.p;
                if (b92Var2 == null) {
                    b92Var2 = b92.h;
                }
                a92 a92VarA2 = b92Var2.a();
                a92VarA2.e = j;
                u82Var3.p = new b92(a92VarA2);
                break;
            case 4:
                ((u82) obj).x = j;
                break;
            case 5:
                u82 u82Var4 = (u82) obj;
                if (u82Var4.Y < j || j == 0) {
                    u82Var4.Y = j;
                    break;
                }
                break;
            case 6:
                u82 u82Var5 = (u82) obj;
                e92 e92Var = u82Var5.n;
                mg4 mg4Var = mg4.REGULAR;
                ArrayList arrayListH = hm9.h(e92Var, j, mg4Var);
                u82Var5.n.d(mg4Var).clear();
                e92.e(mg4Var);
                u82Var5.n.d(mg4Var).addAll(arrayListH);
                e92.e(mg4Var);
                u82Var5.Z = 0L;
                x82 x82Var = x82.f;
                u82Var5.q = x82Var;
                u82Var5.r = x82Var;
                u82Var5.s = x82Var;
                u82Var5.t = x82Var;
                u82Var5.u = x82Var;
                u82Var5.v = x82Var;
                u82Var5.w = x82Var;
                j92 j92Var = u82Var5.b;
                if (j92Var == j92.b || (j92Var == j92.a && j == u82Var5.k)) {
                    u82Var5.j = 0L;
                    u82Var5.m = 0;
                    u82Var5.q = null;
                    u82Var5.r = null;
                    u82Var5.u = null;
                    u82Var5.t = null;
                    u82Var5.s = null;
                    u82Var5.v = null;
                    u82Var5.w = null;
                    break;
                }
                break;
            case 7:
                ((u82) obj).f = j;
                break;
            case 8:
                u82 u82Var6 = (u82) obj;
                b92 b92Var3 = u82Var6.p;
                if (b92Var3 == null) {
                    b92Var3 = b92.h;
                }
                a92 a92VarA3 = b92Var3.a();
                a92VarA3.d = j;
                u82Var6.p = new b92(a92VarA3);
                break;
            case 9:
                u82 u82Var7 = (u82) obj;
                if (u82Var7.Z < j) {
                    u82Var7.Z = j;
                    break;
                }
                break;
            case 10:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 16:
            case 20:
            case 21:
            default:
                Locale locale = Locale.ENGLISH;
                hm9.p("fk9", "Can't load track for message " + j, (Throwable) obj);
                break;
            case 11:
                ((hl3) obj).r = j;
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((hl3) obj).t = j;
                break;
            case 13:
                hl3 hl3Var = (hl3) obj;
                hl3Var.j = 2;
                hl3Var.s = j;
                break;
            case LangUtils.HASH_SEED /* 17 */:
                Locale locale2 = Locale.ENGLISH;
                hm9.p("sc5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                break;
            case 18:
                Locale locale3 = Locale.ENGLISH;
                hm9.p("dd5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                break;
            case 19:
                Locale locale4 = Locale.ENGLISH;
                hm9.p("hd5", "assetsUpdate: failed request, sync=" + j, (Throwable) obj);
                break;
            case 22:
                Locale locale5 = Locale.ENGLISH;
                hm9.p("md5", "loadFromMarker: failed to load from marker=" + j, (Throwable) obj);
                break;
            case 23:
                ((x4b) obj).seekTo(j);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new qa3(((wc5) obj).a(), 2, new bc5(3, this.b, true));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                List list = (List) obj;
                return list.isEmpty() ? iqd.g(Boolean.FALSE) : new vy9(new q28(iqd.g(list), new jj9(2), 3), new c10(this.b, 16));
            case 20:
                List list2 = (List) obj;
                return list2.isEmpty() ? iqd.g(Boolean.FALSE) : new vy9(new q28(iqd.g(list2), new jj9(2), 3), new c10(this.b, 21));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                oy8 oy8Var = (oy8) obj;
                oy8Var.getClass();
                xlc xlcVarA = xlc.a(1, "SELECT * FROM message_uploads WHERE message_id = ?");
                xlcVarA.j(1, this.b);
                return new t28(new ny8(oy8Var, xlcVarA, 1));
            case 26:
                Cursor cursor = (Cursor) obj;
                cursor.moveToNext();
                return new aue(cursor.getLong(0), this.b);
            default:
                w8f w8fVar = (w8f) obj;
                w8fVar.getClass();
                return new sa3(2, new td5(w8fVar, this.b, 4));
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 10:
                if (((ve9) ((une) obj).f).Z == this.b) {
                }
                break;
            case 16:
                if (((m3e) obj).a == this.b) {
                }
                break;
            case 21:
                if (((d2e) obj).a == this.b) {
                }
                break;
            case 27:
                kzc kzcVar = (kzc) obj;
                e52 e52Var = kzcVar.o;
                if (e52Var == null || !e52Var.M() || kzcVar.o.l().n() != this.b) {
                }
                break;
            default:
                if (((p8f) obj).b == this.b) {
                }
                break;
        }
        return false;
    }

    public /* synthetic */ c10(long j, int i) {
        this.a = i;
        this.b = j;
    }
}
