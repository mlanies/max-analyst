package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import one.me.messages.settings.MessagesSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class hj8 implements pj3, rj8, w56, qj3, b66, o1d, xs6, ys6, qa5, ra5 {
    public final /* synthetic */ int a;

    public /* synthetic */ hj8(int i) {
        this.a = i;
    }

    @Override // defpackage.qa5
    public ka5[] a() {
        return new ka5[]{new vd9()};
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((x4b) obj).E();
                break;
            case 2:
                ((x4b) obj).v();
                break;
            case 9:
                Drawable drawable = ts8.V0;
                hm9.p("ts8", "Can't save file", (Throwable) obj);
                break;
            case 11:
                m20 m20Var = (m20) obj;
                for (int i = 0; i < m20Var.b(); i++) {
                    j10 j10VarJ = m20Var.d(i).j();
                    j10VarJ.i = d20.a;
                    j10VarJ.k = 0.0f;
                    m20Var.e(i, j10VarJ.a());
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hm9.p("au8", "cancelUploadAttachAcync: failed", (Throwable) obj);
                break;
            case 13:
                j10 j10Var = (j10) obj;
                j10Var.k = 0.0f;
                j10Var.o = 0L;
                j10Var.p = 0L;
                break;
            case 27:
                ((j10) obj).i = d20.c;
                break;
            case 28:
                hm9.o("lj9", "Can't hide controls");
                break;
            default:
                hm9.o("lj9", "Can't update not started live video");
                break;
        }
    }

    @Override // defpackage.w56, defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 6:
                return Long.valueOf(((b04) obj).b);
            case 7:
                return Long.valueOf(((b04) obj).c);
            case 8:
                return zw6.j(br7.Z(new hme(16), ((zd8) obj).q().b));
            case 9:
            case 11:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case 20:
            case 21:
            case 22:
            default:
                return (kze) obj;
            case 10:
                return String.valueOf((Long) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                oy8 oy8Var = (oy8) obj;
                oy8Var.getClass();
                return new t28(new ny8(oy8Var, xlc.a(0, "SELECT * FROM message_uploads"), 0));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return f8.o((ky8) obj);
            case 16:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case LangUtils.HASH_SEED /* 17 */:
                List list2 = (List) obj;
                return list2.isEmpty() ? m28.a : f28.e(list2);
            case 18:
                oy8 oy8Var2 = (oy8) obj;
                oy8Var2.getClass();
                return new sa3(2, new ia4(7, oy8Var2));
            case 19:
                return ((OneMeRoomDatabase) obj).E();
            case 23:
                return (jze) obj;
        }
    }

    @Override // defpackage.xs6, defpackage.ys6
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 21:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
            default:
                if ((i2 != 67 || i3 != 79 || i4 != 77 || (i5 != 77 && i != 2)) && (i2 != 77 || i3 != 76 || i4 != 76 || (i5 != 84 && i != 2))) {
                }
                break;
        }
        return false;
    }

    public void e(x4b x4bVar, ph8 ph8Var) {
        j47.m0(x4bVar, ph8Var);
    }

    @Override // defpackage.o1d
    public int i(int i) {
        bc7[] bc7VarArr = MessagesSettingsScreen.Y;
        return 4;
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        switch (this.a) {
            case 1:
                au1.r(ii8Var);
                throw null;
            case 2:
            default:
                ii8Var.s(oh8Var);
                ii8Var.e.getClass();
                return fm9.F(new sad(-6));
            case 3:
                au1.r(ii8Var);
                throw null;
        }
    }

    @Override // defpackage.ra5
    /* renamed from: a, reason: collision with other method in class */
    public la5[] mo8a() {
        return new la5[]{new wd9(16, mbe.a0)};
    }
}
