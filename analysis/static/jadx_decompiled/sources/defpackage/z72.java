package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class z72 implements qj3, b7b, jm7, km7, b66, rj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ z72(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        List list = this.b;
        switch (this.a) {
            case 0:
                u82 u82Var = (u82) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    u82Var.d().put((Long) it.next(), 0L);
                }
                break;
            case 1:
                u82 u82Var2 = (u82) obj;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    u82Var2.d().remove((Long) it2.next());
                }
                break;
            case 2:
                u82 u82Var3 = (u82) obj;
                u82Var3.getClass();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    u82Var3.R.remove((Long) it3.next());
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                hm9.p("md5", String.format(Locale.ENGLISH, "onAssetsUpdate: failed to store stickers %s", list), (Throwable) obj);
                break;
            case 16:
                hm9.p("md5", String.format(Locale.ENGLISH, "removeFromFavorites: failed: ids=%s", list), (Throwable) obj);
                break;
            case 19:
                ((m20) obj).a = list;
                break;
            case 26:
                hm9.r("a4e", (Throwable) obj, "storeStickerSets: failed for sets = %s", list);
                break;
            default:
                hm9.m("eoe", "hasTasksByTypesInDb: tasks count=%d, for types=%s", (Long) obj, list);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 6:
                final od5 od5Var = (od5) obj;
                final List list = this.b;
                final int i = 0;
                return new sa3(1, new f6() { // from class: ec5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i) {
                            case 0:
                                od5Var.a(list);
                                return;
                            default:
                                List list2 = list;
                                od5 od5Var2 = od5Var;
                                ilc ilcVar = od5Var2.a;
                                ilcVar.c();
                                try {
                                    od5Var2.getClass();
                                    xlc xlcVarA = xlc.a(0, "SELECT MAX(`index`) FROM favorite_stickers");
                                    ilc ilcVar2 = od5Var2.a;
                                    ilcVar2.b();
                                    Cursor cursorO = ilcVar2.o(xlcVarA, null);
                                    try {
                                        int i2 = cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
                                        cursorO.close();
                                        xlcVarA.n();
                                        od5.b(i2 + 1, list2);
                                        ilcVar.r();
                                        return;
                                    } catch (Throwable th) {
                                        cursorO.close();
                                        xlcVarA.n();
                                        throw th;
                                    }
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            case 7:
                final od5 od5Var2 = (od5) obj;
                final List list2 = this.b;
                final int i2 = 1;
                return new sa3(1, new f6() { // from class: ec5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i2) {
                            case 0:
                                od5Var2.a(list2);
                                return;
                            default:
                                List list22 = list2;
                                od5 od5Var22 = od5Var2;
                                ilc ilcVar = od5Var22.a;
                                ilcVar.c();
                                try {
                                    od5Var22.getClass();
                                    xlc xlcVarA = xlc.a(0, "SELECT MAX(`index`) FROM favorite_stickers");
                                    ilc ilcVar2 = od5Var22.a;
                                    ilcVar2.b();
                                    Cursor cursorO = ilcVar2.o(xlcVarA, null);
                                    try {
                                        int i22 = cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
                                        cursorO.close();
                                        xlcVarA.n();
                                        od5.b(i22 + 1, list22);
                                        ilcVar.r();
                                        return;
                                    } catch (Throwable th) {
                                        cursorO.close();
                                        xlcVarA.n();
                                        throw th;
                                    }
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            case 8:
                od5 od5Var3 = (od5) obj;
                od5Var3.getClass();
                return new sa3(2, new nd5(od5Var3, this.b, 1));
            case 9:
                return new qa3(((wc5) obj).a(), 2, new z72(12, this.b));
            case 10:
                return new qa3(((wc5) obj).a(), 2, new z72(14, this.b));
            case 11:
                return new qa3(((wc5) obj).a(), 2, new z72(12, this.b));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                final fd5 fd5Var = (fd5) obj;
                final List list3 = this.b;
                final int i3 = 0;
                return new sa3(1, new f6() { // from class: vc5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i3) {
                            case 0:
                                fd5Var.a(list3);
                                return;
                            default:
                                List list4 = list3;
                                fd5 fd5Var2 = fd5Var;
                                ilc ilcVar = fd5Var2.a;
                                ilcVar.c();
                                try {
                                    fd5Var2.getClass();
                                    xlc xlcVarA = xlc.a(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                                    ilc ilcVar2 = fd5Var2.a;
                                    ilcVar2.b();
                                    Cursor cursorO = ilcVar2.o(xlcVarA, null);
                                    try {
                                        int i4 = cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
                                        cursorO.close();
                                        xlcVarA.n();
                                        fd5.b(i4 + 1, list4);
                                        ilcVar.r();
                                        return;
                                    } catch (Throwable th) {
                                        cursorO.close();
                                        xlcVarA.n();
                                        throw th;
                                    }
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            case 13:
                final fd5 fd5Var2 = (fd5) obj;
                final List list4 = this.b;
                final int i4 = 1;
                return new sa3(1, new f6() { // from class: vc5
                    @Override // defpackage.f6
                    public final void run() {
                        switch (i4) {
                            case 0:
                                fd5Var2.a(list4);
                                return;
                            default:
                                List list42 = list4;
                                fd5 fd5Var22 = fd5Var2;
                                ilc ilcVar = fd5Var22.a;
                                ilcVar.c();
                                try {
                                    fd5Var22.getClass();
                                    xlc xlcVarA = xlc.a(0, "SELECT MAX(`index`) FROM favorite_sticker_sets");
                                    ilc ilcVar2 = fd5Var22.a;
                                    ilcVar2.b();
                                    Cursor cursorO = ilcVar2.o(xlcVarA, null);
                                    try {
                                        int i42 = cursorO.moveToFirst() ? cursorO.getInt(0) : 0;
                                        cursorO.close();
                                        xlcVarA.n();
                                        fd5.b(i42 + 1, list42);
                                        ilcVar.r();
                                        return;
                                    } catch (Throwable th) {
                                        cursorO.close();
                                        xlcVarA.n();
                                        throw th;
                                    }
                                } finally {
                                    ilcVar.l();
                                }
                        }
                    }
                });
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                fd5 fd5Var3 = (fd5) obj;
                fd5Var3.getClass();
                return new sa3(2, new ed5(fd5Var3, this.b, 1));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 16:
            case LangUtils.HASH_SEED /* 17 */:
            case 18:
            case 19:
            case 20:
            default:
                b4e b4eVar = (b4e) obj;
                b4eVar.getClass();
                return new sa3(2, new uh(b4eVar, 26, this.b));
            case 21:
                d9c d9cVar = (d9c) obj;
                d9cVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM recent WHERE recent_type IN (");
                List list5 = this.b;
                int size = list5.size();
                a14.c(sb, size);
                sb.append(") ORDER BY `recent_time` DESC");
                xlc xlcVarA = xlc.a(size, sb.toString());
                Iterator it = list5.iterator();
                int i5 = 1;
                while (it.hasNext()) {
                    xlcVarA.j(i5, ((t9c) it.next()).a);
                    i5++;
                }
                return ngg.o((OneMeRoomDatabase) d9cVar.a, new String[]{"recent"}, new b9c(d9cVar, xlcVarA, 4));
            case 22:
                return new ty9(new e0a(qy9.j((List) obj), new p4c(9), 3), new z72(20, this.b), 1).v().n();
        }
    }

    @Override // defpackage.jm7, defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 4:
                ((m3b) obj).k(this.b);
                break;
            default:
                ((n3b) obj).k(this.b);
                break;
        }
    }

    @Override // defpackage.rj8
    public Object k(ii8 ii8Var, oh8 oh8Var, int i) {
        switch (this.a) {
        }
        return ii8Var.k(oh8Var, (ffc) this.b);
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !nd7.c(this.b, new c10(((fs8) obj).a, 10));
            case 20:
                return this.b.contains(((h9c) obj).a);
            case 23:
                final Long l = (Long) obj;
                final int i = 0;
                return !((Boolean) new vy9(qy9.j(this.b), new b7b() { // from class: n2e
                    @Override // defpackage.b7b
                    public final boolean test(Object obj2) {
                        switch (i) {
                            case 0:
                                if (((d2e) obj2).a == l.longValue()) {
                                }
                                break;
                            default:
                                if (((q3e) obj2).a == l.longValue()) {
                                }
                                break;
                        }
                        return false;
                    }
                }).e()).booleanValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                Map.Entry entry = (Map.Entry) obj;
                return this.b.contains(entry.getKey()) && entry.getValue() != null;
            default:
                final Long l2 = (Long) obj;
                final int i2 = 1;
                return !((Boolean) new vy9(qy9.j(this.b), new b7b() { // from class: n2e
                    @Override // defpackage.b7b
                    public final boolean test(Object obj2) {
                        switch (i2) {
                            case 0:
                                if (((d2e) obj2).a == l2.longValue()) {
                                }
                                break;
                            default:
                                if (((q3e) obj2).a == l2.longValue()) {
                                }
                                break;
                        }
                        return false;
                    }
                }).e()).booleanValue();
        }
    }
}
